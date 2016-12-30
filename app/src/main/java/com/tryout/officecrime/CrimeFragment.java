package com.tryout.officecrime;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

/**
 * Created by Kshitij on 16-12-29.
 */
public class CrimeFragment extends Fragment {
    private Crime crime;
    private EditText TitleField;
    private Button DateButton;
    private CheckBox SolvedCheckbox;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        crime = new Crime();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_crime, parent, false);
        TitleField = (EditText)view.findViewById(R.id.crime_title);
        TitleField.addTextChangedListener(new TextWatcher() {
            public void onTextChanged(
                    CharSequence c, int start, int before, int count) {
                crime.setTitle(c.toString());
            }
            public void beforeTextChanged(
                    CharSequence c, int start, int count, int after) {
                // This space intentionally left blank
            }
            public void afterTextChanged(Editable c) {
                // This one too
            }
        });
        DateButton = (Button)view.findViewById(R.id.crime_date);
        DateButton.setText(crime.getDate().toString());
        DateButton.setEnabled(false);
        SolvedCheckbox = (CheckBox)view.findViewById(R.id.crime_solved);
        SolvedCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Set the crime's solved property
                crime.setSolved(isChecked);
            }
        });
        return view;

    }
}
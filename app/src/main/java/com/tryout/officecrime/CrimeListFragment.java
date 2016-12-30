package com.tryout.officecrime;

import android.os.Bundle;
import android.support.v4.app.ListFragment;

import java.util.ArrayList;

/**
 * Created by Kshitij on 16-12-29.
 */
public class CrimeListFragment extends ListFragment {
    private ArrayList<Crime> crimes;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.crimes_title);
        crimes = CrimeLab.getCrimeLab(getActivity()).getCrimes();

    }
}

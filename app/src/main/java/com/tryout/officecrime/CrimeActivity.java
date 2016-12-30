package com.tryout.officecrime;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CrimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        FragmentManager fragmentManager = getSupportFragmentManager(); // Deriving fragment manager from Fragmentactivity
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragmentContainer);
        if (fragment.equals(null)){
            fragment = new CrimeFragment();
            fragmentManager.beginTransaction().add(R.id.fragmentContainer,fragment).commit();
            // Checks if fragment is null; if yes, then assigns a fragment and adds it to fragment manager
            // Fragment transactions deals with removing, adding, and any operations on the list
        }

    }
}

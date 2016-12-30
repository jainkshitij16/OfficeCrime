package com.tryout.officecrime;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by Kshitij on 16-12-29.
 */
public class CrimeLab {
    private static CrimeLab crimeLab;
    private Context AppContext;
    private ArrayList<Crime> crimes;


    private CrimeLab(Context AppContext) {
        this.AppContext = AppContext;
        crimes = new ArrayList<Crime>();
        for (int i = 0; i < 100; i++) {
            Crime c = new Crime();
            c.setTitle("Crime #" + i);
            c.setSolved(i % 2 == 0); // Every other one
            crimes.add(c);
        }
    }

    public static CrimeLab getCrimeLab(Context context) {
        if(crimeLab.equals(null)){
            crimeLab = new CrimeLab(context.getApplicationContext());
        }
        return crimeLab;
    }

    public ArrayList<Crime> getCrimes(){
        return crimes;
    }

    public Crime getCrime(UUID id){
        for(Crime c: crimes){
            if(c.getId().equals(id))
                return c;
        }
        return null;
    }
}

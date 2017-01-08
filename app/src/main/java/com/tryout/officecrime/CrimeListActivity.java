package com.tryout.officecrime;

import android.support.v4.app.Fragment;

/**
 * Created by Kshitij on 16-12-30.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}

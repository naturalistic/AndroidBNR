package com.devdaniel.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by b on 6/12/15.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    public Fragment createFragment() {
        return new CrimeListFragment();
    }
}

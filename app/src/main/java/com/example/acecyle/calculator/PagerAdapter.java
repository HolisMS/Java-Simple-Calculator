package com.example.acecyle.calculator;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by AceCyle on 12/5/2018.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    int NumTab ;
    public PagerAdapter(FragmentManager j, int NumTabSay){
        super(j);
        this.NumTab=NumTabSay;
    }
    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                CalculatorActivity calculatorActivity = new CalculatorActivity();
                return calculatorActivity;
            case 1:
                RumusActivity rumusActivity = new RumusActivity();
                return rumusActivity;
            case 2:
                AboutActivity aboutActivity = new AboutActivity();
                return aboutActivity;
                default:
                return null;
        }
    }
    @Override
    public int getCount(){return NumTab;}

}

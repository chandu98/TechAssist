package com.vnrvjiet.TechAssist.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.vnrvjiet.TechAssist.Fragments.BusinessFragment;
import com.vnrvjiet.TechAssist.Fragments.ScienceFragment;
import com.vnrvjiet.TechAssist.Fragments.TechnologyFragment;
import com.vnrvjiet.TechAssist.Fragments.Top_HeadlinesFragment;
import com.vnrvjiet.TechAssist.Fragments.WorldFragment;
import com.vnrvjiet.TechAssist.R;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new Top_HeadlinesFragment ();
                break;
            case 1:
                fragment = new WorldFragment ();
                break;
            case 2:
                fragment = new TechnologyFragment ();
                break;
            case 3:
                fragment = new BusinessFragment ();
                break;
            case 4:
                fragment = new ScienceFragment ();
                break;

            default:
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String pageTitle = null;
        switch (position) {
            case 0:
                pageTitle = mContext.getString(R.string.category_headlines);
                break;

            case 1:
                pageTitle = mContext.getString(R.string.category_world);
                break;
            case 2:
                pageTitle = mContext.getString(R.string.category_technology);
                break;
            case 3:
                pageTitle = mContext.getString(R.string.category_business);
                break;
            case 4:
                pageTitle = mContext.getString(R.string.category_science);
                break;
            default:
                break;
        }

        return pageTitle;
    }
}

package com.developer.speed.m_pos.data_package_one.accessible.Items_Categories_Tabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ItemCategoryAdapter extends FragmentPagerAdapter {
    private final int tabNumber;

    public ItemCategoryAdapter(FragmentManager fm, int tabNumber) {
        super(fm);
        this.tabNumber = tabNumber;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ItemsFragment();
            case 1:
                return new CategoriesFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabNumber;
    }
}

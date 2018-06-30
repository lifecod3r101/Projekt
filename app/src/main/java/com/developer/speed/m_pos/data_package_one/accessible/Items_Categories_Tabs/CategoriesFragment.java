package com.developer.speed.m_pos.data_package_one.accessible.Items_Categories_Tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.developer.speed.m_pos.R;


public class CategoriesFragment extends Fragment {
    public CategoriesFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.categories_tab_layout, container, false);
        RecyclerView categoryRecycler = rootView.findViewById(R.id.categories_recycler);
        categoryRecycler.setHasFixedSize(true);
        LinearLayoutManager categoryManager = new LinearLayoutManager(getActivity());
        categoryRecycler.setLayoutManager(categoryManager);
        return rootView;
    }
}

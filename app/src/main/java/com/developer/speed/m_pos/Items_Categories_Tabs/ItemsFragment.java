package com.developer.speed.m_pos.Items_Categories_Tabs;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.developer.speed.m_pos.R.id;
import com.developer.speed.m_pos.R.layout;

public class ItemsFragment extends Fragment {
    public ItemsFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(layout.item_tab_layout, container, false);
        RecyclerView itemAvailableRecycler = rootView.findViewById(id.available_item_card_recycler);
        itemAvailableRecycler.setHasFixedSize(true);
        LinearLayoutManager categoryManager = new LinearLayoutManager(this.getActivity());
        itemAvailableRecycler.setLayoutManager(categoryManager);
        return rootView;
    }
}

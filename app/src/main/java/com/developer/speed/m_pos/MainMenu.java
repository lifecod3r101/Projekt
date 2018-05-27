package com.developer.speed.m_pos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainMenu extends AppCompatActivity
{
    RecyclerView menuRecycler;
    MenuLayoutAdapter menuAdapter;
    List<MenuLayoutCardProperty> menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout_recycler);
        menuList=new ArrayList<>();
        menuRecycler=findViewById(R.id.menu_recycler);
        menuRecycler.setHasFixedSize(true);
        menuRecycler.setLayoutManager(new LinearLayoutManager(this));
        menuList.add(new MenuLayoutCardProperty("Sell"));
        menuList.add(new MenuLayoutCardProperty("Debts"));
        menuList.add(new MenuLayoutCardProperty("Items"));
        menuList.add(new MenuLayoutCardProperty("Transactions"));
        menuList.add(new MenuLayoutCardProperty("Premium"));
        menuAdapter=new MenuLayoutAdapter(this,menuList);
        menuRecycler.setAdapter(menuAdapter);
    }

}

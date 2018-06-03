package com.developer.speed.m_pos.Main_Menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.developer.speed.m_pos.R;

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
        menuList = new ArrayList<>();
        menuRecycler = findViewById(R.id.menu_recycler);
        menuRecycler.setHasFixedSize(true);
        menuRecycler.setLayoutManager(new LinearLayoutManager(this));
        menuList.add(new MenuLayoutCardProperty("Sell"));
        menuList.add(new MenuLayoutCardProperty("Debts"));
        menuList.add(new MenuLayoutCardProperty("Items"));
        menuList.add(new MenuLayoutCardProperty("Transactions"));
        menuList.add(new MenuLayoutCardProperty("Premium"));
        menuAdapter = new MenuLayoutAdapter(this, menuList);
        menuRecycler.setAdapter(menuAdapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

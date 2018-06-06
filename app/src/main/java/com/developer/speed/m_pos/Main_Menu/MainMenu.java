package com.developer.speed.m_pos.Main_Menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.developer.speed.m_pos.R.id;
import com.developer.speed.m_pos.R.layout;

import java.util.ArrayList;
import java.util.List;


public class MainMenu extends AppCompatActivity
{
    RecyclerView menuRecycler;
    MenuLayoutAdapter menuAdapter;
    List<MenuLayoutCardProperty> menuList;
    CardView menuCard;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(layout.menu_layout_recycler);
        this.menuList = new ArrayList<>();
        this.menuRecycler = this.findViewById(id.menu_recycler);
        this.menuRecycler.setHasFixedSize(true);
        this.menuRecycler.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.menuCard = this.findViewById(id.menu_card);
        this.menuList.add(new MenuLayoutCardProperty("Sell"));
        this.menuList.add(new MenuLayoutCardProperty("Debts"));
        this.menuList.add(new MenuLayoutCardProperty("Items"));
        this.menuList.add(new MenuLayoutCardProperty("Transactions"));
        this.menuList.add(new MenuLayoutCardProperty("Premium"));
        this.menuAdapter = new MenuLayoutAdapter(this, this.menuList);
        this.menuRecycler.setAdapter(this.menuAdapter);
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

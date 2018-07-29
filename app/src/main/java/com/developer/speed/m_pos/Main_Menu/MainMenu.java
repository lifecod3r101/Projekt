package com.developer.speed.m_pos.Main_Menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.developer.speed.m_pos.Debt_Records.DebtRecord;
import com.developer.speed.m_pos.R;
import com.developer.speed.m_pos.R.id;
import com.developer.speed.m_pos.Transactions.TransactionSection;
import com.developer.speed.m_pos.data_package_one.accessible.Items_Categories_Tabs.ItemCategoryDisplayer;
import com.developer.speed.m_pos.data_package_one.accessible.Sell_Items.SellSection;

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
        setContentView(R.layout.menu_layout_recycler);
        menuList = new ArrayList<>();
        menuRecycler = findViewById(R.id.menu_recycler);
        menuRecycler.setHasFixedSize(true);
        LinearLayoutManager menuLayoutManager = new LinearLayoutManager(this);
        menuLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        menuRecycler.setLayoutManager(menuLayoutManager);
    }

    @Override
    protected void onStart() {
        super.onStart();
        menuCard = findViewById(id.menu_card);
        menuList.add(new MenuLayoutCardProperty("Sell"));
        menuList.add(new MenuLayoutCardProperty("Debts"));
        menuList.add(new MenuLayoutCardProperty("Items"));
        menuList.add(new MenuLayoutCardProperty("Transactions"));
        menuList.add(new MenuLayoutCardProperty("Premium"));
        menuAdapter = new MenuLayoutAdapter(this, menuList);
        menuRecycler.setAdapter(menuAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        menuCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (MenuLayoutCardProperty.menuItem) {
                    case "Sell":
                        MainMenu.this.startActivity(new Intent(MainMenu.this, SellSection.class));
                        break;
                    case "Debts":
                        MainMenu.this.startActivity(new Intent(MainMenu.this, DebtRecord.class));
                        break;
                    case "Items":
                        MainMenu.this.startActivity(new Intent(MainMenu.this, ItemCategoryDisplayer.class));
                        break;
                    case "Transactions":
                        MainMenu.this.startActivity(new Intent(MainMenu.this, TransactionSection.class));
                        break;
                    case "Premium":
                        break;
                    default:
                }
            }
        });
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

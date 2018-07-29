package com.developer.speed.m_pos.data_package_one.accessible.Items_Categories_Tabs;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.OnTabSelectedListener;
import android.support.design.widget.TabLayout.Tab;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import com.developer.speed.m_pos.Item_Adder.ItemAdder;
import com.developer.speed.m_pos.R.id;
import com.developer.speed.m_pos.R.layout;

public class ItemCategoryDisplayer extends AppCompatActivity {
    AppBarLayout appBarLayout;
    TabLayout tabLayout;
    TabItem itemsTab, categoriesTab;
    ViewPager viewPager;
    FloatingActionButton floatingActionButton;
    ItemCategoryAdapter icAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.item_category_displayer_layout);
    }

    @Override
    protected void onStart() {
        super.onStart();
        appBarLayout = findViewById(id.appbar);
        tabLayout = findViewById(id.tabs);
        itemsTab = findViewById(id.items_tab);
        categoriesTab = findViewById(id.categories_tab);
        viewPager = findViewById(id.container);
        floatingActionButton = findViewById(id.fab);
        icAdapter = new ItemCategoryAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(icAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        tabLayout.addOnTabSelectedListener(new OnTabSelectedListener() {
            @Override
            public void onTabSelected(Tab tab) {
                viewPager.setCurrentItem(tab.getPosition(), true);
                if (tab.getPosition() == 1) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        floatingActionButton.setOnContextClickListener(new View.OnContextClickListener() {
                            @Override
                            public boolean onContextClick(View v) {
                                ItemCategoryDisplayer.this.startActivity(new Intent(ItemCategoryDisplayer.this, ItemAdder.class));
                                return false;
                            }
                        });
                    }
                } else {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        floatingActionButton.setOnContextClickListener(new View.OnContextClickListener() {
                            @Override
                            public boolean onContextClick(View v) {
                                LayoutInflater catInflater = LayoutInflater.from(ItemCategoryDisplayer.this.getParent());
                                View catView = catInflater.inflate(layout.category_adder_dialog, null);
                                AlertDialog catDialog = new Builder(ItemCategoryDisplayer.this.getParent()).create();
                                catDialog.setView(catView);
                                catDialog.show();
                                return false;
                            }
                        });
                    }
                }
            }

            @Override
            public void onTabUnselected(Tab tab) {

            }

            @Override
            public void onTabReselected(Tab tab) {

            }
        });

    }
}

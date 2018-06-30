package com.developer.speed.m_pos.Category_Items;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.developer.speed.m_pos.R.id;
import com.developer.speed.m_pos.R.layout;
import com.developer.speed.m_pos.data_package_one.accessible.Items_Categories_Tabs.ItemCategoryDisplayer;

import java.util.ArrayList;
import java.util.List;

public class CategoryItemSection extends AppCompatActivity {
    RecyclerView categoryItemRecycler;
    CategoryItemAdapter catItemAdapter;
    List<CategoryItemProperties> categoryItemPropertiesList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(layout.category_item_recycler);
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.categoryItemPropertiesList = new ArrayList<>();
        this.categoryItemRecycler = this.findViewById(id.category_items_recycler);
        this.categoryItemRecycler.setHasFixedSize(true);
        this.categoryItemRecycler.setLayoutManager(new LinearLayoutManager(this));
        this.catItemAdapter = new CategoryItemAdapter(this, this.categoryItemPropertiesList);
        this.categoryItemRecycler.setAdapter(this.catItemAdapter);
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
    public void onBackPressed() {
        super.onBackPressed();
        this.startActivity(new Intent(this, ItemCategoryDisplayer.class));
    }
}

package com.developer.speed.m_pos.Transactions;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.developer.speed.m_pos.R.id;
import com.developer.speed.m_pos.R.layout;

import java.util.ArrayList;
import java.util.List;

public class TransactionItemSection extends AppCompatActivity {
    RecyclerView transactItemRecycler;
    List<TransactionItemProperties> transactionItemPropertiesList;
    TransactionItemAdapter transactionItemAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.transaction_item_recycler_layout);
    }

    @Override
    protected void onStart() {
        super.onStart();
        transactionItemPropertiesList = new ArrayList<>();
        transactItemRecycler = findViewById(id.transaction_item_recycler);
        transactItemRecycler.setHasFixedSize(true);
        transactItemRecycler.setLayoutManager(new LinearLayoutManager(this));
        transactionItemAdapter = new TransactionItemAdapter(this, transactionItemPropertiesList);
        transactItemRecycler.setAdapter(transactionItemAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, TransactionSection.class));
    }
}

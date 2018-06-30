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
        this.setContentView(layout.transaction_item_recycler_layout);
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.transactionItemPropertiesList = new ArrayList<>();
        this.transactItemRecycler = this.findViewById(id.transaction_item_recycler);
        this.transactItemRecycler.setHasFixedSize(true);
        this.transactItemRecycler.setLayoutManager(new LinearLayoutManager(this));
        this.transactionItemAdapter = new TransactionItemAdapter(this, this.transactionItemPropertiesList);
        this.transactItemRecycler.setAdapter(this.transactionItemAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.startActivity(new Intent(this, TransactionSection.class));
    }
}

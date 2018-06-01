package com.developer.speed.m_pos.Transactions;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.developer.speed.m_pos.R.id;
import com.developer.speed.m_pos.R.layout;

import java.util.ArrayList;
import java.util.List;

public class TransactionSection extends AppCompatActivity
{
    RecyclerView transactRecycle;
    TransactionAdapter transactAdapter;
    List<TransactionProperties> transactProperties;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(layout.transaction_recycler_layout);
        this.transactProperties = new ArrayList<>();
        this.transactRecycle = this.findViewById(id.transaction_recycler);
        this.transactRecycle.setHasFixedSize(true);
        this.transactRecycle.setLayoutManager(new LinearLayoutManager(this));
    }
}


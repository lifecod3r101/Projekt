package com.developer.speed.m_pos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

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
        setContentView(R.layout.transaction_recycler_layout);
        transactProperties=new ArrayList<>();
        transactRecycle=findViewById(R.id.transaction_recycler);
        transactRecycle.setHasFixedSize(true);
        transactRecycle.setLayoutManager(new LinearLayoutManager(this));
    }
}

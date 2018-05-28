package com.developer.speed.m_pos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DebtRecord extends AppCompatActivity
{
    RecyclerView debtRecycle;
    TransactionAdapter debtRecordAdapter;
    List<TransactionProperties> debtRecordProperties;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.debt_record_recycler_layout);
        debtRecordProperties=new ArrayList<>();
        debtRecycle=findViewById(R.id.debt_recycler);
        debtRecycle.setHasFixedSize(true);
        debtRecycle.setLayoutManager(new LinearLayoutManager(this));
    }
}

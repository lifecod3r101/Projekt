package com.developer.speed.m_pos.Debt_Records;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.developer.speed.m_pos.R;
import com.developer.speed.m_pos.Transactions.TransactionAdapter;
import com.developer.speed.m_pos.Transactions.TransactionProperties;

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
        this.setContentView(R.layout.debt_record_recycler_layout);
        this.debtRecordProperties = new ArrayList<>();
        this.debtRecycle = this.findViewById(R.id.debt_recycler);
        this.debtRecycle.setHasFixedSize(true);
        this.debtRecycle.setLayoutManager(new LinearLayoutManager(this));
    }
}

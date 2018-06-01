package com.developer.speed.m_pos.Debt_Items;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.developer.speed.m_pos.R.id;
import com.developer.speed.m_pos.R.layout;

import java.util.ArrayList;
import java.util.List;
public class DebtRecordItemSection extends AppCompatActivity
{
    RecyclerView debtRecordItemRecycler;
    DebtRecordItemAdapter myDebtRecordItemAdapter;
    List<DebtRecordItemProperty> myDebtRecordItemProperty;
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(layout.debt_item_recycler_layout);
        this.myDebtRecordItemProperty = new ArrayList<>();
        this.debtRecordItemRecycler = this.findViewById(id.debt_item_recycler);
        this.debtRecordItemRecycler.setHasFixedSize(true);
        this.debtRecordItemRecycler.setLayoutManager(new LinearLayoutManager(this));
        this.myDebtRecordItemAdapter = new DebtRecordItemAdapter(this, this.myDebtRecordItemProperty);
        this.debtRecordItemRecycler.setAdapter(this.myDebtRecordItemAdapter);

    }
}

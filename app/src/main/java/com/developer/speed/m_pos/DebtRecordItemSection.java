package com.developer.speed.m_pos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.*;
import java.util.*;
public class DebtRecordItemSection extends AppCompatActivity
{
    RecyclerView debtRecordItemRecycler;
    DebtRecordItemAdapter myDebtRecordItemAdapter;
    List<DebtRecordItemProperty> myDebtRecordItemProperty;
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.debt_item_recycler_layout);
        myDebtRecordItemProperty=new ArrayList<>();
        debtRecordItemRecycler=findViewById(R.id.debt_item_recycler);
        debtRecordItemRecycler.setHasFixedSize(true);
        debtRecordItemRecycler.setLayoutManager(new LinearLayoutManager(this));


    }
}

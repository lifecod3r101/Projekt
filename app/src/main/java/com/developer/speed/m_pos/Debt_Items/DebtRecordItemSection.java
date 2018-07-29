package com.developer.speed.m_pos.Debt_Items;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.developer.speed.m_pos.Debt_Records.DebtRecord;
import com.developer.speed.m_pos.R.id;
import com.developer.speed.m_pos.R.layout;

import java.util.ArrayList;
import java.util.List;
public class DebtRecordItemSection extends AppCompatActivity
{
    RecyclerView debtRecordItemRecycler;
    DebtRecordItemAdapter myDebtRecordItemAdapter;
    List<DebtRecordItemProperty> myDebtRecordItemProperty;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.debt_item_recycler_layout);
    }

    @Override
    protected void onStart() {
        super.onStart();
        myDebtRecordItemProperty = new ArrayList<>();
        debtRecordItemRecycler = findViewById(id.debt_item_recycler);
        debtRecordItemRecycler.setHasFixedSize(true);
        debtRecordItemRecycler.setLayoutManager(new LinearLayoutManager(this));
        myDebtRecordItemAdapter = new DebtRecordItemAdapter(this, myDebtRecordItemProperty);
        debtRecordItemRecycler.setAdapter(myDebtRecordItemAdapter);
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
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, DebtRecord.class));
    }
}

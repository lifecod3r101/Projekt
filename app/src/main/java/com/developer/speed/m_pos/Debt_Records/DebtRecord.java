package com.developer.speed.m_pos.Debt_Records;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.developer.speed.m_pos.Debt_Items.DebtRecordItemSection;
import com.developer.speed.m_pos.Main_Menu.MainMenu;
import com.developer.speed.m_pos.R;
import com.developer.speed.m_pos.Transactions.TransactionProperties;

import java.util.ArrayList;
import java.util.List;

public class DebtRecord extends AppCompatActivity
{
    RecyclerView debtRecycle;
    DebtRecordAdapter debtRecordAdapter;
    List<TransactionProperties> debtRecordProperties;
    CardView debtRecordCard;
    TextView debtName, debtPhone, debtDate;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.debt_record_recycler_layout);
        debtRecordProperties = new ArrayList<>();
        debtRecycle = findViewById(R.id.debt_recycler);
        debtRecycle.setHasFixedSize(true);
        debtRecycle.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onStart() {
        super.onStart();
        debtRecordCard = findViewById(R.id.debt_card);
        debtName = findViewById(R.id.debt_name);
        debtPhone = findViewById(R.id.debt_phone_number);
        debtDate = findViewById(R.id.debt_date);
    }

    @Override
    protected void onResume() {
        super.onResume();
        debtRecordCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DebtRecord.this.startActivity(new Intent(DebtRecord.this, DebtRecordItemSection.class));
            }
        });
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
        new Builder(this).setTitle("Confirm").setMessage("Do you want to return to the main menu?").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                DebtRecord.this.startActivity(new Intent(DebtRecord.this, MainMenu.class));
                dialog.dismiss();
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
    }
}

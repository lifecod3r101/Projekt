package com.developer.speed.m_pos.Transactions;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.developer.speed.m_pos.Main_Menu.MainMenu;
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
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.transaction_recycler_layout);
    }

    @Override
    protected void onStart() {
        super.onStart();
        transactProperties = new ArrayList<>();
        transactRecycle = findViewById(id.transaction_recycler);
        transactRecycle.setHasFixedSize(true);
        transactRecycle.setLayoutManager(new LinearLayoutManager(this));
        transactAdapter = new TransactionAdapter(this, transactProperties);
        transactRecycle.setAdapter(transactAdapter);
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
    public void onBackPressed() {
        super.onBackPressed();
        new Builder(this).setTitle("Confirm").setMessage("Do you want to return to the main menu?").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                TransactionSection.this.startActivity(new Intent(TransactionSection.this, MainMenu.class));
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


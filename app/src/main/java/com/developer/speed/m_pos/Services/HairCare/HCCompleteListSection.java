package com.developer.speed.m_pos.Services.HairCare;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.developer.speed.m_pos.R;

import java.util.ArrayList;
import java.util.List;

public class HCCompleteListSection extends AppCompatActivity {
    RecyclerView hcCRecycler;
    List<HCCompleteListProperties> hcCList;
    HCCompleteListAdapter hcCAdapter;
    Button hcCompleteButton;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.hair_care_service_list_complete_recycler);
    }

    @Override
    protected void onStart() {
        super.onStart();
        hcCRecycler = findViewById(R.id.hc_service_list_recycler);
        hcCList = new ArrayList<>();
        hcCRecycler.setHasFixedSize(true);
        hcCRecycler.setLayoutManager(new LinearLayoutManager(this));
        hcCAdapter = new HCCompleteListAdapter(this, hcCList);
        hcCRecycler.setAdapter(hcCAdapter);
        hcCompleteButton = findViewById(R.id.button_complete_hc);
    }

    @Override
    protected void onResume() {
        super.onResume();
        hcCompleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        new AlertDialog.Builder(getBaseContext()).setTitle("Confirm").setMessage("Do you want to cancel this?").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
    }
}

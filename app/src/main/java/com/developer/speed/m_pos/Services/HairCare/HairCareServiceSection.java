package com.developer.speed.m_pos.Services.HairCare;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.developer.speed.m_pos.Main_Menu.MainMenu;
import com.developer.speed.m_pos.R;

import java.util.ArrayList;
import java.util.List;

public class HairCareServiceSection extends AppCompatActivity {
    RecyclerView hcsRecycler;
    List<HairCareServiceProperties> hcsProperties;
    HairCareServiceAdapter hcsAdapter;
    FloatingActionButton hcsAdd;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hair_care_services_recycler);
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.hcsProperties = new ArrayList<>();
        this.hcsRecycler = findViewById(R.id.hc_services_recycler);
        this.hcsRecycler.setHasFixedSize(true);
        this.hcsRecycler.setLayoutManager(new LinearLayoutManager(this));
        this.hcsAdapter = new HairCareServiceAdapter(this, this.hcsProperties);
        this.hcsRecycler.setAdapter(this.hcsAdapter);
        this.hcsAdd = findViewById(R.id.hc_add);
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.hcsAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HairCareServiceSection.this, HairCareServiceAdd.class));
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        new AlertDialog.Builder(getBaseContext()).setTitle("Confirm").setMessage("Do you want to return to the main menu?").setPositiveButton("Yes", new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(new Intent(HairCareServiceSection.this, MainMenu.class));
                dialog.dismiss();
            }
        }).setNegativeButton("No", new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
    }
}

package com.developer.speed.m_pos.Services.HairCare;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.developer.speed.m_pos.R.id;
import com.developer.speed.m_pos.R.layout;

public class HairCareServiceAdd extends AppCompatActivity {
    TextInputEditText hcCode, hcName, hcPrice;
    Button hcConfirm;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(layout.hair_care_specifications_layout);
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.hcCode = this.findViewById(id.service_code);
        this.hcName = this.findViewById(id.service_name);
        this.hcPrice = this.findViewById(id.service_price);
        this.hcConfirm = this.findViewById(id.confirm_add_service);
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.hcConfirm.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
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
    }
}

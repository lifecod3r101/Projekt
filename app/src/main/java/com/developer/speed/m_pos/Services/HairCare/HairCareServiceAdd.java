package com.developer.speed.m_pos.Services.HairCare;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.developer.speed.m_pos.R.id;
import com.developer.speed.m_pos.R.layout;

public class HairCareServiceAdd extends AppCompatActivity {
    TextInputEditText hcCode, hcName, hcPrice;
    Button hcConfirm;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.hair_care_specifications_layout);
    }

    @Override
    protected void onStart() {
        super.onStart();
        hcCode = findViewById(id.service_code);
        hcName = findViewById(id.service_name);
        hcPrice = findViewById(id.service_price);
        hcConfirm = findViewById(id.confirm_add_service);
    }

    @Override
    protected void onResume() {
        super.onResume();
        hcConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hcCode.getText().toString().isEmpty() && hcName.getText().toString().isEmpty() && hcPrice.getText().toString().isEmpty() || hcCode.getText().toString().isEmpty() && hcName.getText().toString().isEmpty() || hcCode.getText().toString().isEmpty() || hcName.getText().toString().isEmpty() || hcPrice.getText().toString().isEmpty()) {
                    new AlertDialog.Builder(getBaseContext()).setTitle("Required").setMessage("Sorry. No blank fields allowed").setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
                } else {
                    new AlertDialog.Builder(getBaseContext()).setTitle("Confirm").setMessage("Do you want to add this service?").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            startActivity(new Intent(HairCareServiceAdd.this, HairCareServiceSection.class));
                            dialogInterface.dismiss();
                        }
                    }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
                }
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

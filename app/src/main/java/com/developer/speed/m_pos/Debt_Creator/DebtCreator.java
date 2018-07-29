package com.developer.speed.m_pos.Debt_Creator;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.developer.speed.m_pos.R.id;
import com.developer.speed.m_pos.R.layout;

public class DebtCreator extends AppCompatActivity {
    TextInputEditText custName, custPhone, custDate;
    TextView payAmount;
    Button recordCreate, recordCancel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.debt_creator_layout);
    }

    @Override
    protected void onStart() {
        super.onStart();
        custName = findViewById(id.customer_name);
        custPhone = findViewById(id.phone_number);
        custDate = findViewById(id.payment_date);
        payAmount = findViewById(id.amount_to_pay);
        recordCreate = findViewById(id.create_record);
        recordCancel = findViewById(id.cancel_creation);
    }

    @Override
    protected void onResume() {
        super.onResume();
        recordCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (custName.getText().toString().isEmpty() && custPhone.getText().toString().isEmpty() && custDate.getText().toString().isEmpty() || custName.getText().toString().isEmpty() && custPhone.getText().toString().isEmpty() || custName.getText().toString().isEmpty() || custPhone.getText().toString().isEmpty() || custDate.getText().toString().isEmpty()) {
                    new Builder(DebtCreator.this.getApplicationContext()).setTitle("Required").setMessage("Sorry. Blank Fields Not Allowed").setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                } else {
                    new Builder(DebtCreator.this.getApplicationContext()).setTitle("Confirm").setMessage("Do you want to create this record?").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

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
}

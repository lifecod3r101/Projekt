package com.developer.speed.m_pos.Debt_Creator;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
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
        this.setContentView(layout.debt_creator_layout);
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.custName = this.findViewById(id.customer_name);
        this.custPhone = this.findViewById(id.phone_number);
        this.custDate = this.findViewById(id.payment_date);
        this.payAmount = this.findViewById(id.amount_to_pay);
        this.recordCreate = this.findViewById(id.create_record);
        this.recordCancel = this.findViewById(id.cancel_creation);
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.recordCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (DebtCreator.this.custName.getText().toString().isEmpty() && DebtCreator.this.custPhone.getText().toString().isEmpty() && DebtCreator.this.custDate.getText().toString().isEmpty() || DebtCreator.this.custName.getText().toString().isEmpty() && DebtCreator.this.custPhone.getText().toString().isEmpty() || DebtCreator.this.custName.getText().toString().isEmpty() || DebtCreator.this.custPhone.getText().toString().isEmpty() || DebtCreator.this.custDate.getText().toString().isEmpty()) {
                    new Builder(DebtCreator.this.getApplicationContext()).setTitle("Required").setMessage("Sorry. Blank Fields Not Allowed").setNeutralButton("Ok", new OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                } else {
                    new Builder(DebtCreator.this.getApplicationContext()).setTitle("Confirm").setMessage("Do you want to create this record?").setPositiveButton("Yes", new OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

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

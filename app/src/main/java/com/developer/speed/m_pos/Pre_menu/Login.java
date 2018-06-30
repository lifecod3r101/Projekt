package com.developer.speed.m_pos.Pre_menu;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.developer.speed.m_pos.Main_Menu.MainMenu;
import com.developer.speed.m_pos.R;
import com.developer.speed.m_pos.R.id;

public class Login extends AppCompatActivity {
    TextInputEditText phoneMail, loginPassword;
    Button login;
    TextView accountCreate;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.login_layout);
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.phoneMail = this.findViewById(id.phone_email_enter);
        this.loginPassword = this.findViewById(id.login_password_enter);
        this.login = this.findViewById(id.login);
        this.accountCreate = this.findViewById(id.account_create_text);
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.login.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Login.this.phoneMail.getText().toString().isEmpty() && Login.this.loginPassword.getText().toString().isEmpty() || Login.this.phoneMail.getText().toString().isEmpty() || Login.this.loginPassword.getText().toString().isEmpty()) {
                    new Builder(Login.this.getApplicationContext()).setTitle("Required").setMessage("Sorry. Blank Fields Not allowed").setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                } else
                {
                    LayoutInflater payInflater = LayoutInflater.from(Login.this.getParent());
                    View payView = payInflater.inflate(R.layout.registration_payment_dialog, null);
                    final AlertDialog payDialog = new Builder(Login.this.getParent()).create();
                    RadioGroup payRadioGroup = payView.findViewById(id.payment_radio);
                    final RadioButton basicRadio = payView.findViewById(id.basic_radio);
                    final RadioButton premiumRadio = payView.findViewById(id.premium_radio);
                    Button confirmRadio = payView.findViewById(id.confirm);
                    confirmRadio.setOnClickListener(new OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (!basicRadio.isChecked() || !premiumRadio.isChecked()) {
                                new Builder(Login.this.getApplicationContext()).setTitle("Required").setMessage("Sorry. A payment plan must be chosen").setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                });
                            } else if (basicRadio.isChecked()) {
                                Login.this.startActivity(new Intent(Login.this, MainMenu.class));
                                payDialog.dismiss();
                            } else {
                                Login.this.startActivity(new Intent(Login.this, MainMenu.class));
                                payDialog.dismiss();
                            }
                        }
                    });
                    payDialog.setView(payView);
                    payDialog.show();
                }
            }
        });
        this.accountCreate.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Login.this.startActivity(new Intent(Login.this, Registration.class));
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
}

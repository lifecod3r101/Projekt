package com.developer.speed.m_pos.Pre_menu;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

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
                }
                /*else if()
                {

                }*/
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

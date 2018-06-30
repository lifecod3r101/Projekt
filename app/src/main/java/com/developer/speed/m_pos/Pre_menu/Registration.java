package com.developer.speed.m_pos.Pre_menu;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.developer.speed.m_pos.R;
import com.developer.speed.m_pos.R.id;

public class Registration extends AppCompatActivity {
    TextInputEditText firstName, lastName, phoneNumber, emailAddress;
    Button submit;
    TextView loginAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.registration_layout);
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.firstName = this.findViewById(id.name_first);
        this.lastName = this.findViewById(id.name_last);
        this.phoneNumber = this.findViewById(id.phone_number);
        this.emailAddress = this.findViewById(id.email_address);
        this.submit = this.findViewById(id.submit);
        this.loginAccount = this.findViewById(id.login_text);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (this.firstName.getText().toString().isEmpty() && this.lastName.getText().toString().isEmpty() && this.phoneNumber.getText().toString().isEmpty() || this.firstName.getText().toString().isEmpty() && this.lastName.getText().toString().isEmpty() || this.firstName.getText().toString().isEmpty() || this.lastName.getText().toString().isEmpty() || this.phoneNumber.getText().toString().isEmpty()) {
            new Builder(this.getApplicationContext()).setTitle("Required").setMessage("Sorry. The fields must be filled").setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
        } else {
            LayoutInflater passInflater = LayoutInflater.from(this);
            View passView = passInflater.inflate(R.layout.password_dialog, null);
            AlertDialog passDialog = new Builder(this).create();
            final TextInputEditText passEnter = passView.findViewById(id.password_enter);
            final TextInputEditText passVerify = passView.findViewById(id.password_verify);
            Button submitComplete = passView.findViewById(id.submit_complete);
            submitComplete.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (passEnter.getText().toString().isEmpty() && passVerify.getText().toString().isEmpty() || passEnter.getText().toString().isEmpty() || passVerify.getText().toString().isEmpty()) {
                        Toast.makeText(Registration.this.getBaseContext(), "Sorry. Blank Fields not allowed", Toast.LENGTH_LONG).show();
                    } else if (passEnter.getText().toString() != passVerify.getText().toString()) {
                        Toast.makeText(Registration.this.getBaseContext(), "Passwords Do Not Match. Please Reenter", Toast.LENGTH_LONG).show();
                    } else {
                        Intent loginIntent = new Intent(Registration.this, Login.class);
                        Registration.this.startActivity(loginIntent);
                    }
                }
            });
            passDialog.setView(passView);
            passDialog.show();

        }

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
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}


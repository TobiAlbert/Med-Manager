package com.tobidaada.medmanager.ui.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tobidaada.medmanager.R;
import com.tobidaada.medmanager.ui.medication.MedicationActivity;
import com.tobidaada.medmanager.ui.sign_up.SignUpActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginButton = findViewById(R.id.btn_login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMedicationActivity();
            }
        });
    }



    public void openSignUpActivity(View view) {
        Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
        startActivity(intent);
        finish();
    }

    public void openMedicationActivity() {
        Intent intent = new Intent(LoginActivity.this, MedicationActivity.class);
        startActivity(intent);
        finish();
    }


}

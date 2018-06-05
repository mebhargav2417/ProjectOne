package com.taf.projectandroid.projectone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FpwdAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fpwd_acitivity);
    }

    public void onBackPressed() {
        Intent intent = new Intent(FpwdAcitivity.this,LoginActivity.class);
        startActivity(intent);
        finish();
    }
}

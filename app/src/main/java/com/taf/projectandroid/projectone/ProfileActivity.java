package com.taf.projectandroid.projectone;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

public class ProfileActivity extends AppCompatActivity {

    private ListView profileView;
    String[] profileItems = new String[] {"Name","Date of Birth","Mobile", "Address","Logout"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        profileView = (ListView) findViewById(R.id.listviewProfile);
        ProfileListAdapter adapter = new ProfileListAdapter(this,profileItems);
        profileView.setAdapter(adapter);
        toolbar.setNavigationIcon(R.drawable.arrow_left);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void onBackPressed() {
        Intent intent = new Intent(ProfileActivity.this,HomeActivity.class);
        startActivity(intent);
        finish();
    }

}

package com.example.venpro;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    private EditText username;
    private EditText password;
    private Button button_login;

    public static final String EXTRA_USERNAME = "com.example.networkapp.USERNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void LoginButton(View view) {
        username = findViewById(R.id.editText_user);
        password = findViewById(R.id.editText_password);
        button_login = (Button)findViewById(R.id.button_login);

        Intent intent = new Intent(this, MainProfile.class);
        startActivity(intent);
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.MyProfile:
                Intent profile = new Intent(this,MainProfile.class);
                startActivity(profile);
            case R.id.EventInfo:
                Intent eventInfo = new Intent(this,EventInfo.class);
                startActivity(eventInfo);
            case R.id.Attendees:
                Intent attend = new Intent(this,Attendees.class);
                startActivity(attend);
            default:
                return false;
        }
    }
}


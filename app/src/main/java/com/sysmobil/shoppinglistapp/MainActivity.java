package com.sysmobil.shoppinglistapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sysmobil.productlistapp.R;
import com.sysmobil.shoppinglistapp.database.DatabaseHelper;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper databaseHelper;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.context = this.getApplicationContext();
        databaseHelper = new DatabaseHelper(this.context);
    }
}

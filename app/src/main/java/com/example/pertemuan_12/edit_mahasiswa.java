package com.example.pertemuan_12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class edit_mahasiswa extends AppCompatActivity {

    com.rengwuxian.materialedittext.MaterialEditText ETNim,ETName, ETAddress,ETHobby;
    String nim,name,address,hobby;
    Button BTNUpdate;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_mahasiswa);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });



        ETNim       = findViewById(R.id.ETNim);
        ETName      = findViewById(R.id.ETName);
        ETAddress   = findViewById(R.id.ETAddress);
        ETHobby     = findViewById(R.id.ETHobby);
        BTNUpdate   = findViewById(R.id.BTNUpdate);

        progressDialog = new ProgressDialog(this);

        BTNUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.delete,menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.action_delete){


        }
        return super.onOptionsItemSelected(item);
    }




}


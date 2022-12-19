package com.example.myalertdialogdemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button exitButton;
    private AlertDialog.Builder alertDialogBuilder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exitButton = findViewById(R.id.buttonId);
        exitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

        // for setting title
        alertDialogBuilder.setTitle(R.string.title_text);

        //for setting message
        alertDialogBuilder.setMessage(R.string.message_text);

        //for setting icon

        alertDialogBuilder.setIcon(R.drawable.question);

        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Exit
                finish();
            }
        });
        alertDialogBuilder.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               dialog.cancel();
            }
        });

        alertDialogBuilder.setNeutralButton("cencel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "You have clicked on no button.", Toast.LENGTH_SHORT).show();

            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();




    }
}
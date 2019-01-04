package com.example.sunrin_08.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    final Context context = this;
    ListView listView;
    MainAdapter mainAdapter;
    Button buttonAdd;
    EndDialog endDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonAdd = findViewById(R.id.btn_add);
        listView = findViewById(R.id.listView);
        mainAdapter = new MainAdapter();

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                endDialog = new EndDialog(context);
                endDialog.setCancelable(false);
                endDialog.show();
            }
        });
    }
}

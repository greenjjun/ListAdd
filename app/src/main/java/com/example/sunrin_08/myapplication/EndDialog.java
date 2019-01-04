package com.example.sunrin_08.myapplication;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EndDialog extends Dialog {
    private Context context;
    private TextView btnCancel;
    private TextView btnOk;
    MainAdapter mainAdapter;
    EditText name,number,birth;

    public EndDialog(@NonNull Context context) {
        super(context);
        this.context = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_main);

        btnCancel = findViewById(R.id.btn_cancel);
        btnOk = findViewById(R.id.btn_ok);
        name = findViewById(R.id.edit_name);
        birth = findViewById(R.id.edit_birth);
        number = findViewById(R.id.edit_number);
        mainAdapter = ((MainActivity)context).mainAdapter;

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)context).listView.setAdapter(mainAdapter);
                mainAdapter.addContent(name.getText().toString(),number.getText().toString(),birth.getText().toString());
                dismiss();
            }
        });
    }
}

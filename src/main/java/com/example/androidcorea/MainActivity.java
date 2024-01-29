package com.example.androidcorea;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cbDance, cbSport, cbSinging, cbActing;
    Button btnSubmit;
    TextView txtHobby;
    RadioGroup rgGender;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = findViewById(R.id.btnSubmit);
        rgGender = findViewById(R.id.rgGender);
        cbDance = findViewById(R.id.cbDance);
        cbSport = findViewById(R.id.cbSport);
        cbSinging = findViewById(R.id.cbSinging);
        cbActing = findViewById(R.id.cbActing);
        txtHobby = findViewById(R.id.txtHobby);

//        rgGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup radioGroup, int i) {
//                Toast.makeText(MainActivity.this, ""+i, Toast.LENGTH_SHORT).show();
//            }
//        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int id = rgGender.getCheckedRadioButtonId();
                RadioButton rb = findViewById(id);
                txtHobby.setText(rb.getText().toString());

                cToast(rb.getText().toString());
            }
        });


    }

    void cToast(String msg) {
        Toast toast = new Toast(this);
        View view = LayoutInflater.from(this).inflate(R.layout.c_toast,null,false);
        toast.setView(view);
        toast.setDuration(Toast.LENGTH_SHORT);

        TextView txtMsg = view.findViewById(R.id.txtMsg);
        txtMsg.setText(msg);

        toast.show();
    }

}
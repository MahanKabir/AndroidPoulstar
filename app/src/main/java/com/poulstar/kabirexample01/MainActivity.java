package com.poulstar.kabirexample01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_input01, et_input02;
    Button btn_area, btn_env;
    TextView txt_out;

    int int_x, int_y, area, env;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_input01 = findViewById(R.id.id_x);
        et_input02 = findViewById(R.id.id_y);



        btn_area = findViewById(R.id.id_area);
        btn_env = findViewById(R.id.id_env);

        txt_out = findViewById(R.id.id_out);


        btn_area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int_x = Integer.parseInt(et_input01.getText().toString());
                int_y = Integer.parseInt(et_input02.getText().toString());

                area = (int_x + int_y) * 2;
                txt_out.setText(area + "");
            }
        });

        btn_env.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int_x = Integer.parseInt(et_input01.getText().toString());
                int_y = Integer.parseInt(et_input02.getText().toString());

                env = int_x * int_y;
                txt_out.setText(env + "");

            }
        });





    }
}
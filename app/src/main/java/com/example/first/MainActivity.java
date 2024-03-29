package com.example.first;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText firstNum = (EditText) findViewById(R.id.firstNum);
        final EditText secondNum = (EditText) findViewById(R.id.secnum);


        Button btnAdd = (Button) findViewById(R.id.addBtn);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNum.getText().toString().isEmpty() || secondNum.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(),
                            "Please fill all the fields", Toast.LENGTH_SHORT).show();
                } else {
                    int num1 = Integer.parseInt(firstNum.getText().toString());
                    int num2 = Integer.parseInt(secondNum.getText().toString());
                    Toast.makeText(getApplicationContext(), "SUM = " + (num1 + num2), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
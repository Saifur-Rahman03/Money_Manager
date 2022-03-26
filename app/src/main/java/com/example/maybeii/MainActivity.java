package com.example.maybeii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ArrayList<Trans> trans = new ArrayList<>();
    private EditText editText1, editText2, totalToday;
    private TextView textView, textView2, textView3;
    private Button button, button2;
    String systemDate;
    String valueToday;
    double TotalCost = 0;
    double Left = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();
        systemDate = DateFormat.getDateInstance().format(calendar.getTime());

        totalToday = findViewById(R.id.totalTodayID);
        textView = findViewById(R.id.textViewID);
        textView2 = findViewById(R.id.textView2ID);
        textView3 = findViewById(R.id.textView3ID);
        button = findViewById(R.id.buttonID);
        button2 = findViewById(R.id.button2ID);
        editText1 = findViewById(R.id.editText1ID);
        editText2 = findViewById(R.id.editText2ID);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueToday = totalToday.getText().toString();
                String value = editText1.getText().toString();
                String value2 = editText2.getText().toString();
                double valueD = Double.parseDouble(value2);
                trans.add(new Trans((new Transaction(value, valueD, systemDate)), systemDate, Double.parseDouble(valueToday), TotalCost, Left));
            }
        });

    }
    private void totalcost(){

    }
}

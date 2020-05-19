package com.example.layouts;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView resultField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        resultField = findViewById(R.id.resultField);
    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.button7:
                resultField.setText(getText(R.string._7));
                break;
            case R.id.button8:
                resultField.setText(getText(R.string._8));
                break;
            case R.id.button9:
                resultField.setText(getText(R.string._9));
                break;
            case R.id.button4:
                resultField.setText(getText(R.string._4));
                break;
            case R.id.button5:
                resultField.setText(getText(R.string._5));
                break;
            case R.id.button6:
                resultField.setText(getText(R.string._6));
                break;
            case R.id.button1:
                resultField.setText(getText(R.string._1));
                break;
            case R.id.button2:
                resultField.setText(getText(R.string._2));
                break;
            case R.id.button3:
                resultField.setText(getText(R.string._3));
                break;
            case R.id.button0:
                resultField.setText(getText(R.string._0));

        }
    }

    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.buttonC:
                resultField.setText(getText(R.string._C));
                break;
            case R.id.buttonPlMn:
                resultField.setText(getText(R.string.plMn));
                break;
            case R.id.buttonProcent:
                resultField.setText(getText(R.string.procent));
                break;
            case R.id.buttonShare:
                resultField.setText(getText(R.string.share));
                break;
            case R.id.buttonX:
                resultField.setText(getText(R.string._X));
                break;
            case R.id.buttonMinus:
                resultField.setText(getText(R.string.minus));
                break;
            case R.id.buttonPlus:
                resultField.setText(getText(R.string.plus));
                break;
            case R.id.buttonEqually:
                resultField.setText(getText(R.string.equally));
                break;
        }
    }
}

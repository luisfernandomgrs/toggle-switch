package com.luisfernandomgrs.learning.toggleswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private Switch btnSwitch;
    private ToggleButton toggleBtn;
    private CheckBox cbxRememberPass;
    private TextView txtResultMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize components
        btnSwitch = findViewById(R.id.btnSwitch);
        toggleBtn = findViewById(R.id.toggleBtn);
        cbxRememberPass = findViewById(R.id.cbxRememberPass);
        txtResultMessage = findViewById(R.id.txtResultMessage);

        myEventlistener();
    }

    public void myEventlistener() {
        btnSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    txtResultMessage.setText("ligado");
                }
                else {
                    txtResultMessage.setText("Desligado");
                }
            }
        });
    }
}
package com.example.smarthome;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ToggleButton switchLight = findViewById(R.id.lightSwitch);
        ToggleButton switchRollerBlind = findViewById(R.id.rollerBlindSwith);
        ToggleButton switchDoor = findViewById(R.id.doorSwitch);
        TextView statusLight = findViewById(R.id.lightStatus);
        TextView statusRollerBlind = findViewById(R.id.rollerBlindStatus);
        TextView statusDoor = findViewById(R.id.doorStatus);


        switchLight.setOnCheckedChangeListener(((buttonView, isChecked) -> {
            if(switchLight.isChecked()){
                statusLight.setText("ON");
            }else{
                statusLight.setText("OFF");
            }
        }));
        switchRollerBlind.setOnCheckedChangeListener(((buttonView, isChecked) -> {
            if(switchRollerBlind.isChecked()){
                statusRollerBlind.setText("ON");
            }else{
                statusRollerBlind.setText("OFF");
            }
        }));
        switchDoor.setOnCheckedChangeListener(((buttonView, isChecked) -> {
            if(switchDoor.isChecked()){
                statusDoor.setText("ON");
            }else{
                statusDoor.setText("OFF");
            }
        }));

    }
}
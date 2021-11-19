package com.fsalazar.evaluacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAgregarSensor, btnMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAgregarSensor = (Buttton) findViewById(R.id.btnAgregarSensor);
        btnAgregarSensor.SetOnClickListener(this);

        btnMap = (Button) findViewById(R.id).btnMap);
        btnMap.setOnClickListener(this);

    }

    @Override
    public void onClick(view v) {
        switch (v.getId)){
            case R.id.btnAgregarSensor:
                Intent AgregarSensoresIntent = new Intent(this, AgregarSensores.class
                startActivity(AgregarSensoresIntent);
                break;

            case R.id.btnMap:
                Intent mapActivityIntent = new Intent(this, MapsActivity.class )
                startActivity(mapActivityIntent);
                break;

        }
    }

}
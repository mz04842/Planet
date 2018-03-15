package com.example.mz04842.planetapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowPlanetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_planet);

        Planet planet = (Planet)this.getIntent().getSerializableExtra("planet");
        TextView tv_name = (TextView)this.findViewById(R.id.show_planet_name);
        TextView tv_gas = (TextView)this.findViewById(R.id.show_isgas);
        TextView tv_moons = (TextView)this.findViewById(R.id.show_num_moons);

        tv_name.setText(planet.getName());
        tv_gas.setText(Boolean.toString(planet.isgas()));
        tv_moons.setText(Integer.toString(planet.getNumberOfMoons()));
    }
}

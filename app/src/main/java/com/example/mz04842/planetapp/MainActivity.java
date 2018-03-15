package com.example.mz04842.planetapp;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private CheckBox checkbox;
    private Spinner spinner;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)this.findViewById(R.id.submitbutton);
        checkbox = (CheckBox)this.findViewById(R.id.isgas);
        spinner = (Spinner)this.findViewById(R.id.planets_spinner);
        textView = (TextView)this.findViewById(R.id.planetname);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String planetName = textView.getText().toString();
                boolean isGas = checkbox.isChecked();
                String s_numMoons= spinner.getSelectedItem().toString(); //add a comment
                int moons = Integer.parseInt(s_numMoons);
                Planet planet = new Planet(moons, isGas, planetName);
                Intent intent = new Intent(MainActivity.this, ShowPlanetActivity.class);
                intent.putExtra("planet", planet);
                startActivity(intent);
            }
        });

    }
}

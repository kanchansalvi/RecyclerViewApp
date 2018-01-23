package com.kanchan.recyclerviewapp.recyclerviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private TextView name, description;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        name = (TextView) findViewById(R.id.dNameID);
        description= (TextView) findViewById(R.id.dDescriptionID);
        name.setText("Hello");

        if(extras != null) {
            name.setText(extras.getString("name"));
            description.setText(extras.getString("description"));
        }
    }
}

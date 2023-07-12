package com.example.hybridbased;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bpress;
        bpress = (Button) findViewById(R.id.b1);
        bpress.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "welcome", Toast.LENGTH_SHORT).show();
    }
}
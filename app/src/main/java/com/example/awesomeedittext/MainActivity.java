package com.example.awesomeedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView awesEdt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        awesEdt = findViewById(R.id.awsmEdt);
    }

    public void Click(View view) {
        String text = awesEdt.getText().toString();
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();

    }
}

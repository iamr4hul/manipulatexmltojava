package com.example.android.logactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void eatCookie(View view){
        ImageView imageView = findViewById(R.id.cookie_image_view);
        imageView.setImageResource(R.drawable.after_cookie);

        TextView textView=findViewById(R.id.status_text_view);
        textView.setText("I'm so full");
    }

}
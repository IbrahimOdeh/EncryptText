package com.ibrahim.entext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ibrahimodeh.entextlib.enText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        EditText editText = findViewById(R.id.editText);
        Button btnEncrypt = findViewById(R.id.btn_encrypt);
        Button btnDecrypt = findViewById(R.id.btn_decrypt);

        btnEncrypt.setOnClickListener(v ->
        {
            String text = editText.getText().toString();
            textView.setText(enText.decText(text));
        });

        btnDecrypt.setOnClickListener(v ->
        {
            String text = editText.getText().toString();
            textView.setText(enText.encText(text));
        });


    }
}
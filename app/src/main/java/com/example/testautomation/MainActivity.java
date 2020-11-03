package com.example.testautomation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import static java.lang.String.valueOf;

public class MainActivity extends AppCompatActivity {

    private Button changeButton;
    private TextView helloText;
    private EditText editName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeButton = (Button) findViewById(R.id.ChangeButton);
        helloText = (TextView) findViewById(R.id.HelloText);

        editName = (EditText) findViewById(R.id.editName);



        changeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                editName.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        helloText.setText(s);
                    }

                    @Override
                    public void afterTextChanged(Editable s) {

                    }
                });

            };
    });
}
}
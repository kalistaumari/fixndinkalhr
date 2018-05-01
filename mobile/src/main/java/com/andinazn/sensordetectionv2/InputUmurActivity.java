package com.andinazn.sensordetectionv2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputUmurActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_umur);


        submitAge();

    }

    private void submitAge()
    {

        Button button = (Button)findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {

                @Override
            public void onClick(View v) {
                    EditText ageEntry = (EditText)findViewById(R.id.inputumur);
                    String userData = ageEntry.getText().toString();
                    int userNumber = Integer.parseInt(userData);

                    //intent kirim ke activity sebelah
                    Intent intent = new Intent(InputUmurActivity.this,MainActivity.class);
                    intent.putExtra("USER_AGE", userNumber);
                    startActivity(intent);
                    Log.i("user age inputumuractivity", "user age " + userNumber);

            }
        });

    }

}
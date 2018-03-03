package com.example.pranay.lifecycles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private String LOG_TAG=MainActivity.class.getSimpleName();
Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.but1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iact = new Intent(MainActivity.this,activity1.class);
                startActivity(iact);
            }
        });


    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(LOG_TAG,"On Resume invoked");
    }
    @Override

    protected void onStart() {
        super.onStart();
        Log.i(LOG_TAG,"On Start invoked");
    }
    @Override

    protected void onRestart() {
        super.onRestart();
        Log.i(LOG_TAG,"On Restart invoked");

    }
    @Override

    protected void onStop() {
        super.onStop();
        Log.i(LOG_TAG,"On Stop invoked");
    }
    @Override

    protected void onDestroy() {
        super.onDestroy();
        Log.i(LOG_TAG,"On Destroy invoked");
    }

}

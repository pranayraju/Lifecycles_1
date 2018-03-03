package com.example.pranay.lifecycles;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class activity1 extends AppCompatActivity {
    private String LOG_TAG=activity1.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);
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
public void onBackPressed()
{
    AlertDialog.Builder builder = new AlertDialog.Builder(this);
    builder.setMessage("exit");
    builder.setNegativeButton("no", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
        }
    });
    builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            Intent iact = new Intent(activity1.this,MainActivity.class);
            startActivity(iact);
        }
    });
    builder.show();
}


}

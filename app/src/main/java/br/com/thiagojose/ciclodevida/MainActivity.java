package br.com.thiagojose.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "curso";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "Executando o método OnCreate()");
    }


    protected void OnStart(){
        super.onStart();
        Log.i(TAG, "Executando o método OnStart()");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG, "Executando o método OnRestart()");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "Executando o método OnResume()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "Executando o método OnPause()");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG, "Executando o método OnStop()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "Executando o método OnDestroy()");
    }


}

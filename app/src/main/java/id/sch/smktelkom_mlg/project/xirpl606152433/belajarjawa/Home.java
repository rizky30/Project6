package id.sch.smktelkom_mlg.project.xirpl606152433.belajarjawa;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Home extends Activity
{
    private static final String TAG = "LivecycleTag";
    MediaPlayer mediaplayer;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: ");
        mediaplayer = MediaPlayer.create(this, R.raw.awal);

        findViewById(R.id.imageViewAksara).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, AksaraJawaMainActivity.class));
            }
        });

        findViewById(R.id.imageViewTembang).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, TembangMainActivity.class));
            }
        });

        findViewById(R.id.imageViewKewan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, KewanMainActivity.class));
            }
        });

        findViewById(R.id.imageViewInfo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, InfoActivity.class));
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
        mediaplayer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
        mediaplayer.pause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
        if (mediaplayer != null)
            mediaplayer.release();
    }
}

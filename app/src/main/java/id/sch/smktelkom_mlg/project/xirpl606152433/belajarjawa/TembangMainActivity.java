package id.sch.smktelkom_mlg.project.xirpl606152433.belajarjawa;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class TembangMainActivity extends Activity {
    private static final String TAG = "LivecycleTag";
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tembang_main);
        Log.d(TAG, "onCreate: ");
        mediaPlayer = MediaPlayer.create(this, R.raw.song);

        findViewById(R.id.imageViewKodok).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TembangMainActivity.this, KodokActivity.class));
            }
        });

        findViewById(R.id.imageViewLir).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TembangMainActivity.this, LirActivity.class));
            }
        });

        findViewById(R.id.imageViewMenthok).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TembangMainActivity.this, MenthokActivity.class));
            }
        });

        findViewById(R.id.imageViewSluku).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TembangMainActivity.this, SlukuActivity.class));
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
        mediaPlayer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
        mediaPlayer.pause();
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
        if (mediaPlayer != null)
            mediaPlayer.release();
    }
}

package id.sch.smktelkom_mlg.project.xirpl606152433.belajarjawa;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;

public class LirActivity extends Activity implements MediaPlayer.OnCompletionListener {
    private Button play, pause, stop;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lir);

        play = (Button) findViewById(R.id.buttonPlay);
        pause = (Button) findViewById(R.id.buttonPause);
        stop = (Button) findViewById(R.id.buttonStop);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play();
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pause();
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stop();
            }
        });

        setup();
    }

    private void pause() {
        mp.pause();

        play.setEnabled(true);
        pause.setEnabled(false);
        stop.setEnabled(true);
    }

    private void loadClip() {
        try {
            mp = MediaPlayer.create(this, R.raw.lirilir);
            mp.setOnCompletionListener(this);
        } catch (Throwable t) {
            goBlooey(t);
        }
    }

    private void goBlooey(Throwable t) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder
                .setTitle("Peringatan")
                .setMessage(t.toString())
                .setPositiveButton("OK", null)
                .show();
    }

    private void setup() {
        loadClip();
        play.setEnabled(true);
        pause.setEnabled(false);
        stop.setEnabled(false);
    }


    private void stop() {
        mp.stop();
        pause.setEnabled(false);
        stop.setEnabled(false);

        try {
            mp.prepare();
            mp.seekTo(0);
            play.setEnabled(true);
        } catch (Throwable t) {
            goBlooey(t);
        }
    }

    private void play() {
        mp.start();
        play.setEnabled(false);
        pause.setEnabled(true);
        stop.setEnabled(true);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (stop.isEnabled()) {
            stop();
        }
    }

    public void onCompletion(MediaPlayer mp) {
        stop();
    }
}
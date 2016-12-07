package id.sch.smktelkom_mlg.project.xirpl606152433.belajarjawa;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class KewanMainActivity extends Activity {
    private static final String TAG = "LivecycleTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kewan_main);
        Log.d(TAG, "onCreate: ");

        findViewById(R.id.imageViewGajah).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(KewanMainActivity.this, GajahActivity.class));
            }
        });

        findViewById(R.id.imageViewSapi).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(KewanMainActivity.this, SapiActivity.class));
            }
        });

        findViewById(R.id.imageViewKambing).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(KewanMainActivity.this, KambingActivity.class));
            }
        });

        findViewById(R.id.imageViewBebek).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(KewanMainActivity.this, BebekActivity.class));
            }
        });

        findViewById(R.id.imageViewKijang).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(KewanMainActivity.this, KijangActivity.class));
            }
        });

        findViewById(R.id.imageViewKucing).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(KewanMainActivity.this, KucingActivity.class));
            }
        });

        findViewById(R.id.imageViewMonyet).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(KewanMainActivity.this, KethekActivity.class));
            }
        });

        findViewById(R.id.imageViewJaran).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(KewanMainActivity.this, JaranActivity.class));
            }
        });

        findViewById(R.id.imageViewLowo).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(KewanMainActivity.this, LowoActivity.class));
            }
        });

        findViewById(R.id.imageViewPitik).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(KewanMainActivity.this, PitikActivity.class));
            }
        });
    }
}

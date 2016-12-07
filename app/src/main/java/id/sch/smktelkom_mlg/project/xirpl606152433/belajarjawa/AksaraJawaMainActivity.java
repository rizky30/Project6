package id.sch.smktelkom_mlg.project.xirpl606152433.belajarjawa;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class AksaraJawaMainActivity extends Activity {
    private static final String TAG = "LivecycleTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aksara_jawa_main);
        Log.d(TAG, "onCreate: ");

        findViewById(R.id.imageViewHa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AksaraJawaMainActivity.this, HaActivity.class));
            }
        });
        findViewById(R.id.imageViewNa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AksaraJawaMainActivity.this, NaActivity.class));
            }
        });
        findViewById(R.id.imageViewCa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AksaraJawaMainActivity.this, CaActivity.class));
            }
        });
        findViewById(R.id.imageViewRa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AksaraJawaMainActivity.this, RaActivity.class));
            }
        });
        findViewById(R.id.imageViewKa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AksaraJawaMainActivity.this, KaActivity.class));
            }
        });
        findViewById(R.id.imageViewDa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AksaraJawaMainActivity.this, DaActivity.class));
            }
        });
        findViewById(R.id.imageViewTa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AksaraJawaMainActivity.this, TaActivity.class));
            }
        });
        findViewById(R.id.imageViewSa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AksaraJawaMainActivity.this, SaActivity.class));
            }
        });
        findViewById(R.id.imageViewWa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AksaraJawaMainActivity.this, WaActivity.class));
            }
        });
        findViewById(R.id.imageViewLa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AksaraJawaMainActivity.this, LaActivity.class));
            }
        });
        findViewById(R.id.imageViewPa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AksaraJawaMainActivity.this, PaActivity.class));
            }
        });
        findViewById(R.id.imageViewDha).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AksaraJawaMainActivity.this, DhaActivity.class));
            }
        });
        findViewById(R.id.imageViewJa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AksaraJawaMainActivity.this, JaActivity.class));
            }
        });
        findViewById(R.id.imageViewYa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AksaraJawaMainActivity.this, YaActivity.class));
            }
        });
        findViewById(R.id.imageViewNya).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AksaraJawaMainActivity.this, NyaActivity.class));
            }
        });
        findViewById(R.id.imageViewMa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AksaraJawaMainActivity.this, MaActivity.class));
            }
        });
        findViewById(R.id.imageViewGa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AksaraJawaMainActivity.this, GaActivity.class));
            }
        });
        findViewById(R.id.imageViewBa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AksaraJawaMainActivity.this, BaActivity.class));
            }
        });
        findViewById(R.id.imageViewTha).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AksaraJawaMainActivity.this, ThaActivity.class));
            }
        });
        findViewById(R.id.imageViewNga).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AksaraJawaMainActivity.this, NgaActivity.class));
            }
        });
    }
}

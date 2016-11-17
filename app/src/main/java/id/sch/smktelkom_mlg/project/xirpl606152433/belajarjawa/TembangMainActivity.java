package id.sch.smktelkom_mlg.project.xirpl606152433.belajarjawa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TembangMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tembang_main);

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
}

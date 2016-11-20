package id.sch.smktelkom_mlg.project.xirpl606152433.belajarjawa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KewanMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kewan_main);

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
    }
}

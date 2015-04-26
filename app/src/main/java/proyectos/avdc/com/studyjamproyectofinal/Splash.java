package proyectos.avdc.com.studyjamproyectofinal;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import proyectos.avdc.com.studyjamproyectofinal.config.ParametrosConfig;


public class Splash extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ActionBar barra = getSupportActionBar();
        barra.hide();
        TimeOut();
    }

    private void TimeOut() {
        new Handler().postDelayed(new Runnable() {
            public void run() {
                Intent i = new Intent(Splash.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, ParametrosConfig.TIEMPO_ESPERA);
    }
}

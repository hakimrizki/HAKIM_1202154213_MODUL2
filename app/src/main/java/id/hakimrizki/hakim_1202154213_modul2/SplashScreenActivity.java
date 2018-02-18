package id.hakimrizki.hakim_1202154213_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SplashScreenActivity extends AppCompatActivity {

    //Class ini digunakan untuk membuat splash screen yang akan tampil selama 4 detik serta memunculkan Toast

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent a = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(a);
                finish();
                Toast.makeText(getApplicationContext(), "HAKIM_1202154213",Toast.LENGTH_LONG).show();
            }
        },4000);
    }
}

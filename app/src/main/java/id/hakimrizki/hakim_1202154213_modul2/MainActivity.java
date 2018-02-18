package id.hakimrizki.hakim_1202154213_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton rb1, rb2;
    RadioGroup rbGr;
    Button bPesan;

    //Deklarasi komponen yang digunakan pada UI

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb1 = (RadioButton)findViewById(R.id.rb_di);
        rb2 = (RadioButton)findViewById(R.id.rb_ta);
        rbGr = (RadioGroup)findViewById(R.id.rbGroup);
        bPesan = (Button)findViewById(R.id.btn_pesan);

        //Binding komponen pada UI ke Java

    }

    public void pesan(View view) {
        int id = rbGr.getCheckedRadioButtonId();
        if(id == rb1.getId()){
            Intent i = new Intent(MainActivity.this, DineInActivity.class);
            startActivity(i);
            Toast.makeText(this, "Dine In", Toast.LENGTH_LONG).show();
        }else if(id == rb2.getId()){
            Intent j = new Intent(MainActivity.this, TakeAwayActivity.class);
            startActivity(j);
            Toast.makeText(this, "Take Away", Toast.LENGTH_LONG).show();
        }
    }

    //Ketika button diklik maka akan berpindah activity sesuai RadioButton yang telah dipilih
}

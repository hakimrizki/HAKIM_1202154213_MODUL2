package id.hakimrizki.hakim_1202154213_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import id.hakimrizki.hakim_1202154213_modul2.MenuMakanan.ListMenuActivity;

public class TakeAwayActivity extends AppCompatActivity {

    EditText ed_nama, ed_phone, ed_alamat, ed_catatan;
    Button btnPilih;

    //Deklarasi komponen yang digunakan pada UI

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);

        ed_nama = (EditText)findViewById(R.id.edNama);
        ed_phone = (EditText)findViewById(R.id.edPhone);
        ed_alamat = (EditText)findViewById(R.id.edAlamat);
        ed_catatan = (EditText)findViewById(R.id.edCatatan);
        btnPilih = (Button)findViewById(R.id.btn_pilih);

        //Binding komponen pada UI ke Java

        btnPilih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TakeAwayActivity.this, ListMenuActivity.class);
                startActivity(i);
            }
        });

        //Ketika button diklik makan akan berpindah activity ke ListMenuActivity
    }
}

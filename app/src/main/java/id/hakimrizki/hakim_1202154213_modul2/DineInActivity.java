package id.hakimrizki.hakim_1202154213_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import id.hakimrizki.hakim_1202154213_modul2.MenuMakanan.ListMenuActivity;

public class DineInActivity extends AppCompatActivity {

    String spinnerLabel = "";
    String username;
    EditText edNama1;
    Spinner sp1;
    Button bPilih;

    //Deklarasi komponen yang digunakan pada UI

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        edNama1 = (EditText)findViewById(R.id.edNama1);
        sp1 = (Spinner)findViewById(R.id.spinner1);
        bPilih = (Button)findViewById(R.id.btn_pesan_1);

        //Binding komponen pada UI ke Java

        sp1.setOnItemSelectedListener(new CustomOnItemSelectedListener());

        bPilih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DineInActivity.this, ListMenuActivity.class);
                startActivity(i);
            }
        });

        //Ketika button diklik makan akan berpindah activity ke ListMenuActivity
    }

    public void pesan(View view) {
        String spinner1 = sp1.getSelectedItem().toString();

        if (edNama1 == null){
            Toast.makeText(this, "Isi nama terlebih dahulu", Toast.LENGTH_SHORT).show();
        }else if(spinner1.equalsIgnoreCase("Meja 1")){
            Toast.makeText(this, "Meja 1 telah terpilih", Toast.LENGTH_SHORT).show();
        }else if(spinner1.equalsIgnoreCase("Meja 2")){
            Toast.makeText(this, "Meja 2 telah terpilih", Toast.LENGTH_SHORT).show();
        }
    }

    //Ketika button diklik maka akan mengeluarkan Toast sesuai dengan isi spinner yang dipilih

    public class CustomOnItemSelectedListener implements AdapterView.OnItemSelectedListener{

        //Class ini digunakan sebagai adapter yang menampung Array dari spinner

        String firstItem = String.valueOf(sp1.getSelectedItem());

        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            spinnerLabel = adapterView.getItemAtPosition(i).toString();
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }
}

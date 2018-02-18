package id.hakimrizki.hakim_1202154213_modul2.MenuMakanan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

import id.hakimrizki.hakim_1202154213_modul2.R;

public class DetailMenuActivity extends AppCompatActivity {

    TextView tv_menu, tv_harga;
    ImageView iv_foto;

    //Deklarasi komponen yang digunakan pada UI

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        tv_menu = (TextView)findViewById(R.id.tv_detailFood);
        tv_harga = (TextView)findViewById(R.id.tv_detailPrice);
        iv_foto = (ImageView)findViewById(R.id.iv_detailPhoto);

        //Binding komponen dari UI ke Java

        Intent i = this.getIntent();
        String menu = i.getExtras().getString("nama");
        String harga = i.getExtras().getString("harga");
        int gambar = i.getExtras().getInt("gambar");

        //Mengambil data yang telah dikirim dari intent pada class RecyclerAdapter


        tv_menu.setText(menu);
        tv_harga.setText(harga);
        iv_foto.setImageResource(gambar);

        //Melakukan setText dan setImageResource pada tiap komponen

    }
}

package id.hakimrizki.hakim_1202154213_modul2.MenuMakanan;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

import id.hakimrizki.hakim_1202154213_modul2.R;

/**
 * Created by hakimrizki on 16/02/18.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    Context c;
    ArrayList<Makanan>makanan;

    //Deklarasi komponen ArrayList

    public RecyclerAdapter(Context c, ArrayList<Makanan>makanan) {
        this.c = c;
        this.makanan = makanan;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new RecyclerViewHolder(v);
    }

    //Method diatas digunakan untuk melakukan inflate dari item_list kedalam RecyclerView

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        final String name = makanan.get(position).getName();
        final String harga = makanan.get(position).getHarga();
        final int image = makanan.get(position).getImage();

        holder.tv1.setText(name);
        holder.tv2.setText(harga);
        holder.imageView.setImageResource(image);

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(int pos) {
                openDetailActivity(name, harga, image);
                Toast.makeText(c, name, Toast.LENGTH_SHORT).show();
            }
        });
    }

    //Method diatas digunakan untuk menentukan posisi dari komponen berdasarkan ArrayList yang telah dibuat

    @Override
    public int getItemCount() {
        return makanan.size();
    }

    //Method diatas digunakan untuk menghitung ukuran dari ArrayList

    private void openDetailActivity(String name, String harga, int image){
        Intent i = new Intent(c.getApplicationContext(), DetailMenuActivity.class);
        i.putExtra("nama",name);
        i.putExtra("harga",harga);
        i.putExtra("gambar",image);
        c.startActivity(i);
    }

    //Method diatas digunakan untuk melakukan intent serta membawa data yang akan digunakan pada UI
}

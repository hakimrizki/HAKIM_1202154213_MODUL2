package id.hakimrizki.hakim_1202154213_modul2.MenuMakanan;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import id.hakimrizki.hakim_1202154213_modul2.R;

/**
 * Created by hakimrizki on 16/02/18.
 */

public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    //Class ini digunakan untuk membuat holder yang dipakai ketikan RecyclerView diklik maka akan memberi tahu posisinya
    //urut sesuai dengan ArrayList yang telah dibuat

    TextView tv1,tv2;
    ImageView imageView;
    RecyclerAdapter mAdapter;
    ItemClickListener itemClickListener;

    //Deklarasi komponen yang diperlukan pada UI

    public RecyclerViewHolder(View itemView) {
        super(itemView);

        tv1 = (TextView) itemView.findViewById(R.id.daftar_judul);
        tv2 = (TextView) itemView.findViewById(R.id.daftar_deskripsi);
        imageView = (ImageView) itemView.findViewById(R.id.daftar_icon);

        //Binding komponen dari UI ke Java

        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        this.itemClickListener.onItemClick(this.getLayoutPosition());
    }

    //Method ini digunakan untuk melakukan action click pada RecyclerView
    //pada kasus ini getLayoutPosition() digunakan untuk mengetahui urutan ArrayList dari RecyclerView

    public void setItemClickListener(ItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;
    }
}

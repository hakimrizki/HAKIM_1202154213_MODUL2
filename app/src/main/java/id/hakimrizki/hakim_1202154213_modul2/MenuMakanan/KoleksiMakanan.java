package id.hakimrizki.hakim_1202154213_modul2.MenuMakanan;

import java.util.ArrayList;

import id.hakimrizki.hakim_1202154213_modul2.R;

/**
 * Created by hakimrizki on 17/02/18.
 */

public class KoleksiMakanan {

    //Class ini digunakan untuk membuat ArrayList yang menampung list nama makanan, harga makanan, dan foto makanan

    public static ArrayList<Makanan> getMakanan(){
        ArrayList<Makanan>makanan = new ArrayList<>();
        Makanan makanan1 = null;

        //Pada class Makanan telah dibuat method setter dan getter yang kemudian diset nilainya pada class KoleksiMakanan
        //yang kemudian ditampung oleh RecyclerView seperti coding dibawah ini

        makanan1 = new Makanan();
        makanan1.setName("Nasi Goreng");
        makanan1.setHarga("Harga : Rp 15.000");
        makanan1.setImage(R.drawable.nasi_goreng);
        makanan.add(makanan1);

        makanan1 = new Makanan();
        makanan1.setName("Mie Goreng Spesial");
        makanan1.setHarga("Harga : Rp 10.000");
        makanan1.setImage(R.drawable.mie_goreng_spesial);
        makanan.add(makanan1);

        makanan1 = new Makanan();
        makanan1.setName("Mie Kuah Spesial");
        makanan1.setHarga("Harga : Rp 10.000");
        makanan1.setImage(R.drawable.mie_kuah_spesial);
        makanan.add(makanan1);

        makanan1 = new Makanan();
        makanan1.setName("Sate Madura");
        makanan1.setHarga("Harga : Rp 25.000");
        makanan1.setImage(R.drawable.sate_madura);
        makanan.add(makanan1);

        makanan1 = new Makanan();
        makanan1.setName("Nasi Wagyu");
        makanan1.setHarga("Harga : Rp 30.000");
        makanan1.setImage(R.drawable.nasi_wagyu);
        makanan.add(makanan1);

        makanan1 = new Makanan();
        makanan1.setName("Mie Kuah Upnormal");
        makanan1.setHarga("Harga : Rp 15.000");
        makanan1.setImage(R.drawable.mie_kuah_upnormal);
        makanan.add(makanan1);

        makanan1 = new Makanan();
        makanan1.setName("Nasi Goreng Bawang");
        makanan1.setHarga("Harga : Rp 25.000");
        makanan1.setImage(R.drawable.nasi_goreng_bawang);
        makanan.add(makanan1);

        makanan1 = new Makanan();
        makanan1.setName("Nasi Goreng Kambing");
        makanan1.setHarga("Harga : Rp 15.000");
        makanan1.setImage(R.drawable.nasi_goreng_kambing);
        makanan.add(makanan1);

        return makanan;

    }
}

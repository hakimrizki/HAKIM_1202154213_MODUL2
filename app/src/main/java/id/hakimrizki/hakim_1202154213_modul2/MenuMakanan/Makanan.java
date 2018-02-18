package id.hakimrizki.hakim_1202154213_modul2.MenuMakanan;

/**
 * Created by hakimrizki on 17/02/18.
 */

public class Makanan {

    //Class ini digunakan untuk method setter dan getter terhadap variabel nama, harga, image

    String name;
    String harga;
    int image;

    public Makanan() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}

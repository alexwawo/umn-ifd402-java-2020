package excercise.soal1;

public class Rumah {
    // ini adalah deklarasi property
    private int luas_tanah, luas_bangunan, jumlah_kamar, jumlah_kamar_mandi;
    private String alamat;

    // deklarasi constructor
    Rumah(int luas_tanah, int luas_bangunan){

    }

    // getter to get luas_tanah property value
    public int getLuasTanah(){
        return this.luas_tanah;
    }

    // setter to set luas_tanah property value
    public void setLuasTanah(int luas){
        this.luas_tanah = luas;
    }
}

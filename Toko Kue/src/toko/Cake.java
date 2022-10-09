package toko;

public abstract class Cake {
    protected String nama;
    protected int hargaKue;

    protected String getNama() {
        return nama;
    }

    protected void setNama(String nama) {
        this.nama = nama;
    }

    protected int getHargaKue() {
        return hargaKue;
    }

    protected void setHargaKue(int hargaKue) {
        this.hargaKue = hargaKue;
    }
        
    protected abstract void tampil(String nama, String topping, int hargaKue);
}
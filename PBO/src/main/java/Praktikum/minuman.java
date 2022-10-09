package Praktikum;
public class minuman extends Pesanan{
    public static String pelengkap;
    
    minuman(String namaMinuman, int hargaMinuman,int hargaPelengkap){
        nama = namaMinuman;
        harga1 = hargaMinuman;
        harga2 = hargaPelengkap;
    }

    public String getPelengkap() {
        return pelengkap;
    }

    public void setPelengkap(String pelengkap) {
        minuman.pelengkap = pelengkap;
    }
    
    @Override
    void showMenu(){
        System.out.println("----------------------------------");
        System.out.println("           Menu Minuman");
        System.out.println("----------------------------------");
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public int getHarga1() {
        return harga1;
    }

    @Override
    public void setHarga1(int harga1) {
        this.harga1 = harga1;
    }

    @Override
    public int getHarga2() {
        return harga2;
    }

    @Override
    public void setHarga2(int harga2) {
        this.harga2 = harga2;
    }
}
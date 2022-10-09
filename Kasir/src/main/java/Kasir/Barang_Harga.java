package Kasir;

import static Kasir.Main.print;


class Barang_Harga {
    String nama_Barang;
    protected int harga_barang;

    protected String getNama_Barang() {
        return nama_Barang;
    }

    protected void setNama_Barang(String nama_Barang) {
        this.nama_Barang = nama_Barang;
    }

    protected int getHarga_barang() {
        return harga_barang;
    }

    protected void setHarga_barang(int harga_barang) {
        this.harga_barang = harga_barang;
    }
    
    
    void display(){
        System.out.println("Nama Barang : " + nama_Barang);
        System.out.println("Harga Barang : " + harga_barang);
    }
}

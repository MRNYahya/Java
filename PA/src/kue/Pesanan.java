/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kue;

public class Pesanan {
    private String nama;
    private String alamat;
    private String kue;
    private int jumlah;
    private int harga;
    public Pesanan(String nama, String alamat, String kue, int jumlah, int harga) {
        this.nama = nama;
        this.alamat = alamat;
        this.kue = kue;
        this.jumlah = jumlah;
        this.harga = harga;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKue() {
        return kue;
    }

    public void setKue(String kue) {
        this.kue = kue;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getHarga() {
        return harga;
    }

    public void 
        setHarga(int harga) {
        this.harga = harga;
    }
}


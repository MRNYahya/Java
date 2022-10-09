package Praktikum;
public abstract class Pesanan {
    protected String nama;
    protected int harga1,harga2;
    
    public abstract String getNama();
    
    public abstract void setNama(String nama);
    
    public abstract int getHarga1();
    
    public abstract void setHarga1(int harga1);
    
    public abstract int getHarga2();
    
    public abstract void setHarga2(int harga2);
    
    void showMenu(){
        System.out.println(this.nama);
        System.out.println(this.harga1);
        System.out.println(this.harga2);
    }
}
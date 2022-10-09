package Praktikum;
public class makanan extends Pesanan{    
    protected String saus,toping;
    
    
    public makanan(String namaMakanan, int hargaMakanan, String topingMakanan,int hargaToping){
        nama = namaMakanan;
        harga1 = hargaMakanan;
        toping = topingMakanan;
        harga2 = hargaToping;
    }
    

    public String getSaus() {
        return saus;
    }

    public void setSaus(String saus) {
        this.saus = saus;
    }
    
    public String getToping(){
        return toping;
    }
    
    public void setToping(String toping){
        this.toping = toping;
    }
    
    @Override
    void showMenu(){
        System.out.println("----------------------------------");
        System.out.println("           Menu Makanan");
        System.out.println("----------------------------------");
    }
    void showSaus(){
        System.out.println("----------------------------------");
        System.out.println("               Saus");
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


package Posttest1;
public class pesanan {
    protected String nama,toping;
    protected int harga;
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getToping(){
        return toping;
    }
    
    public void setToping(String toping){
        this.toping = toping;
    }
    
    public int getHarga(){
        return harga;
    }
    
    public void setHarga(int harga){
        this.harga = harga;
    }
    
    void showData(){
        System.out.println(this.nama);
        System.out.println(this.toping);
        System.out.println(this.harga);
    }
}
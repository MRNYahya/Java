package Posttest1;
public class makanan extends pesanan{    
    private String saus;

    public String getSaus() {
        return saus;
    }

    public void setSaus(String saus) {
        this.saus = saus;
    }
        
    @Override
    void showData(){
        System.out.println(this.nama);
        System.out.println(this.toping);
        System.out.println(this.harga);
        System.out.println(this.saus);

    }
}


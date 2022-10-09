package Posttest1;
public class minuman extends pesanan{
    private String pemanis;

    public String getPemanis() {
        return pemanis;
    }

    public void setPemanis(String pemanis) {
        this.pemanis = pemanis;
    }
    
    @Override
    void showData(){
        System.out.println(this.nama);
        System.out.println(this.toping);
        System.out.println(this.harga);
        System.out.println(this.pemanis);
    }
}

package Posttest1;
public class Main {
    public static void main(String args[]) {
        makanan ayam = new makanan();
        makanan burger = new makanan();
        minuman air = new minuman();
        minuman teh = new minuman();
        
        ayam.setNama("Ayam goreng");
        ayam.setToping("kabdubuic");
        ayam.setHarga(5000);
        ayam.setSaus("Saus gratis");
        
        burger.setNama("Burger");
        burger.setToping("kabdubuic");
        burger.setHarga(7000);
        burger.setSaus("Mayo");
        
        air.setNama("air");
        air.setToping("kabdubuic");
        air.setHarga(1000);
        air.setPemanis("manis gula");
        
        teh.setNama("teh");
        teh.setToping("kabdubuic");
        teh.setHarga(2000);
        teh.setPemanis("manis banget");
        
        ayam.showData();
        
        
    }
}
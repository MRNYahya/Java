package Kasir;

import java.util.Scanner;
  

public class Main {

    static void print(String printt){
        System.out.println(printt);
    }
    
    
    
    
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        
        
        print("Nama : Satria Bagus Eka Candra");
        print("NIM  : 2009106016");
        print("==============================================");
        
        print("SELAMAT DATANG DI APLIKASI KASIR MURYA CELL SAMARINDA");
        print("");
        
        print("==============================================");
        print("");
        
        print("Daftar Nama barang & Harga");
        print("");
        
        Realme realme = new Realme("C11");
        realme.nama_Barang = "Realme";
        realme.harga_barang = 2999000;
        realme.display();
        System.out.println("merek : " + realme.merek_realme );
        print("");
        
        Realme realme1 = new Realme("C15");
        realme1.setNama_Barang("Realme");
        realme1.setHarga_barang(3400000);
        realme1.display();
        System.out.println("merek : " + realme1.merek_realme );
        print("");
        
        Realme realme2 = new Realme("Realme 8");
        realme2.setNama_Barang("Realme");
        realme2.setHarga_barang(3400000);
        realme2.display();
        System.out.println("merek : " + realme2.merek_realme );
        print("");
             
        Samsung samsung = new Samsung();
        samsung.setNama_Barang("Samsung");
        samsung.setHarga_barang(4999000);
        samsung.setMerek_Samsung("AO2");
        samsung.display();
        System.out.println("");
        
        Samsung samsung1 = new Samsung();
        samsung1.setNama_Barang("Samsung");
        samsung1.setHarga_barang(2499000);
        samsung1.setMerek_Samsung("A52");
        samsung1.display();
        System.out.println("");
        
        Samsung samsung2 = new Samsung();
        samsung2.setNama_Barang("Samsung");
        samsung2.setHarga_barang(7999000);
        samsung2.setMerek_Samsung("A71");
        samsung2.display();
        System.out.println("");
    }
}

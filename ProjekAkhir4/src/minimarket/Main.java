
package minimarket;

import java.io.IOException;
import java.util.*;
import produk.*;
import proses.*;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Scanner inputInt = new Scanner(System.in);
    static String option, admin;
    static ProsesMakanan prosesMakanan = new ProsesMakanan();
    static ProsesProduk prosesProduk  = new ProsesProduk();
    static ArrayList<Produk> arrProduk = new ArrayList<>();
    static ArrayList<Produk> arrMakan = new ArrayList<>();
    static ArrayList<Customer> arrPesan = new ArrayList<>();
    
    public static void main(String[] args) {
        Boolean ulang,ulang2,ulang3;
        System.out.println("\t   ＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝");
        System.out.println("\t     P E N D A T A A N   B A R A N G ");
        System.out.println("\t         M I N I M A R K E T      ");
        System.out.println("\t   ＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝\n\n");
        
        ulang = getAdmin();
        while(ulang){
            menuProduk();
            switch (option) {
                case "1":
                    ulang2 = true;
                    while(ulang2){
                        menuAdmin();
                        switch (admin){
                            case "1":
                                getTambah(prosesProduk,arrProduk);
                                break;
                            case "2":
                                prosesProduk.tampil(arrProduk);
                                break;
                            case "3":
                                prosesProduk.cari(arrProduk);
                                break;
                            case "4":
                                arrProduk = prosesProduk.ubah(arrProduk);
                                prosesProduk.tampil(arrProduk);
                                break;
                            case "5":
                                prosesProduk.hapus(arrProduk);
                                break;
                            case "6":
                                ulang2 = false;
                                break;
                            case "7":
                                System.err.println("\n\n\t\t:--------------------------------:");
                                System.err.println("\t\t| Anda Telah Keluar dari Program |");
                                System.err.println("\t\t:--------------------------------:");
                                System.exit(0);
                            default:
                                System.err.println("\t\t\n!! Pilihan Tidak Tersedia !!\n");
                                break;
                        }
                    }
                    break;

                case "2":
                    ulang3 = true;
                    while (ulang3){
                        menuAdmin();
                        switch (admin){
                            case "1":
                                getTambah(prosesMakanan,arrMakan);
                                break;
                            case "2":
                                prosesMakanan.tampil(arrMakan);
                                break;
                            case "3":
                                prosesMakanan.cari(arrMakan);
                                break;
                            case "4":
                                arrMakan = prosesMakanan.ubah(arrMakan);
                                prosesMakanan.tampil(arrMakan);
                                break;
                            case "5":
                                prosesMakanan.hapus(arrMakan);
                                break;
                            case "6":
                                ulang3 = false;
                                break;
                            case "7":
                                System.err.println("\n\n\t\t:--------------------------------:");
                                System.err.println("\t\t| Anda Telah Keluar dari Program |");
                                System.err.println("\t\t:--------------------------------:");
                                System.exit(0);
                                break;
                            default:
                                System.err.println("\t\t\n!! Pilihan Tidak Tersedia !!\n");
                                break;
                        }
                    }
                    break;
                    
                case "3":
                    prosesProduk.tampil(arrProduk);
                    prosesProduk.pemesan(arrProduk, arrPesan);
                    prosesProduk.tampilStruk(arrPesan);
                    break;
                    
                case "4":
                    prosesProduk.tampil(arrMakan);
                    prosesProduk.pemesan(arrMakan, arrPesan);
                    prosesProduk.tampilStruk(arrPesan);
                    break;
                
                case "5":
                    System.err.println("\n\n\t\t:--------------------------------:");
                    System.err.println("\t\t| Anda Telah Keluar dari Program |");
                    System.err.println("\t\t:--------------------------------:");
                    
                    System.exit(0);
                    break;
                    
                default:
                    System.err.println("\t\t\n!! Pilihan Tidak Tersedia !!\n");
                    break;
            }
        }
    }
    
    public static String menuProduk(){
        System.out.println("\n\n\t\t:-------------------:");
        System.out.println("\t\t|      M E N U      |");
        System.out.println("\t\t:-------------------:");
        System.out.println("\t\t| 1. Produk Barang  |");
        System.out.println("\t\t| 2. Produk Makanan |");
        System.out.println("\t\t| 3. Beli Cake      |");
        System.out.println("\t\t| 4. Beli Cookies   |");
        System.out.println("\t\t| 5. Keluar         |");
        System.out.println("\t\t:-------------------:");
        System.out.print("\t\t Pilih Menu : ");
        option = input.next();
        return option;
    }
    
    public static String menuAdmin(){
        System.out.println("\n\n\t    :---------------------------:");
        System.out.println("\t    |        B A R A N G        |");
        System.out.println("\t    :---------------------------:");
        System.out.println("\t    | 1. Tambahkan Data Produk  |");
        System.out.println("\t    | 2. Tampilkan Data Produk  |");
        System.out.println("\t    | 3. Cari Data Produk       |");
        System.out.println("\t    | 4. Ubah Data Produk       |");
        System.out.println("\t    | 5. Hapus Data Produk      |");
        System.out.println("\t    | 6. Kembali ke Menu Produk |");
        System.out.println("\t    | 7. Keluar                 |");
        System.out.println("\t    :---------------------------:");
        System.out.print  ("\t     Pilih Menu : ");
        admin = input.next();
        return admin;
    }
    
    public static Produk tambahProduk(Proses proses) throws IOException {
        Produk dataP = proses.tambah();
        return dataP;
    }
    
    private static boolean getAdmin(){
        boolean admin;
        User user = new User();
        
        System.out.print("\t\tUsername  : ");
        String uname = input.nextLine();
        System.out.print("\t\tPassword  : ");
        String pass = input.nextLine();
        System.out.print("\n\n");
        
        while(!uname.equals(user.getUsername()) || !pass.equals(user.getPassword())){
            System.err.print("\n\t           !! ALERT !!            ");
            System.err.print("\n\t  Username atau Password Anda Salah ");
            
            System.err.print("\n\n\n\t     Username  : ");
            uname = input.nextLine();
            System.err.print("\t     Password  : ");
            pass = input.nextLine();
            System.err.print("\n\n");
        }
        admin = true;
        return admin;
    }
    
    private static void getTambah(Proses proses, ArrayList<Produk> arr){
        int jumlah;
        boolean ulang4 = true;
        
        while(ulang4){
            System.out.print("\n\n\t     Jumlah Data Input : ");
            String strJumlah = input.next();
            if (strJumlah.equals("0")){
                System.err.println("\n\t              !! ALERT !!            ");
                System.err.println("\t     Data yang Diinput Tidak Boleh 0 \n\n");
            } else {
                try{
                    jumlah = Integer.parseInt(strJumlah);
                    for (int i=0; i<jumlah; i++){
                        arr.add(tambahProduk(proses));
                        ulang4 = false;
                    }
                } catch (Exception e) {
                    System.err.println("\n\t               !! ALERT !!");
                    System.err.println("\t     Data yang Anda Inputkan Tidak Sesuai.");
                    System.err.println("\t             Masukkan Angka \n\n");
                }
            }
        }
    }
   
}

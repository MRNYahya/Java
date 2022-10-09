
package proses;

import java.util.*;
import produk.*;

public class ProsesProduk extends Proses {
    
    Scanner input = new Scanner(System.in);
    Scanner inputA = new Scanner(System.in);
    
    @Override
    public Produk tambah(){
        boolean ulang = true;
        Produk dataP = new Produk();
        
        System.out.println("\n\n\t    :-------------------------------:");
        System.out.println("\t    |   TAMBAH DATA PRODUK BARANG   |");
        System.out.println("\t    :-------------------------------:");
        System.out.print  ("\t     Nama Produk Barang  : ");
        dataP.setNama(input.nextLine());
        System.out.print  ("\t     Berat Produk (gram) : ");
        dataP.setBerat(input.nextLine());
        System.out.print  ("\t     Stok Barang         : ");
        dataP.setStok(input.nextLine());
        while(ulang){
            System.out.print("\t     Harga Beli Produk   : ");
            String strHarga = inputA.next();
            if (strHarga.equals("0")){
                System.err.print("\n\t           !! ALERT !!            ");
                System.err.println("\t   Data Ini Tidak Boleh Bernilai 0");
            } else{
                try{
                    dataP.setHargaBeli(Integer.parseInt(strHarga));
                    System.out.println("\n\t    :: Data Produk Barang Berhasil ditambah ✓ ::\n");
                    ulang = false;
                } catch(NumberFormatException e){
                    System.err.println("\t     Input Tidak Sesuai, Masukkan Angka");
                }
            }
        }
        return dataP;
    }
    
    

    @Override
    public void tampil(ArrayList<Produk> arrProduk) {
        System.out.println("\n\n    :----------------------------------------------------------------------------------:");
        System.out.println("    |                       D A T A   P R O D U K   B A R A N G                        |");
        System.out.println("    :----------------------------------------------------------------------------------:");
        System.out.println("    | No |    Nama    |     Berat(g)    |   Harga Beli   |   Harga Jual   |    Stok    |");
        System.out.println("    :----------------------------------------------------------------------------------:");
        for (int i=0; i<arrProduk.size(); i++){
            System.out.printf("|%2d",(i+1),"");
            System.out.printf(" |\t%4s  ",arrProduk.get(i).nama);
            System.out.printf("|\t%-10s",arrProduk.get(i).berat);
            System.out.printf("|\t%-10s",arrProduk.get(i).hargaBeli);
            System.out.printf("|\t%-10s",(arrProduk.get(i).hargaBeli+(arrProduk.get(i).hargaBeli*20/100)));
            System.out.printf("|\t%s",arrProduk.get(i).stok);
            System.out.println("\t|");
        }
    }

    @Override
    public void hapus(ArrayList<Produk> arrProduk) {
        int hapus;
        boolean ulang = true;
        System.out.println("\n\n\t    :-----------------------------------:");
        System.out.println("\t    |    MENGHAPUS DATA PRODUK BARANG   |");
        System.out.println("\t    :-----------------------------------:");
        for (int i=0; i<arrProduk.size(); i++){
            System.out.println("\t     Index ["+i+"] Produk : " + arrProduk.get(i).nama);
        }
        while(ulang){
            System.out.print("\n\t     Input Index Hapus : ");
            String strHapus = inputA.next();
            try{
                hapus = Integer.parseInt(strHapus);
                arrProduk.remove(hapus);
                System.out.println("\n\t    :: Data Produk Barang Berhasil diHapus ✓ ::\n");
                ulang = false;
            } catch (NumberFormatException e) {
                System.err.println("\t    Input Tidak Sesuai, Masukan Angka");
            } catch(IndexOutOfBoundsException e){
                System.err.println("\t    Index yang Anda Input Melebihi Batas");
            }
        }
    }

    @Override
    public void cari(ArrayList<Produk> arrProduk) {
        String cari;
        System.out.println("\n\n\t    :-----------------------------------:");
        System.out.println("\t    |     MENCARI DATA PRODUK BARANG    |");
        System.out.println("\t    :-----------------------------------:");
        System.out.print  ("\t      Produk yang Dicari : ");
        cari = input.nextLine();
        
        for (int i=0; i<arrProduk.size(); i++){
            if (arrProduk.get(i).getNama().equalsIgnoreCase(cari)){
                System.out.println("\n\n\t    :-----------------------------------------:");
                System.out.println("\t    |     Data ditemukan pada index ke-["+i+"]    |");
                System.out.println("\t    :-----------------------------------------:");
                System.out.println("\t     Nama Produk Barang  : " + arrProduk.get(i).getNama());
                System.out.println("\t     Berat Produk (gram) : " + arrProduk.get(i).getBerat());
                System.out.println("\t     Harga Beli Produk   : Rp" + arrProduk.get(i).getHargaBeli());
                System.out.println("\t     Harga Jual Produk   : Rp" + (arrProduk.get(i).getHargaBeli()+(arrProduk.get(i).getHargaBeli()*0.2)));
                System.out.println("\t     Stok Barang         : " + arrProduk.get(i).getStok());
            }
        }
    }

    @Override
    public ArrayList<Produk> ubah(ArrayList<Produk> arrProduk) {
        int ubah;
        boolean ulang = true, ulang2 = true;
        System.out.println("\n\n\t    :-----------------------------------------:");
        System.out.println("\t    |       MENGUBAH DATA PRODUK BARANG       |");
        System.out.println("\t    :-----------------------------------------:");
        for (int i=0; i<arrProduk.size(); i++){
            System.out.println("\t     Index ["+i+"] Produk : " + arrProduk.get(i).nama);
        }
        while(ulang){
            System.out.print("\n\t     Input Index Ubah : ");
            String strUbah = inputA.next();
            try{
                ubah = Integer.parseInt(strUbah);
                arrProduk.get(ubah);
                System.out.print("\n\t     Nama [Baru]  : ");
                arrProduk.get(ubah).setNama(input.nextLine());
                System.out.print("\t     Berat [Baru] : ");
                arrProduk.get(ubah).setBerat(input.nextLine());
                System.out.print("\t     Stok [Baru]  : ");
                arrProduk.get(ubah).setStok(input.nextLine());
                while(ulang2){
                    System.out.print("\t     Harga [Baru] : ");
                    String strHarga = inputA.next();
                    try{
                        arrProduk.get(ubah).setHargaBeli(Integer.parseInt(strHarga));
                        System.out.println("\n\t    :: Data Produk Barang Berhasil diUbah ✓ ::\n");
                        ulang2 = false;
                        ulang=false;
                    } catch (NumberFormatException ex){
                        System.err.println("\t     Input Tidak Sesuai, Masukan Angka");
                    }
                }
            } catch (NumberFormatException e){
                System.err.println("\t     Input Tidak Sesuai, Masukan Angka");
            } catch(IndexOutOfBoundsException e){
                System.err.println("\t     Index yang Anda Input Melebihi Batas");
                
            }
            
        }
        return arrProduk;
    }
    
    public Customer pemesan(ArrayList<Produk> beli, ArrayList<Customer> beli2){
        boolean ulang = true;
        Customer cust = new Customer();
        Produk dataP = new Produk();
        
        System.out.println("Masukan data pemesan");
        System.out.print("Nama Pemesan : ");
        cust.setNamaCus(input.nextLine());
        System.out.print("Pesanan      : ");
        cust.setPesanan(input.nextLine());
        for (int i=0; i<beli.size(); i++){
            if (cust.getPesanan().equalsIgnoreCase(beli.get(i).nama)){
                System.out.println("Keranjang    : " + beli.get(i).nama + "-" + beli.get(i).hargaBeli);
                while(ulang){
                    System.out.print("Jumlah Beli  : ");
                    String strJumlah = input.nextLine();
                    if (strJumlah.equals("0")){
                        System.err.print("\n\t           !! ALERT !!            ");
                        System.err.println("\t   Data Ini Tidak Boleh Bernilai 0");
                    } else{
                        try{
                            cust.setJumlah(Integer.parseInt(strJumlah));
                            cust.setTotal((beli.get(i).hargaBeli*cust.getJumlah()));
                            System.out.println("Total Harga : " + cust.getTotal());
                            beli2.add(cust);
                            ulang = false;
                        } catch(NumberFormatException e){
                            System.err.println("\t     Input Tidak Sesuai, Masukkan Angka");
                        }
                    }
                }
            }
        }
        System.out.print("Alamat       : ");
        cust.setAlamat(input.nextLine());
        System.out.print("Status       : ");
        cust.setStatus(input.nextLine());
        
        return cust;
    }
    
    public void tampilStruk(ArrayList<Customer> struk) {
        for (int i=0; i<struk.size(); i++){
            System.out.println("\n\n>> Struk Pembelian <<");
            System.out.println("Nama Pemesan : " + struk.get(i).namaCus);
            System.out.println("Pesanan      : " + struk.get(i).pesanan);
            System.out.println("Alamat       : " + struk.get(i).alamat);
            System.out.println("Status       : " + struk.get(i).status);
            System.out.println("Jumlah Beli  : " + struk.get(i).jumlah);
            System.out.println("Total        : " + struk.get(i).total);
            System.out.println("\n Silahkan bayar via OVO atau Gopay atau Transfer");
        }
    }

}

package Praktikum;
public final class Main {
    public final static void main(String args[]) {
        final String pelengkap = "Susu";
        final String saus = "Saus Tomat(free)\nSaus Sambal(free)\nkecap(free)\nSambal(free)\n";
        
        makanan menu1 = new makanan("",0,"",0);
        minuman menu2 = new minuman("",0,0);
        
        makanan mieayam = new makanan("Mie Ayam",12000,"telur/pentol",2000);
        makanan bakso = new makanan("Bakso",17000,"keripik/siomay/tahu",1000);
        makanan nasgor = new makanan("Nasi Goreng",5000,"sosis/hati/pentol/ayam",2000);
        makanan ramen = new makanan("Ramen",12000,"katsu/sosis/nori/telur",6000);
        
        minuman esbuah = new minuman("Es Buah",15000,0);
        minuman jus = new minuman("Jus",12000,0);
        minuman teh = new minuman("Teh",5000,1000);
        minuman kopi = new minuman("Kopi",5000,1000);
        
        menu1.showMenu();
        System.out.println(mieayam.nama+"               : Rp."+mieayam.harga1+"\n+"+mieayam.toping+"          :+Rp."+mieayam.harga2+"\n");
        System.out.println(bakso.nama+"                  : Rp."+bakso.harga1+"\n+"+bakso.toping+"   :+Rp."+bakso.harga2+"\n");
        System.out.println(nasgor.nama+"            : Rp."+nasgor.harga1+"\n+"+nasgor.toping+":+Rp."+nasgor.harga2+"\n");
        System.out.println(ramen.nama+"                  : Rp."+ramen.harga1+"\n+"+ramen.toping+":+Rp."+ramen.harga2+"\n");
        menu1.showSaus();
        System.out.println(saus);
        
        menu2.showMenu();
        System.out.println(esbuah.nama+"          : Rp."+esbuah.harga1);
        System.out.println("+"+pelengkap+"\n");
        System.out.println(jus.nama+"              : Rp."+jus.harga1);
        System.out.println("+"+pelengkap+"\n");
        System.out.println(teh.nama+"              : Rp."+teh.harga1);
        System.out.println("+"+pelengkap+"            :+Rp."+teh.harga2+"\n");
        System.out.println(kopi.nama+"             : Rp."+kopi.harga1);
        System.out.println("+"+pelengkap+"            :+Rp."+kopi.harga2+"\n");
        
    }
}
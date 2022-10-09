package toko;

public class Rainbow extends Cake implements Lilin {
    private String topping;
    private static int jumlahKue;

    public Rainbow(String nama, String topping, int hargaKue) {
        this.nama = nama;
        this.topping = topping;
        this.hargaKue = hargaKue;
        Rainbow.jumlahKue++;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
    
    public static int getJumlahKue() {
        return jumlahKue;
    }

    public static void setJumlahKue(int jumlahKue) {
        Rainbow.jumlahKue = jumlahKue;
    }

    @Override
    public final void tampil(String nama, String topping, int hargaKue) {
        System.out.println("Nama Kue : " + nama);
        System.out.println("Topping Kue : " + topping);
        System.out.println("Harga Kue : " + hargaKue);
    }

    @Override
    public void menyala() {
        System.out.println("Lilin kue ini menyala");
    }

    @Override
    public void mati() {
        System.out.println("Lilin kue ini mati");
    }
}
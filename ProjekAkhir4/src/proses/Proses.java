
package proses;

import java.util.*;
import produk.*;

public abstract class Proses {
    
    public abstract Produk tambah();
    public abstract void tampil(ArrayList<Produk> arr);
    public abstract void hapus(ArrayList<Produk> arr);
    public abstract void cari(ArrayList<Produk> arr);
    public abstract ArrayList<Produk> ubah(ArrayList<Produk> arr);
    
}

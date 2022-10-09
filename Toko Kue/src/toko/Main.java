package toko;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public final class Main {

    static ArrayList<Rainbow> kueLists;
    static ArrayList<Pesanan> pesananLists;
    static boolean isEditing = false;
    static Scanner input;
    
    public static void main(String[] args) {       
        kueLists = new ArrayList<>();
        pesananLists = new ArrayList<>();
        input = new Scanner(System.in);

        while (true) {
            showMenu();
        }
    }
    
    static void clearScreen() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                // clear screen untuk windows
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();
            } else {
                // clear screen untuk Linux, Unix, Mac
                Runtime.getRuntime().exec("clear");
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final IOException | InterruptedException e) {
            System.out.println("Error karena: " + e.getMessage());
        }
    }
    
    static void showMenu() {
        System.out.println("=== MANAJEMEN TOKO KUE ===");
        System.out.println("[1] Lihat Kue List");
        System.out.println("[2] Tambah Kue List");
        System.out.println("[3] Edit Kue List");
        System.out.println("[4] Hapus Kue List");
        System.out.println("[5] Lihat Pesanan List");
        System.out.println("[6] Tambah Pesanan List");
        System.out.println("[7] Edit Pesanan List");
        System.out.println("[8] Hapus Pesanan List");
        System.out.println("[0] Keluar");
        System.out.println("---------------------");
        System.out.print("Pilih menu> ");

        String selectedMenu = input.nextLine();

        if (selectedMenu.equals("1")) {
            showKueList();
        } else if (selectedMenu.equals("2")) {
            addKueList();
        } else if (selectedMenu.equals("3")) {
            editKueList();
        } else if (selectedMenu.equals("4")) {
            deleteKueList();
        } else if (selectedMenu.equals("5")) {
            showPesananList();
        } else if (selectedMenu.equals("6")) {
            addPesananList();
        } else if (selectedMenu.equals("7")) {
            editPesananList();
        } else if (selectedMenu.equals("8")) {
            deletePesananList();
        } else if (selectedMenu.equals("0")) {
            System.exit(0);
        } else {
            System.out.println("Kamu salah pilih menu!");
            backToMenu();
        }        
    }
    
    static void backToMenu() {
        System.out.println("");
        System.out.print("Tekan [Enter] untuk kembali..");
        input.nextLine();
        clearScreen();        
    }
    
    static void readKueList() {
        try {
            String sql = "SELECT * FROM `kue`";
            Connection conn = (Connection)Config.configDB();
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(sql);
            
            kueLists.clear();
            while(res.next()) {
                kueLists.add(new Rainbow(
                        res.getString(2),
                        res.getString(3),
                        res.getInt(4)
                ));
            }
        } catch(SQLException e) {
            System.out.println("Terjadi kesalahan karena: " + e.getMessage());
        }
    }
    
    static void showKueList() {
        clearScreen();
        readKueList();
        if (kueLists.size() > 0) {
            System.out.println("KUE LIST:");
            for (int i = 0; i < kueLists.size(); i++) {
                System.out.print(i+1 + ".");
                kueLists.get(i).tampil(kueLists.get(i).getNama(), kueLists.get(i).getTopping(), kueLists.get(i).getHargaKue());
            }
        } else {
            System.out.println("Tidak ada data!");
        }

        if (!isEditing) {
            backToMenu();
        }        
    }

    static void addKueList() {
        clearScreen();

        System.out.print("Nama Kue : ");
        String nama = input.nextLine();
        System.out.print("Topping : ");
        String topping = input.nextLine();
        System.out.print("Harga : ");
        int harga = input.nextInt();

        try {
            String sql = "INSERT INTO `kue` (`nama`, `topping`, `harga`) VALUES ('" + nama + "', '" + topping + "', '" + harga + "')";
            Connection conn = (Connection)Config.configDB();
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            kueLists.add(new Rainbow(nama, topping, harga));
            System.out.println("Berhasil ditambahkan!");
        } catch (SQLException e) {
            System.out.println("Terjadi kesalahan karena: " + e.getMessage());
        }

        backToMenu();
    }
    
    static void editKueList() {
        isEditing = true;
        showKueList();

        try {
            System.out.println("-----------------");
            System.out.print("Pilih Indeks> ");
            int index = Integer.parseInt(input.nextLine());

            if (index > kueLists.size()) {
                throw new IndexOutOfBoundsException("Kamu memasukan data yang salah!");
            } else {

                System.out.print("Nama Kue baru: ");
                String nama = input.nextLine();
                System.out.print("Topping baru : ");
                String topping = input.nextLine();
                System.out.print("Harga baru : ");
                int harga = input.nextInt();

                try {
                    String sql = "UPDATE `kue` SET `nama` = '" + nama + "', `topping` = '" + topping + "', `harga` = '" + harga + "' WHERE `nama` = '" + kueLists.get(index).getNama() + "'";
                    Connection conn = (Connection)Config.configDB();
                    Statement stmt = conn.createStatement();
                    stmt.execute(sql);
                    kueLists.set(index-1, new Rainbow(nama, topping, harga));
                    System.out.println("Berhasil diubah!");
                } catch(SQLException e) {
                    System.out.println("Terjadi kesalahan karena: " + e.getMessage());
                }
            }
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        isEditing = false;
        backToMenu();        
    }
    
    static void deleteKueList() {
        isEditing = true;
        showKueList();

        System.out.println("-----------------");
        System.out.print("Pilih Indeks> ");
        int index = Integer.parseInt(input.nextLine());

        try {
            if (index > kueLists.size()) {
                throw new IndexOutOfBoundsException("Kamu memasukan data yang salah!");
            } else {

                System.out.println("Kamu akan menghapus:");
                System.out.println("[" + index + "] " + kueLists.get(index-1).getNama());
                System.out.println("Apa kamu yakin?");
                System.out.print("Jawab (y/t): ");
                String jawab = input.nextLine();

                if (jawab.equalsIgnoreCase("y")) {
                    try {
                        String sql = "DELETE FROM `kue` WHERE `nama` = '" + kueLists.get(index-1).getNama() + "'";
                        Connection conn = (Connection)Config.configDB();
                        Statement stmt = conn.createStatement();
                        stmt.execute(sql);
                        kueLists.remove(index-1);
                        System.out.println("Berhasil dihapus!");
                    } catch(SQLException e) {
                        System.out.println("Terjadi kesalahan karena: " + e.getMessage());
                    }
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        isEditing = false;
        backToMenu();        
    }

    static void readPesananList() {
        try {
            String sql = "SELECT * FROM `pesanan`";
            Connection conn = (Connection)Config.configDB();
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(sql);
            
            pesananLists.clear();
            while(res.next()) {
                pesananLists.add(new Pesanan(
                        res.getString(2),
                        res.getString(3),
                        res.getString(4),
                        res.getInt(5),
                        res.getString(6)
                ));
            }
            System.out.println(pesananLists);
        } catch(SQLException e) {
            System.out.println("Terjadi kesalahan karena: " + e.getMessage());
        }
    }
    
    static void showPesananList() {
        clearScreen();
        readPesananList();
        if (pesananLists.size() > 0) {
            System.out.println("PESANAN LIST:");
            int index = 0;
            for (int i = 0; i < pesananLists.size(); i++) {
                System.out.print(i+1 + ".");
                System.out.println(pesananLists.get(i).getNama());
                System.out.println(pesananLists.get(i).getAlamat());
                System.out.println(pesananLists.get(i).getKue());
                System.out.println(pesananLists.get(i).getJumlah());
                System.out.println(pesananLists.get(i).getStatus());
            }
        } else {
            System.out.println("Tidak ada data!");
        }

        if (!isEditing) {
            backToMenu();
        }        
    }

    static void addPesananList() {
        clearScreen();

        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("Alamat : ");
        String alamat = input.nextLine();
        System.out.print("Kue : ");
        String kue = input.nextLine();
        System.out.print("Jumlah : ");
        int jumlah = input.nextInt();

        try {
            String sql = "INSERT INTO `pesanan` (`nama`, `alamat`, `kue`, `jumlah`, `status`) VALUES ('" + nama + "', '" + alamat + "', '" + kue + "', '" + jumlah + "', 'Proses')";
            Connection conn = (Connection)Config.configDB();
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            pesananLists.add(new Pesanan(
                    nama,
                    alamat,
                    kue,
                    jumlah,
                    "Proses"
            ));
            System.out.println("Berhasil ditambahkan!");
        } catch (SQLException e) {
            System.out.println("Terjadi kesalahan karena: " + e.getMessage());
        }

        backToMenu();
    }
    
    static void editPesananList() {
        isEditing = true;
        showPesananList();

        try {
            System.out.println("-----------------");
            System.out.print("Pilih Indeks> ");
            int index = Integer.parseInt(input.nextLine());

            if (index > pesananLists.size()) {
                throw new IndexOutOfBoundsException("Kamu memasukan data yang salah!");
            } else {

                System.out.print("Status : ");
                String status = input.nextLine();

                try {
                    String sql = "UPDATE `pesanan` SET `status` = '" + status + "' WHERE `nama` = '" + pesananLists.get(index-1).getNama() + "'";
                    Connection conn = (Connection)Config.configDB();
                    Statement stmt = conn.createStatement();
                    stmt.execute(sql);
                    System.out.println("Berhasil diubah!");
                } catch(SQLException e) {
                    System.out.println("Terjadi kesalahan karena: " + e.getMessage());
                }
            }
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        isEditing = false;
        backToMenu();        
    }
    
    static void deletePesananList() {
        isEditing = true;
        showKueList();

        System.out.println("-----------------");
        System.out.print("Pilih Indeks> ");
        int index = Integer.parseInt(input.nextLine());

        try {
            if (index > kueLists.size()) {
                throw new IndexOutOfBoundsException("Kamu memasukan data yang salah!");
            } else {

                System.out.println("Kamu akan menghapus:");
                System.out.println("[" + index + "] " + pesananLists.get(index-1).getNama());
                System.out.println("Apa kamu yakin?");
                System.out.print("Jawab (y/t): ");
                String jawab = input.nextLine();

                if (jawab.equalsIgnoreCase("y")) {
                    try {
                        String sql = "DELETE FROM `kue` WHERE `nama` = '" + pesananLists.get(index-1).getNama() + "'";
                        Connection conn = (Connection)Config.configDB();
                        Statement stmt = conn.createStatement();
                        stmt.execute(sql);
                        kueLists.remove(index-1);
                        System.out.println("Berhasil dihapus!");
                    } catch(SQLException e) {
                        System.out.println("Terjadi kesalahan karena: " + e.getMessage());
                    }
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        isEditing = false;
        backToMenu();        
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class MainArray {
    public static void main(String args[]){
        int[] array = {-5, -3, -6, -3, -4};
        double[] array2 = {2, 5, 3, 5, 9, 5};
        final int[] intarray2 = new int[array2.length];
        int jumlah = 0;
        int max = array[0];
        int min = array[0];
        int cari = -3;
        int z = 0;
        double ubah = 1.0;
        
        int matrixa[][] = new int[3][2];
        matrixa[0][0] = 1;
        matrixa[0][1] = 2;
        matrixa[1][0] = 3;
        matrixa[1][1] = 5;
        matrixa[2][0] = 6;
        matrixa[2][1] = 7;
        
        int matrixb[][] = new int[3][2];
        matrixb[0][0] = 8;
        matrixb[0][1] = 9;
        matrixb[1][0] = 10;
        matrixb[1][1] = 11;
        matrixb[2][0] = 12;
        matrixb[2][1] = 13;
              
        for (int i = 0; i < array.length; i++){
            jumlah = jumlah + array[i];
            if (array[i] > max){
                max = array[i];
            }
            else if (array[i] < min){
                min = array[i];
            }
            else if (array[i] == cari){
                z= i + 1;
            }
        }
        
        int rataRata = jumlah / array.length;
        System.out.println("---------------------------------------");
        System.out.println("|         Modul 3 - Latihan 1         |");
        System.out.println("|Nama : Ridho Nugroho Wahyu Akbar     |");
        System.out.println("|NIM  : 1915026063                    |");
        System.out.println("|                                     |");
        System.out.print("|Nilai array : ");
        for (int element: array) {
            System.out.print(element + " ");
        }
        System.out.println("        |\n|Nilai rata-rata : " + rataRata + "                 |");
        System.out.println("|Nilai maksimum : " + max + "                  |");
        System.out.println("|Nilai minimum : " + min + "                   |");
        System.out.println("|Data ditemukan di Index ke :" + z + "        |");
        System.out.println("|                                     |");
        System.out.println("|         Dilarang Keras!!!           |");
        System.out.println("| Untuk Copy + Paste Kodingan Ini!!!  |");
        System.out.println("|Copyright \u00A9 Ridho Nugroho Wahyu Akbar|");
        System.out.println("---------------------------------------");
        System.out.println("\n\n\n\n\n");
        System.out.println("---------------------------------------");
        System.out.println("|         Modul 3 - Latihan 2         |");
        System.out.println("|Nama : Ridho Nugroho Wahyu Akbar     |");
        System.out.println("|NIM  : 1915026063                    |");
        System.out.println("|                                     |");
        System.out.print("|Nilai array : ");
        for (int i=0; i<intarray2.length; ++i){
            intarray2[i] = (int) array2[i];
        }
        for (int element2: intarray2) {
            System.out.print(element2 + " ");
        }
        for (int i = 0; i < array2.length; i++){
            if (array2[i] == 5.0){
                array2[i] = ubah;
            }
        }
        System.out.println("           |\n|Nilai array setelah di ubah :        |");
        System.out.print("|              ");
        for (int i=0; i<intarray2.length; ++i){
            intarray2[i] = (int) array2[i];
        }
        for (int element3: intarray2) {
            System.out.print(element3 + " ");
        }
        for (int i = 0; i < array2.length; i++){
            array2[i] = (array2[i] * 0.5);
        }
        System.out.println("           |\n|Hasil kalikan dengan 0.5 :           |");
        System.out.print("|       ");
        for (double element4: array2) {
            System.out.print(element4 + " ");
        }
        System.out.println("      |");
        System.out.println("|                                     |");
        System.out.println("|         Dilarang Keras!!!           |");
        System.out.println("| Untuk Copy + Paste Kodingan Ini!!!  |");
        System.out.println("|Copyright \u00A9 Ridho Nugroho Wahyu Akbar|");
        System.out.println("---------------------------------------");
        System.out.println("\n\n\n\n\n");
        System.out.println("---------------------------------------");
        System.out.println("|      Modul 4 - Tugas Array II       |");
        System.out.println("|Nama : Ridho Nugroho Wahyu Akbar     |");
        System.out.println("|NIM  : 1915026063                    |");
        System.out.println("|                                     |");
        System.out.println("|Nilai matrik 1 :                     |");
        System.out.println("|                                     |");
        for (int[] matrix1 : matrixa) {
            System.out.print("|                ");
            for (int j = 0; j < matrixa[0].length; j++) {
                System.out.print(matrix1[j] + " ");
            }       
            System.out.println("                 |");
        }
        System.out.println("|                                     |");
        System.out.println("|Nilai matrik 2 :                     |");
        System.out.println("|                                     |");
        for (int[] matrix2 : matrixb) {
            System.out.print("|                ");
            for (int j = 0; j < matrixb[0].length; j++) {
                System.out.print(matrix2[j] + " ");
            }       
            System.out.println("               |");
        }
        System.out.println("|                                     |");
        System.out.println("|Hasil penjumlahan matrik A dan B :   |");
        System.out.println("|                                     |");
        for (int i = 0; i < matrixa.length; i++){
            System.out.print("|                ");
            for (int j = 0; j < matrixa[0].length; j++){
                int elem = matrixa[i][j] + matrixb[i][j]; 
                System.out.print( elem + " ");
            }       
            System.out.println("               |");
        }
        System.out.println("|                                     |");
        System.out.println("|Hasil kalikan dengan 0.5 :           |");
        System.out.println("|                                     |");
        for (int i = 0; i < matrixa.length; i++){
            System.out.print("|                ");
            for (int j = 0; j < matrixa[0].length; j++){
                int elem = matrixa[i][j] + matrixb[i][j]; 
                System.out.print( elem * 0.5 + " ");
            }       
            System.out.println("               |");
        }
        System.out.println("|                                     |");
        System.out.println("|         Dilarang Keras!!!           |");
        System.out.println("| Untuk Copy + Paste Kodingan Ini!!!  |");
        System.out.println("|Copyright \u00A9 Ridho Nugroho Wahyu Akbar|");
        System.out.println("---------------------------------------");
        System.out.println("\n\n\n\n\n");
        System.out.println("                    Jawaban Soal                                  ");
        System.out.println("  __  __         _      _   ___          _   _   _ _              ");
        System.out.println(" |  \\/  |___  __| |_  _| | | _ \\_ _ __ _| |_| |_(_) |___  _ _ __  ");
        System.out.println(" | |\\/| / _ \\/ _` | || | | |  _/ '_/ _` | / /  _| | / / || | '  \\ ");
        System.out.println(" |_|  |_\\___/\\__,_|\\_,_|_| |_| |_| \\__,_|_\\_\\\\__|_|_\\_\\\\_,_|_|_|_|");
        System.out.println("                     by. Ridho Nugroho Wahyu Akbar                          ");
    }
}

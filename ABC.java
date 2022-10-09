import java.util.Scanner;
public class ABC {
    public static void main(String args[]) {
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];
        int[] Hasil = new int[10];
        int testcase;
        System.out.println("\n---------------------------\n");
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Testcase: ");
        testcase = scan.nextInt();

        for(int i = 1; i <= testcase; i++ ){
            System.out.print("Masukan Nilai A" + i + ": ");
            A[i] = scan.nextInt();
            System.out.print("Masukan Nilai B" + i + ": ");
            B[i] = scan.nextInt();
            System.out.print("Masukan Nilai C" + i + ": ");
            C[i] = scan.nextInt();
            System.out.println("");
            Hasil[i] = A[i]+B[i]-C[i];
        }

        System.out.println("---------------------------\n");

        for(int i = 1; i <= testcase; i++ ){
            System.out.println("Hasil A" + i + "+B" + i + "-C" + i + " = " + Hasil[i]);}

        System.out.println("\n---------------------------\n");
    }
}
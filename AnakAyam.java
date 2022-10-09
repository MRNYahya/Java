import java.util.Scanner;
public class AnakAyam {
    public static void main(String[] args) {
            int anak, i=1;
            Scanner input=new Scanner(System.in);
            System.out.print("Masukan Jumlah Anak Ayam:");
            anak=input.nextInt();
            do{
                System.out.print("\nAnak ayam Turunlah " + anak);
                anak=anak-i;
                System.out.println(", Mati Satu Tinggallah " + anak);
            }
            while(anak>i);{
                System.out.println("\nAnak Ayam turun 1, Mati Satu  tinggallah induknya");
            }
    }
}
import java.util.Scanner;

public class Tugas26 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int angka;
        angka = sc.nextInt();

        if (angka%2==0) {
            System.out.println("Angka genap");
        } else {
            System.out.println("Angka ganjil");
        }

    }
}
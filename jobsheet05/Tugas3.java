import java.util.Scanner;

public class Tugas3{
public static  void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int A,B,C;

        System.out.println("Masukkan Angka A: ");
        A = sc.nextInt();
        System.out.println("Masukkan Angka B: ");
        B = sc.nextInt();
        System.out.println("Masukkan Angka C: ");
        C = sc.nextInt();
        int max = A;
        int min = A;

        if (A > B) {
                if (A > C)
                        max = A;
                else
                        max = C;
        } else {
                if (B > C)
                max = B;
                else
                max = C;

        if (A < B) {
            if (A < C)
                min = A;
            else
                min = C;
        } else {
            if (B < C)
                min = B;
            else
                min = C;
        }

        if (A < B) {
                if (A < C)
                min = A;
                else
                min = C;
        } else {
                if (B < C)
                min = B;
                else
                min = C;
        }
        }
        System.out.println("Bilangan maksimum adalah: " + max);
        System.out.println("Bilangan minimum adalah: " + min);
        }
        }

    

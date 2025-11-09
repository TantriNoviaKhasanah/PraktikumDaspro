import java.util.Scanner;

public class nilaiKelompok26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int i = 1;
        double nilai;
        double totalNilai;
        double rataNilai;

        while (i <= 6) {
            System.out.println("Kelompok " + i);
            totalNilai = 0;

            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan nilai ke-" + j + ": ");
                nilai = sc.nextDouble();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata: " + rataNilai);
            i++;
            System.out.println();
        }

    }
}

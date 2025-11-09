import java.util.Scanner;

public class modifikasi2NilaiKelompok26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kelompokMax = 0;
        double nilai;
        double totalNilai;
        double rataNilai;
        double maxRata = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Kelompok " + i);
            totalNilai = 0;

            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan nilai ke-" + j + ": ");
                nilai = sc.nextDouble();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata: " + rataNilai);

            if (rataNilai > maxRata) {
                maxRata = rataNilai;
                kelompokMax = i;
            }

            System.out.println();
        }

        System.out.println(
                "Kelompok dengan rata-rata tertinggi adalah Kelompok " + kelompokMax + " dengan rata-rata " + maxRata);
    }
}

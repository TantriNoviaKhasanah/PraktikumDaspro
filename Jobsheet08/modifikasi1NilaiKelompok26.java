import java.util.Scanner;

public class modifikasi1NilaiKelompok26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        int kelompokMax = 0;
        double nilai;
        double totalNilai;
        double rataNilai;
        double maxRata = 0;

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

            if (rataNilai > maxRata) {
                maxRata = rataNilai;
                kelompokMax = i;
            }

            i++;
            System.out.println();
        }

        System.out.println(
                "Kelompok dengan rata-rata tertinggi adalah Kelompok " + kelompokMax + " dengan rata-rata " + maxRata);
    }
}

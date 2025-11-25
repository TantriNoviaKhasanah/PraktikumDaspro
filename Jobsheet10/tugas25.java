import java.util.Scanner;

public class tugas25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hasilSurvey[][] = new int[10][6];
        int jumlahPertanyaan = hasilSurvey[0].length;
        int jumlahResponden = hasilSurvey.length;

        for (int i = 0; i < hasilSurvey.length; i++) {
            int totalNilaiResponden = 0;
            System.out.println("Input skor peserta ke-" + (i + 1));

            for (int j = 0; j < jumlahPertanyaan; j++) {
                int skor;
                do {
                    System.out
                            .print("Masukkan nilai untuk peserta ke-" + (i + 1) + ", pertanyaan ke-" + (j + 1) + ": ");
                    skor = sc.nextInt();

                    if (skor < 1 || skor > 5) {
                        System.out.println("Nilai tidak valid. Silahkan masukkan nilai 1-5");
                    }
                } while (skor < 1 || skor > 5);
                hasilSurvey[i][j] = skor;
                totalNilaiResponden += skor;
            }
            double avgRespondent = (double) totalNilaiResponden / jumlahPertanyaan;
            System.out.println(
                    "Rata-rata skor yang diberikan oleh responden ke-" + (i + 1) + " adalah: " + avgRespondent);
        }

        for (int j = 0; j < jumlahPertanyaan; j++) {
            int totalSkorPertanyaan = 0;

            for (int i = 0; i < jumlahResponden; i++) {
                totalSkorPertanyaan += hasilSurvey[i][j];
            }

            double avgQuestion = (double) totalSkorPertanyaan / jumlahResponden;
            System.out.println("Rata-rata skor untuk pertanyaan ke-" + (j + 1) + " adalah: " + avgQuestion);
        }
    }
}

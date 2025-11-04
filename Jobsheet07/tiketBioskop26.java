import java.util.Scanner;

public class tiketBioskop26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket;
        int totalTiketTerjual = 0;
        double totalPenjualan = 0;

        do {
            System.out.print("Masukkan jumlah tiket (ketik '0' untuk selesai) : ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid, masukkan lagi.");
                continue;
            }

            if (jumlahTiket == 0)
                break;

            double harga = jumlahTiket * 50000;

            if (jumlahTiket > 10) {
                harga *= 0.85;
            } else if (jumlahTiket > 4) {
                harga *= 0.9;
            }

            totalTiketTerjual += jumlahTiket;
            totalPenjualan += harga;

        } while (true);

        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total penjualan: " + totalPenjualan);

    }
}

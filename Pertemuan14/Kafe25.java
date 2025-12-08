package Pertemuan14;

import java.util.Scanner;

public class Kafe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kodePromo = "DISKON30";
        Menu("Budi", true, kodePromo);

        int totalKeseluruhan = 0;
        boolean lanjutPesan = true;

        while (lanjutPesan) {
            System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            int hargaPesananIni = hitungHargaPesanan(pilihanMenu, banyakItem);
            totalKeseluruhan += hargaPesananIni;

            System.out.println("Harga untuk pesanan ini: Rp " + hargaPesananIni);
            System.out.println("Total sementara (belum diskon): Rp " + totalKeseluruhan);
            System.out.print("Apakah ingin menambah pesanan lagi? (iya/tidak): ");
            String jawaban = sc.next();
            if (jawaban.equalsIgnoreCase("tidak")) {
                lanjutPesan = false;
            }
        }

        int totalAkhir = hitungTotalDenganDiskon(totalKeseluruhan, kodePromo);
        System.out.println("Total harga keseluruhan pesanan (setelah diskon): Rp " + totalAkhir);
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon 50%!");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon 30%!");
        } else {
            System.out.println("Kode promo invalid.");
        }

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("=============================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }

    public static int hitungHargaPesanan(int pilihanMenu, int banyakItem) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };
        return hargaItems[pilihanMenu - 1] * banyakItem;
    }

    public static int hitungTotalDenganDiskon(int totalHarga, String kodePromo) {
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Anda mendapatkan diskon 50%!");
            totalHarga = totalHarga - (totalHarga * 50 / 100);
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Anda mendapatkan diskon 30%!");
            totalHarga = totalHarga - (totalHarga * 30 / 100);
        } else {
            System.out.println("Kode promo invalid, tidak ada diskon.");
        }
        return totalHarga;
    }
}

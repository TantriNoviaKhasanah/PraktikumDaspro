import java.util.Scanner;

public class modifikasiPengirimanBuku9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaCetakPerHalaman = 200;
        double beratLembar = 0.003;
        double beratHardCover = 0.250;
        double beratPacking = 0.300;
        int biayaPengiriman = 15000;
        int biayaCetak;
        int jumlahHalaman;
        int jumlahLembar;
        double beratTotal;
        int biayaKirim;
        int totalBayar;
        int berat;
        int jenisCover;

        System.out.print("Masukkan jumlah halaman: ");
        jumlahHalaman = sc.nextInt();

        sc.nextLine();

        System.out.print("Masukkan kota pelanggan (Malang / Batu):");
        String kotaPelanggan = sc.nextLine();

        int biayaCover = 20000;

        jumlahLembar = (int) Math.ceil(jumlahHalaman / 2.0);
        biayaCetak = jumlahHalaman * biayaCetakPerHalaman;
        beratTotal = (jumlahLembar * beratLembar) + beratHardCover + beratPacking;

        if (kotaPelanggan.equalsIgnoreCase("Malang") || kotaPelanggan.equalsIgnoreCase("Batu")) {
            biayaKirim = 20000;
        } else {
            biayaKirim = (int ) Math.ceil(beratTotal) * biayaPengiriman;
        }

        totalBayar = biayaCetak + biayaCover + biayaKirim;

        System.out.println("jumlah halaman:" + jumlahHalaman);
        System.out.println("cover : hard cover");
        System.out.println("kota pelanggan:" + kotaPelanggan);
        System.out.println("jumlah lembar:" + jumlahLembar);
        System.out.println("biaya cetak:" + biayaCetak);
        System.out.println("Biaya cover:" + biayaCover);
        System.out.println("berat total:" + beratTotal);
        System.out.println("biaya kirim:" + biayaKirim);
        System.out.println("total bayar:" + totalBayar);

    }

}

import java.util.Scanner;

public class modifikasiDanaSponsorship7 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah tim yang mengikuti Intercomp: ");
        int jumlahTim = sc.nextInt();
        sc.nextLine();

        double publikasi = 300000;
        double dekorasi = 500000;
        double konsumsiPanitiaJuri = 500000;
        double hadiah = 4000000;
        double operasional = 500000;

        double konsumsiPeserta = 25000 * (jumlahTim * 3);
        double honorJuri = 75000 * jumlahTim;
        double totalAnggaran = publikasi + dekorasi + konsumsiPanitiaJuri + hadiah + operasional + konsumsiPeserta + honorJuri;

        
        System.out.print("Apakah Polinema bersedia memberikan bantuan? (ya/tidak): ");
        String jawaban = sc.nextLine();

        double danaPolinema = 0;
        if (jawaban.equalsIgnoreCase("ya")) {
            System.out.print("Masukkan persentase bantuan Polinema (%): ");
            double persenBantuan = sc.nextDouble();
            danaPolinema = (persenBantuan / 100) * totalAnggaran;
        } else {
            danaPolinema = 0; 
        }

        
        double danaPendaftaran = jumlahTim * 50000;
        double danaSponsorship = totalAnggaran - (danaPolinema + danaPendaftaran);

        
        System.out.println("\n===== RINCIAN DANA INTERCOMP =====");
        System.out.println("Total anggaran keseluruhan  : Rp " + totalAnggaran);
        System.out.println("Dana dari Polinema           : Rp " + danaPolinema);
        System.out.println("Dana dari pendaftaran tim    : Rp " + danaPendaftaran);
        System.out.println("Dana yang perlu dipenuhi dari sponsorship: Rp " + danaSponsorship);

    }
}
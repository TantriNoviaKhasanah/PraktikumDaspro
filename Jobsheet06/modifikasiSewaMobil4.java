import java.util.Scanner;

public class modifikasiSewaMobil4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int biayaMobilPerHari = 300000;
        int biayaSopirPerHari = 200000;
        int biayabahanbakarperkm = 0;
        int biayaSewa;
        int lamaSewa;
        int totalBiayaLamaSewa;
        int jaraktempuh;

        System.out.println("Masukkan Lama Sewa");
        lamaSewa = sc.nextInt();

        if (lamaSewa > 30) {
            System.out.println("Lama Sewa Maksimal 30 Hari!");
            sc.close();
            return;
        }

        System.out.println("Masukkan Jarak Tempuh");
        jaraktempuh = sc.nextInt();

        sc.nextLine();
            
        int biayaMobil = biayaMobilPerHari*lamaSewa;
        int biayaSopir = biayaSopirPerHari*lamaSewa;
        int biayabahanbakar = biayabahanbakarperkm*jaraktempuh;
        totalBiayaLamaSewa = biayaMobil + biayaSopir + biayabahanbakar;
        
        System.out.print("Masukkan jenis bahan bakar (pertalite/pertamax): ");
        String jenisbahanBakar = sc.nextLine();
        
        if (jenisbahanBakar.equalsIgnoreCase("pertalite")) {
            biayabahanbakar = 1000 * jaraktempuh;
            System.out.println("Jumlah biaya bahan bakar Pertalite: " + biayabahanbakar);
        } else if (jenisbahanBakar.equalsIgnoreCase("pertamax")) {
            biayabahanbakar = 1300 * jaraktempuh;
            System.out.println("Jumlah biaya bahan bakar pertamax: " + biayabahanbakar);
        
        } else{
            System.out.println("Jenis bahan bakar tidak tersedia!");
        }

        System.out.println("total biaya sewa mobil: " +biayaMobil);
        System.out.println("total biaya bahan bakar: " +biayabahanbakar);
        System.out.println("total biaya sopir: "  +biayaSopir);
        
        if (totalBiayaLamaSewa > 2000000) {
            double diskon = 0.05 * totalBiayaLamaSewa;
            totalBiayaLamaSewa -=(int) diskon;
            System.out.println("Selamat anda mendapatkan diskon 5%");
        } else {
            System.out.println("Tidak mendapatkan diskon!");
        }
        
        System.out.println("Total Biaya Lama Sewa: " + totalBiayaLamaSewa);

        sc.close();

    }
}

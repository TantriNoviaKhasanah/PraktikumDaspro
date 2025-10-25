import java.util.Scanner;

public class modifikasiSewaMobil2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int biayaMobilPerHari = 300000;
        int biayaSopirPerHari = 200000;
        int biayabahanbakarperkm = 1000;
        int biayaSewa;
        int lamaSewa;
        int totalBiayaLamaSewa;
        int jaraktempuh;
    

        System.out.println("Masukkan Lama Sewa");
        lamaSewa = sc.nextInt();
        System.out.println("Masukkan Jarak Tempuh");
        jaraktempuh = sc.nextInt();
            
        int biayaMobil = biayaMobilPerHari*lamaSewa;
        int biayaSopir = biayaSopirPerHari*lamaSewa;
        int biayabahanbakar = biayabahanbakarperkm*jaraktempuh;
        totalBiayaLamaSewa =  biayaMobil + biayabahanbakar + biayaSopir;
        
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

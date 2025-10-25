import java.util.Scanner;

public class ModifikasiSewaMobil3 {
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

        if (lamaSewa > 30) {
            System.out.println("Lama Sewa Maksimal 30 Hari!");
            sc.close();
            return;
        }

        System.out.println("Masukkan Jarak Tempuh");
        jaraktempuh = sc.nextInt();
            
        int biayaMobil = biayaMobilPerHari*lamaSewa;
        int biayaSopir = biayaSopirPerHari*lamaSewa;
        int biayabahanbakar = biayabahanbakarperkm*jaraktempuh;
        int totalbiaya = biayaMobil + biayaSopir + biayabahanbakar;
        
        

        System.out.println("total biaya sewa mobil: " +biayaMobil);
        System.out.println("total biaya bahan bakar: " +biayabahanbakar);
        System.out.println("total biaya sopir: "  +biayaSopir);
        System.out.println("total biaya yang dibutuhkan: " +totalbiaya);

    }
}

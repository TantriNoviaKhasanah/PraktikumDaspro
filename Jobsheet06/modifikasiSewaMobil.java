import java.util.Scanner;

public class modifikasiSewaMobil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int biayaMobilPerHari = 300000;
        int biayaSopirPerHari = 200000;
        int biayaSewa;
        int lamaSewa;
        int totalBiayaLamaSewa;
        int jaraktempuh;
        int biayabahanbakarperkm = 0;
        int jenisbahanbakar;

        System.out.print("Masukkan Lama Sewa : ");
        lamaSewa = sc.nextInt();
        System.out.print("Masukkan Jarak Tempuh : ");
        jaraktempuh = sc.nextInt();

        sc.nextLine();
        
        int biayaMobil = biayaMobilPerHari*lamaSewa;
        int biayaSopir = biayaSopirPerHari*lamaSewa;
        int biayabahanbakar = biayabahanbakarperkm*jaraktempuh;
        int totalbiaya = biayaMobil + biayaSopir + biayabahanbakar;

        
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
        System.out.println("total biaya yang dibutuhkan: " +totalbiaya);

    
    }
}

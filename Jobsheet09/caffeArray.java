import java.util.Scanner;

public class caffeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] daftarMenu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino",
                "Chocolate Ice" };
        double[] daftarHarga = { 20000, 22000, 15000, 17000, 13000, 18000, 20000 };
        int[] daftarPesanan = new int[daftarMenu.length];

        while (true) {
            System.out.print("Masukkan jumlah pesanan (ketik 0 untuk keluar): ");
            int jumlahPesanan = sc.nextInt();
            sc.nextLine();

            if (jumlahPesanan == 0) {
                break;
            }

            for (int i = 1; i <= jumlahPesanan; i++) {
                System.out.print("Masukkan menu " + i + ": ");
                String menuInput = sc.nextLine();

                int namaMenu = -1;
                for (int j = 0; j < daftarMenu.length; j++) {
                    if (daftarMenu[j].equalsIgnoreCase(menuInput)) {
                        namaMenu = j;
                        break;
                    }
                }

                if (namaMenu == -1) {
                    System.out.println("Menu " + menuInput + " tidak tersedia");
                    i--;
                } else {
                    System.out.print("Masukkan jumlah: ");
                    int jumlah = sc.nextInt();
                    sc.nextLine();
                    daftarPesanan[namaMenu] += jumlah;
                }
            }

            double totalHarga = 0;
            for (int i = 0; i < daftarMenu.length; i++) {
                totalHarga += daftarPesanan[i] * daftarHarga[i];
            }

            System.out.println("\nTotal: " + (int) totalHarga + "\n");
        }

        sc.close();
    }
}

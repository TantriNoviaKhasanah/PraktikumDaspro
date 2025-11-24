import java.util.Scanner;

public class bioskopWithScanner25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        int baris, kolom, menu;
        String nama, daftarPenonton;

        while (true) {
            System.out.println("=== Menu Bioskop ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();

                        while (true) {
                            System.out.print("Masukkan baris (1-4): ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan kolom (1-2): ");
                            kolom = sc.nextInt();
                            sc.nextLine();

                            if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                                System.out.println("Nomor baris atau kolom tidak tersedia. Silakan coba lagi.");
                                continue;
                            }

                            if (penonton[baris - 1][kolom - 1] != null) {
                                System.out
                                        .println("Kursi sudah terisi oleh penonton lainnya. Silakan pilih kursi lain.");
                                continue;
                            }

                            penonton[baris - 1][kolom - 1] = nama;
                            break;
                        }

                        System.out.print("Input penonton lainnya? (y/n): ");
                        String next = sc.nextLine();
                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("\nDaftar Penonton:");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("*** ");
                            } else {
                                System.out.print(penonton[i][j] + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih!");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-3.");
            }
        }
    }
}

package Pertemuan14;

import java.util.Scanner;

public class rekapPenjualanCaffe25 {
    static void inputPenjualan(int[][] data, String[] menu, Scanner input) {
        System.out.println("\nInput data penjualan:");

        for (int i = 0; i < menu.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.print("Masukkan penjualan menu " + menu[i] + " hari ke-" + (j + 1) + ": ");
                data[i][j] = input.nextInt();
            }
        }
    }

    static void tampiTable(int[][] data, String[] menu) {
        System.out.println("\nTabel Penjualan Cafe:");
        System.out.println("Menu\t\t Hari");

        for (int i = 0; i < data[0].length; i++) {
            System.out.println("\t" + (i + 1));
        }

        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);

            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == 23) {
                    System.out.println("\t");
                } else {
                    System.out.println("\t\t" + data[i][j]);
                }
            }

            System.out.println();
        }
    }

    static void menuTerLaris(int[][] data, String[] menu) {
        int max = 0;
        String menuMax = "";

        for (int i = 0; i < data.length; i++) {
            int totalMenu = 0;

            for (int j = 0; j < data[i].length; j++) {
                totalMenu += data[i][j];
            }

            if (totalMenu > max) {
                max = totalMenu;
                menuMax = menu[i];
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi selama " + data[0].length + " hari adalah: " + menuMax
                + " (Total = " + max + ")");
    }

    static void rataRataPenjualan(int[][] data, String[] menu) {
        System.out.println("\nRata-rata penjualan tiap menu:");

        for (int i = 0; i < menu.length; i++) {
            int total = 0;

            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }

            double rata = (double) total / data[i].length;
            System.out.println(menu[i] + " = " + rata);

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int m = input.nextInt();
        System.out.print("Masukkan hari penjualan: ");
        int h = input.nextInt();
        input.nextLine();

        String[] menu = new String[m];
        for (int i = 0; i < m; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            menu[i] = input.nextLine();
        }

        int[][] dataPenjualan = new int[m][h];

        inputPenjualan(dataPenjualan, menu, input);
        tampiTable(dataPenjualan, menu);
        menuTerLaris(dataPenjualan, menu);
        rataRataPenjualan(dataPenjualan, menu);

        input.close();
    }
}

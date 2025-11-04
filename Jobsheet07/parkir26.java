import java.util.Scanner;

public class parkir26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int durasi = 0;
        int total = 0;
        String jenis;

        while (true) {
            System.out.print("Masukkan jenis kendaraan: ");
            jenis = sc.nextLine();

            if (jenis.equals("0")) {
                break;
            }

            System.out.print("Masukkan durasi: ");
            durasi = sc.nextInt();
            sc.nextLine();

            if (durasi > 5) {
                total += 12500;
            } else if (jenis.equals("Mobil")) {
                total += durasi * 30000;
            } else if (jenis.equals("Motor")) {

            }
            System.out.println();
        }

        System.out.println(total);
    }

}

import java.util.Scanner;

public class modifikasiListrik5 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int biayaListrikPerbulan = 50000;  
      int biayaTarifListrik = 0;
      double ppn = 0.1;
      int kwh;
      int biayaPemakaian;
      double totalBiayaListrik;

      System.out.println("kwh: ");
      kwh = sc.nextInt();

      System.out.println("Opsi Daya (900 / 1300 / 2200 / 3500 / 5500): ");
      int opsiDaya = sc.nextInt();

      if (opsiDaya == 900) {
        biayaTarifListrik = 1300;
        System.out.println("Jumlah Tarif Listrik 900VA: ");
      } else if (opsiDaya == 1300 || opsiDaya == 2200) {
        biayaTarifListrik = 1500;
        System.out.println("Jumlah Tarif Listrik 1300VA / 2200VA: ");
      } else if (opsiDaya == 3500 || opsiDaya == 5500) {
        biayaTarifListrik = 1700;
        System.out.println("Jumlah Tarif Listrik 3500VA / 5500VA: ");

      } else {
        System.out.println("Tidak Ada Opsi Daya!");
        sc.close();
        return;
      }
    
      biayaTarifListrik = 1500 * kwh;
      biayaPemakaian = biayaListrikPerbulan + biayaTarifListrik;
      ppn = 0.1 * biayaPemakaian;
      totalBiayaListrik = biayaPemakaian + ppn;

      System.out.println("biaya listrik perbulan: " + biayaListrikPerbulan);
      System.out.println("daya listrik digunakan:" + biayaPemakaian);
      System.out.println("biaya tarif listrik:" + biayaTarifListrik);
      System.out.println("ppn:" + ppn);
      System.out.println("total biaya listrik:" + totalBiayaListrik);

    }
}

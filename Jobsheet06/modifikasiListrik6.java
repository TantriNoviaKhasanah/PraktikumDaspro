import java.util.Scanner;

public class modifikasiListrik6 {
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

      switch (opsiDaya) {
        case 900:
            biayaTarifListrik = 1300;
            break;
        case 1300:
        case 2200:
            biayaTarifListrik = 1500;
            break;
        case 3500:
        case 5500:
            biayaTarifListrik = 1700;
            break;
        default:
            System.out.println("Tidak Ada Opsi Daya!");
            break;
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

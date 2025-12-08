package Pertemuan14;

public class kubus25 {
    static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        int sisi = 4;
        int volume = hitungVolume(sisi);
        int luas = hitungLuasPermukaan(sisi);

        System.out.println("Volume kubus adalah: " + volume);
        System.out.println("Luas permukaan kubus adalah: " + luas);
    }
}

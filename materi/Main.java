public class Main {
    final int angka = 0;

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hai Wahyu");

        // Cetak variable global
        Main main = new Main();
        System.out.println("Ini adalah angka " + main.angka);

        // Variable lokal
        char golonganDarah = 'A';
        int umur = 20;
        double tinggi = 1.74;
        boolean menikah = true;

        System.out.println("Golongan Darah : " + golonganDarah);
        System.out.println("Umur : " + umur + " tahun");
        System.out.println("Tinggi Badan : " + tinggi + " cm");
        if (menikah) {
            System.out.println("Sudah menikah");
        } else {
            System.out.println("Belum menikah");
        }

        // Array
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] number = new int[5];
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        System.out.println(number[0]);

    }
}
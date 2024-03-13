package latihan;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        int totBelanja, diskon;
        String member;
        Scanner in = new Scanner(System.in);
        System.out.println("PROGRAM PENJUALAN SEDERHANA");

        System.out.print("Total Belanja : ");
        totBelanja = in.nextInt();
        member = in.nextLine();
        System.out.print("Masukan membership anda : ");
        member = in.nextLine().toUpperCase();

        switch (member) {
            case "GOLD":
                System.out.println("Selamat! anda mendapatkan potongan harga 50 ribu");
                diskon = 50000;
                break;
            case "SILVER":
                System.out.println("Selamat! anda mendapatkan potongan harga 30 ribu");
                diskon = 30000;
                break;
            case "BRONZE":
                System.out.println("Selamat! anda mendapatkan potongan harga 10 ribu");
                diskon = 10000;
                break;
            default:
                System.out.println("Selamat! anda mendapatkan potongan harga 5 ribu");
                diskon = 5000;
                break;
        }
        if (totBelanja <= diskon) {
            System.out.println("Anda tidak perlu membayar !!!");
        } else {
            System.out.println("Total belanja anda sebesar Rp. " + (totBelanja -= diskon) + " !!!");
        }
        in.close();
    }
}

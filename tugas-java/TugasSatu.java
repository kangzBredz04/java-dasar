// package tugas-java;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TugasSatu {
    public static void main(String[] args) {
        // Program arisan qurban
        ArrayList<String> daftarNama = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("---------- PROGRAM ARISAN QURBAN ----------");
            System.out.println("1. Lihat Daftar Nama Arisan Qurban");
            System.out.println("2. Tambah Nama Arisan Qurban");
            System.out.println("3. Ubah Nama Arisan Qurban");
            System.out.println("4. Hapus Nama Arisan Qurban");
            System.out.println("5. Hapus Semua Nama Arisan Qurban");
            System.out.println("6. Tampil Nama Pemenang Arisan Qurban");
            System.out.println("7. Keluar Program");
            System.out.print("Pilih menu : ");
            pilih = in.nextInt();

            // Pilih menu
            switch (pilih) {
                case 1:
                    daftarNamaArisan(daftarNama);
                    break;
                case 2:
                    tambahNama(daftarNama);
                    break;
                case 3:
                    ubahNama(daftarNama);
                    break;
                case 4:
                    hapusNama(daftarNama);
                    break;
                case 5:
                    hapusSemuaNama(daftarNama);
                    break;
                case 6:
                    tampilPemenang(daftarNama);
                    break;
                default:
                    System.out.println("---------- SEKIAN DAN TERIMA KASIH ----------");
                    break;
            }

        } while (pilih != 7);
        in.close();
    }

    // Method untuk menampilkan daftar nama arisan
    private static void daftarNamaArisan(ArrayList<String> daftarNama) {
        if (daftarNama.isEmpty()) {
            System.out.println("Data masih kosong");
        } else {
            System.out.println("---------- DAFTAR NAMA ARISAN QURBAN ----------");
            for (int i = 0; i < daftarNama.size(); i++) {
                System.out.format("%d. %s\n", i + 1, daftarNama.get(i));
            }
        }
    }

    // Method untuk menambahkan nama kedalam daftar nama arisan
    private static void tambahNama(ArrayList<String> daftarNama) {
        System.out.println("---------- TAMBAH NAMA ARISAN QURBAN ----------");
        Scanner inNama = new Scanner(System.in);

        System.out.print("Masukan nama : ");
        String namaBaru = inNama.nextLine();
        daftarNama.add(namaBaru);
        System.out.println("----- " + namaBaru + " telah ditambahkan -----");
        // inNama.close();
    }

    // Methon untuk mengubah nama peserta arisan qurban berdasarkan nomor peserta
    private static void ubahNama(ArrayList<String> daftarNama) {
        System.out.println("---------- UBAH NAMA ARISAN QURBAN ----------");
        Scanner in = new Scanner(System.in);
        String namaBaru;

        if (daftarNama.isEmpty()) {
            System.out.println("Data masih kosong");
        } else {
            System.out.println("---------- DAFTAR NAMA ARISAN QURBAN ----------");
            for (int i = 0; i < daftarNama.size(); i++) {
                System.out.format("%d. %s\n", i + 1, daftarNama.get(i));
            }

            System.out.print("Masukan nomor urut peserta : ");
            int nomor = in.nextInt();
            if (nomor < 1 || nomor > daftarNama.size()) {
                System.out.println("Nomor peserta yang diinput tidak ada !!!");
            } else {
                namaBaru = in.nextLine();
                System.out.print("Masukan nama baru : ");
                namaBaru = in.nextLine();
                daftarNama.set((nomor - 1), namaBaru);
                System.out.println("Nama berhasil diubah !!!");
            }
        }
    }

    // Method untuk menghapus nama peserta berdasarkan nomor urut peserta arisan
    private static void hapusNama(ArrayList<String> daftarNama) {
        System.out.println("---------- HAPUS NAMA ARISAN QURBAN ----------");
        Scanner in = new Scanner(System.in);

        if (daftarNama.isEmpty()) {
            System.out.println("Data masih kosong");
        } else {
            System.out.println("---------- DAFTAR NAMA ARISAN QURBAN ----------");
            for (int i = 0; i < daftarNama.size(); i++) {
                System.out.format("%d. %s\n", i + 1, daftarNama.get(i));
            }

            System.out.print("Masukan nomor urut peserta : ");
            int nomor = in.nextInt();
            if (nomor < 1 || nomor > daftarNama.size()) {
                System.out.println("Nomor peserta yang diinput tidak ada !!!");
            } else {
                daftarNama.remove(nomor - 1);
                System.out.println("Nama berhasil dihapus !!!");
            }
        }
    }

    // Method untuk menghapus semua nama peserta arisan qurban
    private static void hapusSemuaNama(ArrayList<String> daftarNama) {
        Scanner in = new Scanner(System.in);
        String yaTidak;
        System.out.print("Apakah anda yakin akan menghapus semua nama (ya/tidak) ? ");
        yaTidak = in.nextLine();

        // Menentukan kondisi
        if (yaTidak.equalsIgnoreCase("ya")) {
            daftarNama.removeAll(daftarNama);
        } else if (yaTidak.equalsIgnoreCase("tidak")) {
            System.out.println("Oke terima kasih");
        }
    }

    // Method untuk menampilkan pemenang arisan
    private static void tampilPemenang(ArrayList<String> daftarNama) {
        // Variable untuk mengahasilkan angka acak
        Random random = new Random();
        // Dapatkan indeks acak
        int indeksAcak = random.nextInt(daftarNama.size());

        // Tampilkan nama pada indeks acak
        System.out.println("Selamat Kepada Pemenang : " + daftarNama.get(indeksAcak));

        // Menghapus nama pemenang
        daftarNama.remove(indeksAcak);
    }
}

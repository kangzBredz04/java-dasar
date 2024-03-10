// package tugas-java;

import java.util.ArrayList;
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
            System.out.println("5. Tampil Nama Pemenang Arisan Qurban");
            System.out.println("6. Keluar Program");
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
                default:
                    System.out.println("---------- SEKIAN DAN TERIMA KASIH ----------");
                    break;
            }

        } while (pilih != 4);
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
}

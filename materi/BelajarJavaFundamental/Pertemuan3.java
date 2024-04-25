package BelajarJavaFundamental;

// Object Oriented Programming (OOP) dalam Bahasa Pemrograman Java

// Object Oriented Programming (OOP) adalah paradigma pemrograman yang
// menggunakan konsep objek dan kelas.
// Konsep utama dalam OOP Java termasuk enkapsulasi, pewarisan, polimorfisme,
// dan abstraksi.

// 1. Kelas (Class)
// Kelas adalah blueprint atau template untuk menciptakan objek.
// Kelas mendefinisikan atribut (variabel) dan metode (fungsi) yang dimiliki
// oleh objek.

// Contoh class
// class Mobil {
// // Atribut
// String merek;
// String warna;
// int tahunProduksi;

// // Metode
// void infoMobil() {
// System.out.println("Mobil " + merek + " berwarna " + warna + " diproduksi
// pada tahun " + tahunProduksi);
// }
// }

// Static Method
// Method static adalah method yang dapat dipakai tanpa harus menginisialisasi
// suatu class
// Method static dapat dipanggil tanpa membuat object
// Cara membuatnya yaitu dengan menambahkan keyword static di depan void

// 2. Objek (Object)
// Objek adalah instansi dari suatu kelas. Dalam Java, objek diciptakan
// menggunakan kata kunci `new`.

class Buku {
    String name;
    int harga;

    // Constructor tanpa parameter
    Buku() {
        System.out.println("Ini kelas buku");
    }

    // Constructor dengan parameter
    Buku(String nama) {
        System.out.println("Ini kelas " + nama);
    }
}

public class Pertemuan3 {
    public static void main(String[] args) {
        // // Membuat objek dari kelas Mobil
        // Mobil mobil1 = new Mobil();

        // // Mengatur nilai atribut objek
        // mobil1.merek = "Toyota";
        // mobil1.warna = "Hitam";
        // mobil1.tahunProduksi = 2020;

        // // Memanggil metode objek
        // mobil1.infoMobil();

        // Constructor
        // Constructor dibuat didalam suatu class yang penamaan nya sama dengan nama
        // classnya, Constructor adalah method yang pertama kali dipanggil saat object
        // dibuat, Bisa menambahkan parameter, Constructor tidak memiliki return value
        // dan tidak menggunakan keyword void

        Buku buku1 = new Buku();
        Buku buku2 = new Buku("Wahyu");
    }
}

// 3. Enkapsulasi (Encapsulation)
// Enkapsulasi adalah konsep menyembunyikan rincian implementasi internal objek
// dan hanya mengekspos fungsionalitas yang relevan.
// class Mobil {
// // Atribut
// String merek;
// String warna;
// int tahunProduksi;

// // Metode
// void infoMobil() {
// System.out.println("Mobil " + merek + " berwarna " + warna + " diproduksi
// pada tahun " + tahunProduksi);
// }

// // Contoh enkapsulasi
// void setMerek(String merek) {
// this.merek = merek;
// }

// String getMerek() {
// return merek;
// }

// void setTahunProduksi(int tahunProduksi) {
// this.tahunProduksi = tahunProduksi;
// }

// int getTahunProduk() {
// return tahunProduksi;
// }
// }

// 4. Pewarisan (Inheritance)
// Pewarisan adalah konsep dimana sebuah kelas dapat mewarisi atribut dan metode
// dari kelas lain.
// Contoh inheritance
// class Sedan extends Mobil {
// private int jumlahPintu;

// public void setJumlahPintu(int jumlahPintu) {
// this.jumlahPintu = jumlahPintu;
// }

// public int getJumlahPintu() {
// return jumlahPintu;
// }

// // Contoh inheritance
// void setTahunProduksi(int tahunProduksi) {
// this.tahunProduksi = tahunProduksi;
// }

// int getTahunProduk() {
// return tahunProduksi;
// }
// }

// 5. Polimorfisme (Polymorphism)
// Polimorfisme memungkinkan suatu objek memiliki banyak bentuk. Dalam Java,
// polimorfisme dapat dicapai melalui overriding atau overloading.

// Overloading terjadi ketika dua atau lebih metode dalam suatu kelas memiliki
// nama yang sama, tetapi berbeda dalam jumlah atau tipe parameter.
class ContohOverloading {
    // Metode overloading dengan parameter int
    public void tambah(int a, int b) {
        int hasil = a + b;
        System.out.println("Hasil penjumlahan: " + hasil);
    }

    // Metode overloading dengan parameter double
    public void tambah(double a, double b) {
        double hasil = a + b;
        System.out.println("Hasil penjumlahan: " + hasil);
    }

    // Metode overloading dengan jumlah parameter yang berbeda
    public void tambah(int a, int b, int c) {
        int hasil = a + b + c;
        System.out.println("Hasil penjumlahan: " + hasil);
    }

    // Metode overloading dengan tipe parameter yang berbeda
    public void tambah(String a, String b) {
        String hasil = a + b;
        System.out.println("Hasil penggabungan string: " + hasil);
    }
}

// Overriding terjadi ketika sebuah kelas turunan (subclass) memiliki metode
// dengan nama, parameter, dan tipe kembalian yang sama seperti metode dalam
// kelas induknya (superclass).
// Kelas induk (superclass)
class Hewan {
    public void bersuara() {
        System.out.println("Hewan bersuara...");
    }
}

// Kelas turunan (subclass)
class Kucing extends Hewan {
    // Override metode bersuara dari kelas Hewan
    @Override
    public void bersuara() {
        System.out.println("Meong!");
    }
}

// Kelas turunan lainnya
class Anjing extends Hewan {
    // Override metode bersuara dari kelas Hewan
    @Override
    public void bersuara() {
        System.out.println("Guk guk!");
    }
}

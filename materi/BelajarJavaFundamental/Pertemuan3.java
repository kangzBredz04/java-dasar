package BelajarJavaFundamental;

// Object Oriented Programming (OOP) dalam Bahasa Pemrograman Java

// Object Oriented Programming (OOP) adalah paradigma pemrograman yang
// menggunakan konsep objek dan kelas.
// Konsep utama dalam OOP Java termasuk enkapsulasi, pewarisan, polimorfisme,
// dan abstraksi.

// 1. Kelas (Class)
// Kelas adalah blueprint atau template untuk menciptakan objek. 
// Kelas mendefinisikan atribut (variabel) dan metode (fungsi) yang dimiliki oleh objek.

// Contoh class
// class Mobil {
//     // Atribut
//     String merek;
//     String warna;
//     int tahunProduksi;

//     // Metode
//     void infoMobil() {
//         System.out.println("Mobil " + merek + " berwarna " + warna + " diproduksi pada tahun " + tahunProduksi);
//     }
// }

// 2. Objek (Object)
// Objek adalah instansi dari suatu kelas. Dalam Java, objek diciptakan
// menggunakan kata kunci `new`.
public class Pertemuan3 {
    public static void main(String[] args) {
        // Membuat objek dari kelas Mobil
        Mobil mobil1 = new Mobil();

        // Mengatur nilai atribut objek
        mobil1.merek = "Toyota";
        mobil1.warna = "Hitam";
        mobil1.tahunProduksi = 2020;

        // Memanggil metode objek
        mobil1.infoMobil();
    }
}

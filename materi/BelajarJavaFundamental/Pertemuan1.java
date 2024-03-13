package BelajarJavaFundamental;

import java.util.ArrayList;

public class Pertemuan1 {
    public static void main(String[] args) {
        // Print: Hanya mencetak teks tanpa menambahkan baris baru di akhir.
        System.out.print("Hello World");

        // Println: Mencetak teks dan menambahkan baris baru di akhir.
        System.out.println("Hello World");

        // Format :
        // Digunakan untuk memformat teks dan variabel sebelum dicetak.
        // Memiliki syntax yang kompleks dengan berbagai placeholder untuk variabel.
        // Contoh :
        String nama = "Wahyu";
        int usia = 21;
        String formattedText = String.format("Nama: %s, Usia: %d", nama, usia);
        System.out.println(formattedText);

        // printf:
        // Fungsi bawaan C yang digunakan untuk memformat teks dan variabel sebelum
        // dicetak.
        // Mirip dengan format, tetapi syntaxnya lebih mudah dipahami.
        // printf
        System.out.printf("Nama: %s, Usia: %d\n", nama, usia);

        // ArrayList adalah salah satu struktur data yang paling umum digunakan dalam
        // Java. ArrayList adalah collection yang dinamis yang dapat menyimpan elemen
        // data dengan tipe yang sama.

        // Membuat arraylist
        ArrayList<String> names = new ArrayList<>();

        // Menambahkan elemen
        names.add("Andi");
        names.add("Budi");
        names.add(1, "Cici");

        System.out.println(names); // [Andi, Cici, Budi]

        // Menghapus elemen
        names.remove("Andi"); // menghapus berdasarakan elemen pertama yang ditemukan dalam ArrayList.
        names.remove(1); // Menghapus elemen pada indeks yang ditentukan.

        System.out.println(names); // [Cici]
    }
}

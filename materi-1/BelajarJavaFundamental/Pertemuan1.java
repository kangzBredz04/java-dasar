package BelajarJavaFundamental;

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

    }
}

import java.util.ArrayList;
import java.util.Random;

public class UjiCobaTugasSatu {
    public static void main(String[] args) {
        // Buat ArrayList untuk menyimpan nama
        ArrayList<String> namaList = new ArrayList<>();

        // Tambahkan beberapa nama ke ArrayList
        namaList.add("Andi");
        namaList.add("Budi");
        namaList.add("Cici");
        namaList.add("Doni");
        namaList.add("Eko");

        // // Cetak isi ArrayList sebelum dihapus
        // System.out.println("Isi ArrayList sebelum dihapus: " + namaList);

        // // Hapus data nama pada indeks 2
        // namaList.removeAll(namaList);

        // // Ubah data nama pada indeks 2
        // // namaList.set(2, "Cuci");

        // // Cetak isi ArrayList setelah dihapus
        // System.out.println("Isi ArrayList setelah dihapus: " + namaList);

        // Buat objek Random
        Random random = new Random();

        // Dapatkan indeks acak
        int indeksAcak = random.nextInt(namaList.size());

        // Tampilkan nama pada indeks acak
        System.out.println("Nama acak: " + namaList.get(indeksAcak));
        // System.out.println("Indeks acak : " + indeksAcak);
    }
}

import java.util.ArrayList;

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

        // Cetak isi ArrayList sebelum dihapus
        System.out.println("Isi ArrayList sebelum dihapus: " + namaList);

        // Hapus data nama pada indeks 2
        // namaList.remove(3);

        // Ubah data nama pada indeks 2
        namaList.set(2, "Cuci");

        // Cetak isi ArrayList setelah dihapus
        System.out.println("Isi ArrayList setelah dihapus: " + namaList);
    }
}

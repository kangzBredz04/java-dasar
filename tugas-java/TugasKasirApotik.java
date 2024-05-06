import java.util.Scanner;
import java.time.LocalDate;
// import java.time.DateTimeException;
// import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

interface kasirApotik {

    String[] getNamaObat();

    void setNamaObat(String[] namaObat);

    int[] getStokObat();

    int[] getHargaObat();

    void setStokObat(int[] stokObat);

    String[] getKodeObat();
}

interface strukApotik {

    String tampilStruk(String nama, int jmlObat, int harga, int totHarga, int bayar);
}

abstract class kasir implements kasirApotik {

    String[] namaObat = { "Actifed Hijau 120", "Paracetamol Tab", "Amoxcilin 500 mg", "Spasmolit Tablet",
            "Curcuma Tablet" };
    int[] stokObat = { 50, 15, 38, 46, 72 };
    int[] hargaObat = { 2000, 2500, 1500, 3000, 500 };
    String[] kodeObat = { "001", "002", "003", "004", "005" };

    abstract void pilihanMenu();
}

class prosesKasir extends kasir {

    @Override
    void pilihanMenu() {
        System.out.println("---------------------------------------");
        System.out.println("1. Pembelian Obat\n2. Penjualan Obat\n3. Cek Stok Obat");
        System.out.println("---------------------------------------");

    }

    @Override
    public String[] getNamaObat() {
        return namaObat;
    }

    @Override
    public void setNamaObat(String[] namaObat) {
        this.namaObat = namaObat;
    }

    @Override
    public int[] getStokObat() {
        return stokObat;
    }

    @Override
    public void setStokObat(int[] stokObat) {
        this.stokObat = stokObat;
    }

    @Override
    public String[] getKodeObat() {
        return kodeObat;
    }

    @Override
    public int[] getHargaObat() {
        return hargaObat;
    }
}

class tampil implements strukApotik {

    prosesKasir pkasir = new prosesKasir();
    String[] tampNamaObat = pkasir.getNamaObat();
    String[] tampKodeObat = pkasir.getKodeObat();
    int[] tampStokObat = pkasir.getStokObat();
    int[] tamHargaObat = pkasir.getHargaObat();
    int pilMenu, inputJmlObat;
    String inputKode;
    Scanner input = new Scanner(System.in);

    tampil(String kata) {
        System.out.println(kata);
    }

    void prosesKasir() {

        while (true) {
            pkasir.pilihanMenu();
            System.out.print("Pilih Menu : ");
            pilMenu = input.nextInt();

            if (pilMenu == 1) {
                pembelian();
            } else if (pilMenu == 2) {
                penjualan();
            } else if (pilMenu == 3) {
                cekStok();
            }
        }
    }

    void pembelian() {
        inputKode = input.nextLine();
        System.out.print("Input kode obat : ");
        inputKode = input.nextLine();

        for (int i = 0; i < tampKodeObat.length; i++) {
            if (inputKode.equalsIgnoreCase(tampKodeObat[i])) {
                System.out.print("Input Jumlah Obat : ");
                inputJmlObat = input.nextInt();
                tampStokObat[i] += inputJmlObat;
            }
        }

    }

    void penjualan() {

        int bayar;

        cekStok();
        inputKode = input.nextLine();
        System.out.print("\nInput Kode Obat : ");
        inputKode = input.nextLine();

        for (int i = 0; i < tampKodeObat.length; i++) {
            if (inputKode.equalsIgnoreCase(tampKodeObat[i])) {
                System.out.print("Input Jumlah Obat : ");
                inputJmlObat = input.nextInt();
                tampStokObat[i] -= inputJmlObat;
                System.out.println("Total Bayar : Rp. " + (inputJmlObat * tamHargaObat[i]));
                System.out.print("Input Uang : ");
                bayar = input.nextInt();
                String output = tampilStruk(tampNamaObat[i], inputJmlObat, tamHargaObat[i],
                        (tamHargaObat[i] * inputJmlObat), bayar);
                System.out.println("");
                System.out.println(output);
            }
        }

    }

    void cekStok() {
        System.out.println("---------------------------------------");
        System.out.println("Kode\tNama Obat\t\tStok");
        System.out.println("---------------------------------------");
        for (int i = 0; i < tampNamaObat.length; i++) {
            if (i == 0) {
                System.out.println(tampKodeObat[i] + "\t" + tampNamaObat[i] + "\t" + tampStokObat[i]);
            } else {
                System.out.println(tampKodeObat[i] + "\t" + tampNamaObat[i] + "\t\t" + tampStokObat[i]);
            }
        }
        System.out.println("---------------------------------------");
    }

    @Override
    public String tampilStruk(String nama, int jmlObat, int harga, int totHarga, int bayar) {
        // Membuat tanggal
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        LocalDate localDate = LocalDate.now();

        // Membuat Jam
        DateTimeFormatter jam = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.now();
        return String.format("""
                Tanggal    : %s
                Waktu      : %s
                -----------------------------------
                %s
                %d         Rp. %d        Rp. %d
                -----------------------------------
                       Subtotal          : Rp. %d
                       Bayar             : Rp. %d
                       Kembalian         : Rp. %d
                -----------------------------------
                          Terima Kasih
                     Silahkan Datang Kembali
                -----------------------------------
                """, date.format(localDate), jam.format(localTime), nama, jmlObat, harga, totHarga, totHarga, bayar,
                (bayar - totHarga));
    }

}

public class TugasKasirApotik {
    public static void main(String[] args) {
        tampil t = new tampil("Selamat Datang Di Toko Apotik Kami");
        t.prosesKasir();
    }
}

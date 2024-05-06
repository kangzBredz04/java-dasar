import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * InnerTugasCRUDDataMahasiswa
 */
interface CRUD {

    void create();

    void read();

    void update();

    void delete();

    void startProgram();

}

class mahasiswa {
    private String nama;
    private String nim;
    private int umur;

    public mahasiswa(String nama, String nim, int umur) {
        this.nama = nama;
        this.nim = nim;
        this.umur = umur;
    }

    public mahasiswa() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    void displayData(int noUrut) {
        System.out.println(noUrut + ". " + getNama() + " - " + getNim() + " - " + getUmur());
    }

}

class prosesProgram implements CRUD {

    ArrayList<mahasiswa> dataMahasiswa = new ArrayList<>();
    mahasiswa mhs = new mahasiswa();

    Scanner in = new Scanner(System.in);
    int pilMenu, noUrut = 1, indexData;

    @Override
    public void startProgram() {
        while (true) {
            System.out.println("---------------------------------------");
            System.out.println(
                    "1. Mahasiswa Baru\n2. Tampil Data Mahasiswa\n3. Ubah Data Mahasiswa\n4. Hapus Data Mahasiswa\n");
            System.out.println("---------------------------------------");
            System.out.print("Pilih : ");
            pilMenu = in.nextInt();

            if (pilMenu == 1) {
                create();
            } else if (pilMenu == 2) {
                read();
            } else if (pilMenu == 3) {
                update();
            } else if (pilMenu == 4) {
                delete();
            }
        }
    }

    @SuppressWarnings("unused") // sebuah anotasi di Java yang memberi tahu kompiler untuk mengabaikan kesalahan
                                // yang mungkin muncul terkait dengan penggunaan variabel yang tidak digunakan.
    @Override
    public void create() {
        String nama, nim;
        int umur;
        nama = in.nextLine();
        System.out.print("Masukan nama : ");
        nama = in.nextLine();
        System.out.print("Masukan nim : ");
        nim = in.nextLine();
        System.out.print("Masukan umur : ");
        umur = in.nextInt();
        dataMahasiswa.add(new mahasiswa(nama, nim, umur));
    }

    @Override
    public void read() {
        if (dataMahasiswa.size() > 0) {
            for (mahasiswa m : dataMahasiswa) {
                m.displayData(noUrut);
                noUrut++;
            }
        } else {
            System.out.println("--- Tidak ditemukan data mahasiswa ---");
        }
    }

    @Override
    public void update() {
        if (dataMahasiswa.size() > 0) {
            for (mahasiswa m : dataMahasiswa) {
                m.displayData(noUrut);
                noUrut++;
            }
            System.out.print("Masukan nomor urut : ");
            indexData = in.nextInt();
            mahasiswa getMhs = dataMahasiswa.get(indexData);
            getMhs.displayData(indexData);
        } else {
            System.out.println("--- Tidak ditemukan data mahasiswa ---");
        }

    }

    @Override
    public void delete() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}

public class TugasCRUDDataMahasiswa {
    public static void main(String[] args) {
        prosesProgram x = new prosesProgram();
        x.startProgram();
    }
}

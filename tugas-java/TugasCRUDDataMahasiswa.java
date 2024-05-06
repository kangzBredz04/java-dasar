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
}

abstract class mahasiswa {
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

    abstract void startProgram();

    abstract void displayData();
}

class prosesProgram extends mahasiswa implements CRUD {

    List<mahasiswa> dataMahasiswa = new ArrayList<>();

    Scanner in = new Scanner(System.in);
    int pilMenu;

    public prosesProgram(String nama, String nim, int umur) {
        super(nama, nim, umur);
    }

    public prosesProgram() {
    }

    @Override
    void startProgram() {
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

    @Override
    public void create() {
        String nama, nim;
        int umur;
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
                m.displayData();
            }
        } else {
            System.out.println("--- Tidak ditemukan data mahasiswa ---");
        }
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    void displayData() {
        System.out.println(getNama() + " - " + getNim() + " - " + getUmur());
    }

}

public class TugasCRUDDataMahasiswa {
    public static void main(String[] args) {
        prosesProgram x = new prosesProgram();
        x.startProgram();
    }
}

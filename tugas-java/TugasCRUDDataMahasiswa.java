import java.util.ArrayList;
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
}

class prosesProgram extends mahasiswa implements CRUD {

    Scanner in = new Scanner(System.in);
    int pilMenu;

    public prosesProgram(String nama, String nim, int umur) {
        super(nama, nim, umur);
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

    }

    @Override
    public void read() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
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

}

public class TugasCRUDDataMahasiswa {
    public static void main(String[] args) {
        
    }
}

import java.util.ArrayList;

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
}

class prosesProgram extends mahasiswa {

    public prosesProgram(String nama, String nim, int umur) {
        super(nama, nim, umur);
    }

}

public class TugasCRUDDataMahasiswa {
    public static void main(String[] args) {

    }
}

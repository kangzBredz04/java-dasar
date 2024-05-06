import java.util.ArrayList;

/**
 * InnerTugasCRUDDataMahasiswa
 */
interface DataMahasiswa {

    // Methode
    String getNama();

    void setNama(String name);

    String getNim();

    void setNim();

    int getUmur();

    void setUmur();
}

abstract class mahasiswa implements DataMahasiswa {
    private String nama;
    private String nim;
    private int umur;

    public mahasiswa(String nama, String nim, int umur) {
        this.nama = nama;
        this.nim = nim;
        this.umur = umur;
    }

    abstract void pilMenu();
}

class prosesProgram extends mahasiswa {

    public prosesProgram(String nama, String nim, int umur) {
        super(nama, nim, umur);
    }

    @Override
    public String getNama() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNama'");
    }

    @Override
    public void setNama(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNama'");
    }

    @Override
    public String getNim() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNim'");
    }

    @Override
    public void setNim() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNim'");
    }

    @Override
    public int getUmur() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUmur'");
    }

    @Override
    public void setUmur() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setUmur'");
    }

    @Override
    void pilMenu() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pilMenu'");
    }

}

public class TugasCRUDDataMahasiswa {
    public static void main(String[] args) {

    }
}

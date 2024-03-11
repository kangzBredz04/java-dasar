package TehDian;
class pegawai {

    String[] idPegawai = { "001", "002" };
    String[] namaPegawai = { "Wahyu", "Ansayah" };
    String[] jenisPegawai = { "Atasan", "Pegawai Biasa" };
    String[] jabatan = { "Inti", null };
    int[] lamaBekerja = { 7, 2 };
    int[] gajiPegawai = new int[5];
    int[] tunjanganPegawai = new int[5];

    void tampil() {
        for (int i = 0; i < idPegawai.length; i++) {
            System.out.println("ID Pegawai\t: " + this.idPegawai[i]);
            System.out.println("Nama Pegawai\t: " + this.namaPegawai[i]);
            System.out.println("Jenis Pegawai\t: " + this.jenisPegawai[i]);
            System.out.println("Lama Bekerja\t: " + this.lamaBekerja[i] + " Tahun");
            System.out.println("");
        }
    }

    void hitung() {
        for (int i = 0; i < idPegawai.length; i++) {
            if (lamaBekerja[i] <= 1) {
                gajiPegawai[i] = 2000000;
            } else if (lamaBekerja[i] <= 5) {
                gajiPegawai[i] = 7000000;
            } else if (lamaBekerja[i] <= 10) {
                gajiPegawai[i] = 12000000;
            } else if (lamaBekerja[i] > 10) {
                gajiPegawai[i] = 20000000;
            }
        }
    }
}

class atasan extends pegawai {

    void tampil() {
        hitung();
        if (jabatan[0].equalsIgnoreCase("inti")) {
            tunjanganPegawai[0] = 10000000;
        } else if (jabatan[0].equalsIgnoreCase("non inti")) {
            tunjanganPegawai[0] = 5000000;
        }
        System.out.println("ID Pegawai\t: " + idPegawai[0]);
        System.out.println("Nama Pegawai\t: " + namaPegawai[0]);
        System.out.println("Gaji Pokok\t: Rp. " + gajiPegawai[0]);
        System.out.println("Tunjangan\t: Rp. " + tunjanganPegawai[0]);
        System.out.println("--------------------------------- +");
        System.out.println("Total Gaji\t: Rp. " + (gajiPegawai[0] + tunjanganPegawai[0]));
    }
}

class pegawaiBiasa extends pegawai {

    void tampil() {
        hitung();
        System.out.println("ID Pegawai\t: " + idPegawai[1]);
        System.out.println("Nama Pegawai\t: " + namaPegawai[1]);
        System.out.println("Gaji Pokok\t: Rp. " + gajiPegawai[1]);
        System.out.println("Total Gaji\t: Rp. " + gajiPegawai[1]);
    }

}

public class KuisLima {
    public static void main(String[] args) {
        pegawai peg = new pegawai();
        peg.tampil();
        System.out.println("======================================");
        atasan atas = new atasan();
        atas.tampil();
        System.out.println("======================================");
        System.out.println("======================================");
        pegawaiBiasa pegBiasa = new pegawaiBiasa();
        pegBiasa.tampil();
    }
}

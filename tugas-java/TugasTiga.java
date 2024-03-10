/**
 * Rekening
 */
interface Rekening {
    int getSaldo();

    void tarikTunai(int jumlah);

    void setorTunai(int jumlah);
}

class Nasabah {
    private String nama;
    private Rekening rekening;

    public Nasabah(String nama, Rekening rekening) {
        this.nama = nama;
        this.rekening = rekening;
    }

    public String getNama() {
        return nama;
    }

    public Rekening getRekening() {
        return rekening;
    }
}

class RekeningTabungan implements Rekening {

    private int saldo;

    public RekeningTabungan(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public int getSaldo() {
        return saldo;
    }

    @Override
    public void tarikTunai(int jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
        } else {
            System.out.println("Saldo tidak mencukupi!");
        }
    }

    @Override
    public void setorTunai(int jumlah) {
        saldo += jumlah;
    }

}

class ATM {

    private Nasabah nasabah;

    public ATM(Nasabah nasabah) {
        this.nasabah = nasabah;
    }

    public void tarikTunai(int jumlah) {
        nasabah.getRekening().tarikTunai(jumlah);
    }

    public void setorTunai(int jumlah) {
        nasabah.getRekening().setorTunai(jumlah);
    }

    public int cekSaldo() {
        return nasabah.getRekening().getSaldo();
    }

}

public class TugasTiga {
    public static void main(String[] args) {

        Nasabah nasabah = new Nasabah("Andi", new RekeningTabungan(1000000));
        ATM atm = new ATM(nasabah);

        atm.tarikTunai(500000);
        System.out.println("Saldo: " + atm.cekSaldo());

        atm.setorTunai(300000);
        System.out.println("Saldo: " + atm.cekSaldo());
    }

}

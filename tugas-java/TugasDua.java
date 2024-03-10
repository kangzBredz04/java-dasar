import java.util.*;

public class TugasDua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputJumlahKeluarga;
        String tampJmlAnggotaKeluarga;
        int tampJumlah = 0;
        int panjangData = 0;
        int jumlahMinBus = 0;
        System.out.print("Input Jumlah Keluarga : ");
        inputJumlahKeluarga = input.nextInt();
        tampJmlAnggotaKeluarga = input.nextLine();
        System.out.println("Input Jumlah Anggota dalam Keluarga");
        System.out.print("(dipisahkan oleh spasi) : ");
        tampJmlAnggotaKeluarga = input.nextLine();
        String[] tampungan = tampJmlAnggotaKeluarga.split(" ");
        for (String a : tampungan) {
            int b = Integer.parseInt(a);
            tampJumlah += b;
            panjangData++;
        }
        if (panjangData > inputJumlahKeluarga || panjangData < inputJumlahKeluarga) {
            System.out.println("Input harus sama dengan jumlah keluarga !");
        } else if (tampJumlah % 4 == 0) {
            jumlahMinBus = tampJumlah / 4;
            System.out.println("Minimum Bus yang dibutuhkan : " + jumlahMinBus);
        } else if (tampJumlah % 4 != 0) {
            jumlahMinBus = (tampJumlah / 4) + 1;
            System.out.println("Minimum Bus yang dibutuhkan : " + jumlahMinBus);
        }
    }
}

package TehDian;
import java.util.Scanner;

public class KuisDua {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input jumlah data
        System.out.print("Masukan jumlah data : ");
        int jmlData = in.nextInt();

        // Deklarasi tampungan data berupa array kosong
        int[] datas = new int[jmlData];

        // Input data sebanyak banyak data yang diminta oleh user
        for (int i = 0; i < datas.length; i++) {
            System.out.print("Data ke - " + (i + 1) + " : ");
            datas[i] = in.nextInt();
        }

        // Menampilkan hasil data bilangan ganjil
        System.out.print("Bilangan ganjil : ");
        for (int i = 0; i < datas.length; i++) {
            if (datas[i] % 2 == 1) {
                System.out.print(datas[i] + "\t");
            }
        }

        System.out.print("\n");

        // Menampilkan hasil data bilangan genap
        System.out.print("Bilangan genap : ");
        for (int i = 0; i < datas.length; i++) {
            if (datas[i] % 2 == 0) {
                System.out.print(datas[i] + "\t");
            }
        }

        // Menutup variable inputan
        in.close();
    }
}

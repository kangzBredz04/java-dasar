import java.util.Scanner;

public class KuisTiga {
    public static void main(String[] args) {
        // Program menampilkan deret bilangan fibonacci
        Scanner in = new Scanner(System.in);

        // Input jumlah data yang ingin ditampilkan
        System.out.print("Masuka jumlah deret bilangan fibonacci yang ingin ditampilkan : ");
        int jmlData = in.nextInt();

        // Menampilkan deret fibonacci
        for (int i = 0; i < jmlData; i++) {
            System.out.print(fibonacci(i) + "\t");
        }

        // Menutup variabel inputan
        in.close();
    }

    public static int fibonacci(int bil) {
        if (bil <= 1) {
            return bil;
        } else {
            return fibonacci(bil - 1) + fibonacci(bil - 2);
        }
    }
}

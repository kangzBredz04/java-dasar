import java.util.Scanner;

public class KuisEmpat {
    public static void main(String[] args) {
        // Program menampilkan deret bilangan prima
        Scanner in = new Scanner(System.in);

        // Meminta user untuk menginputkan batas untuk menampilkan deret bilangan
        System.out.print("Masukan batas deret bilangan prima : ");
        int batas = in.nextInt();

        // Hasil deret bilangan prima
        for (int i = 2; i <= batas; i++) {
            if (isPrima(i)) {
                System.out.print(i + "\t");
            }
        }

        // Menutup variable inputan
        in.close();
    }

    static boolean isPrima(int bil) {
        if (bil <= 1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(bil); i++) {
            if (bil % 2 == 0) {
                return false;
            }
        }

        return true;
    }
}

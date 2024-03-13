import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        String nama;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan nama : ");
        nama = inputan.nextLine();
        System.out.println("Hasil inputan : " + nama);
        inputan.close();
    }
}

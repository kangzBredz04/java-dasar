package BelajarJavaFundamental;

public class Pertemuan2 {
    public static void main(String[] args) {
        // LOGIKA PERCABANGAN
        // IF - ELSE
        int age = 18;
        String nationality = "Indonesia";

        if (age >= 18) {
            System.out.println("Anda boleh masuk");
        } else {
            System.out.println("Anda tidak boleh masuk");
        }

        // IF - ELSE - IF
        if (age >= 18 && nationality.equals("Indonesia")) {
            System.out.println("Anda boleh masuk");
        } else if (age >= 18) {
            System.out.println("Anda boleh masuk dengan visa");
        } else {
            System.out.println("Anda tidak boleh masuk");
        }

        // SWITCH CASE
        int number = 1;
        switch (number) {
            case 1:
                System.out.println("Satu");
                break;
            case 2:
                System.out.println("Dua");
                break;
            default:
                System.out.println("Bukan satu atau dua");
        }

        // Switch lambda adalah fitur baru di Java 12 yang memungkinkan untuk
        // menggunakan lambda expression dalam pernyataan switch. Lambda expression
        // adalah cara yang ringkas untuk menulis anonymous function.

        String b = "B";
        String ket = switch (b) {
            case "A":
                yield ket = "Sehat";
            default:
                yield ket = "Oke";
        };
        System.out.println(ket);

        // TERNARY OPERATOR
        // Ternary operator adalah bentuk sederhana dari if else
        // Terdiri dari kondisi yang dievaluasi,jika menghasilkan true maka nilai
        // pertama diambil jika false maka nilai kedua yang diambil
        // Contoh
        int angka = 10;
        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Angka " + angka + " adalah " + hasil);

        int umur = 20;
        String message = (umur >= 18) ? "Anda cukup umur" : "Anda belum cukup umur";
        System.out.println(message); // Output: Anda cukup umur

        int score = 85;
        String grade = (score >= 90) ? "A" : ((score >= 80) ? "B" : "C");
        System.out.println(grade); // Output: B

    }
}

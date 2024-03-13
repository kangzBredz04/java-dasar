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

    }
}

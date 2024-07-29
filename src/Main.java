import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.printf("Üssü alınacak sayıyı giriniz: ");
        int base = inp.nextInt();  // Üssü alınacak sayı
        System.out.printf("Alınacak üs değerini giriniz: ");
        int exponent = inp.nextInt();  // Üs değeri

        int result = 1;  // Sonuç değişkeni

        // Üs alma işlemi
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        System.out.printf("Üslü değer = " + result);

        inp.close();
    }
}

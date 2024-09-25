import java.util.Scanner;

public class PemilihanBilangan09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        if (angka > 0) {
            System.out.println("Angka " + angka + " adalah bilangan positif.");
        } else {
            System.out.println("Angka " + angka + " adalah bilangan negatif.");
        }
    }
}
import java.util.Scanner;

public class PemilihanBilangan09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int bilangan;
        String hasil;

        System.out.print("Masukkkan Bilangan: ");
        bilangan = input.nextInt();

        hasil = (bilangan % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
        System.out.println("Angka: " + bilangan + " adalah " + hasil);
    }
}
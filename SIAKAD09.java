
import java.util.Scanner;

public class SIAKAD09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, NIM, kelas;
        String nilaiHuruf, kualisifikasi;
        int absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        NIM = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextInt();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        
       
    if (nilaiAkhir >= 80) {
        nilaiHuruf = "A";
        kualisifikasi = "Sangat Baik";
    } else if (nilaiAkhir >= 73) {
        nilaiHuruf = "B+";
        kualisifikasi = "Lebih dari Baik";
    } else if (nilaiAkhir >= 65) {
        nilaiHuruf = "B";
        kualisifikasi = "Baik";
    } else if (nilaiAkhir >= 60) {
        nilaiHuruf = "C+";
        kualisifikasi = "Lebih dari Cukup";
    } else if (nilaiAkhir >= 50) {
        nilaiHuruf = "C";
        kualisifikasi = "Cukup";
    } else if (nilaiAkhir >= 39) {
        nilaiHuruf = "D";
        kualisifikasi = "Kurang";
    } else {
        nilaiHuruf = "E";
        kualisifikasi = "Gagal";
    }
        System.out.println("Mahasiswa dengan nama: " + nama + "NIM: " + NIM + "Kelas: " + kelas + "Nomor Absen: " + absen);
        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir 2huruf: " + nilaiHuruf);
        System.out.println("Nilai Kualifikasi: " + kualisifikasi);
    }

    }


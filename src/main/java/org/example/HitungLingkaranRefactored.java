package org.example;

import java.util.Scanner;

/**
 * Kelas HitungLingkaranRefactored adalah program untuk menghitung luas dan keliling lingkaran.
 * Program ini meminta pengguna untuk memasukkan jari-jari lingkaran dan menampilkan hasilnya.
 */
public class HitungLingkaranRefactored {
    private static final double PI = Math.PI; // Konstanta untuk Pi

    /**
     * Metode utama yang menjalankan program.
     *
     * @param args argumen baris perintah
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pilihan;

        do {
            double jariJari = mintaInputJariJari(scanner);

            Lingkaran lingkaran = new Lingkaran(jariJari);

            System.out.println("Luas lingkaran: " + lingkaran.hitungLuas());
            System.out.println("Keliling lingkaran: " + lingkaran.hitungKeliling());

            System.out.print("Apakah Anda ingin menghitung lingkaran lain? (y/n): ");
            pilihan = scanner.next();
        } while (pilihan.equalsIgnoreCase("y"));

        System.out.println("Terima kasih telah menggunakan program.");
        scanner.close();
    }

    /**
     * Metode untuk meminta input jari-jari dari pengguna.
     *
     * @param scanner objek Scanner untuk membaca input dari pengguna
     * @return jari-jari yang valid (harus positif)
     */
    public static double mintaInputJariJari(Scanner scanner) {
        double jariJari;
        do {
            System.out.print("Masukkan jari-jari lingkaran (harus positif): ");
            jariJari = scanner.nextDouble();
            if (jariJari <= 0) {
                System.out.println("Jari-jari harus lebih besar dari 0. Silakan coba lagi.");
            }
        } while (jariJari <= 0);
        return jariJari;
    }
}

/**
 * Kelas Lingkaran merepresentasikan sebuah lingkaran dengan jari-jari tertentu.
 * Kelas ini menyediakan metode untuk menghitung luas dan keliling lingkaran.
 */
class Lingkaran {
    private double jariJari;

    /**
     * Konstruktor untuk kelas Lingkaran.
     *
     * @param jariJari jari-jari lingkaran
     */
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    /**
     * Menghitung luas lingkaran.
     *
     * @return luas lingkaran
     */
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    /**
     * Menghitung keliling lingkaran.
     *
     * @return keliling lingkaran
     */
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}
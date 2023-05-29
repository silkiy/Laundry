package main.Laundry.main;

import java.util.Scanner;

public class Kasirlaundry {
    public static void main(String[] args) {
        /* Deklarasi loop */
        boolean progres = true;

        /* Make Object */
        Transaksi transaksi = new Transaksi();
        JenisLaundry type = new JenisLaundry();
        Client client = new Client();
        Petugas petugas = new Petugas();
        TampilanChild report = new TampilanChild();
        Petugas name = new Petugas();

        /* Lopping Process */
        while (progres) {
            System.out.println("\n________________ Tampilan Aplikasi _______________");
            Scanner input = new Scanner(System.in);
            System.out.println("1. Pelanggan");
//            System.out.println("2. Petugas");
            System.out.println("2. Exit");
            System.out.print("Masuk sebagai : ");
            int choice = input.nextInt();

            try {

                /* Conditional Pelangggan */
                if (choice == 1) {
                    report.report(type);
                    transaksi.prosesInputTransaksi();
                    transaksi.prosesTransaksi(client, type);
                    report.report(name);
                    report.tampilanAkhir();

                }

                /* Conditional Exit */
                else if (choice == 2) {
                    progres = false;


                    /* Conditional else */
                } else if ( choice > 3){
                    System.out.println("Maaf kami belum tersedia");
                }

            } catch (Exception e) { // nangkap error
                System.out.println("Terdpat Exception!!\n Info : " + e.getMessage());
            }
        }

    }
    }

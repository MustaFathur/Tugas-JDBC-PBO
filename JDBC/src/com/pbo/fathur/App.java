package com.pbo.fathur;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Transaksi transaksi = null;

        try {
            int menu;
            do {
                System.out.println("Menu:");
                System.out.println("1. Input Transaksi");
                System.out.println("2. Tampilkan Transaksi");
                System.out.println("3. Perbarui Transaksi");
                System.out.println("4. Hapus Transaksi");
                System.out.println("0. Keluar");
                System.out.print("Pilih menu: ");
                menu = scanner.nextInt();

                switch (menu) {
                    case 1:
                        System.out.println("Input Pelanggan");
                        System.out.println("------------------------");
                        System.out.print("Masukkan Nama Pelanggan: ");
                        String namaPelanggan = scanner.nextLine(); // clear buffer
                        namaPelanggan = scanner.nextLine();
                        System.out.print("Masukkan Nomor HP: ");
                        String nomorHP = scanner.nextLine();
                        System.out.print("Masukkan Alamat: ");
                        String alamat = scanner.nextLine();

                        System.out.println("");
                        System.out.println("Input Data Barang");
                        System.out.println("------------------------");
                        System.out.print("Kode Barang   : ");
                        String kodeBarang = scanner.nextLine();
                        System.out.print("Nama Barang   : ");
                        String namaBarang = scanner.nextLine();
                        System.out.print("Harga Barang  : ");
                        double hargaBarang = scanner.nextDouble();
                        System.out.print("Jumlah Beli   : ");
                        int jumlahBeli = scanner.nextInt();

                        transaksi = new Transaksi(namaPelanggan, nomorHP, alamat, kodeBarang,
                                namaBarang, hargaBarang, jumlahBeli);
                        transaksi.simpanTransaksi();
                        break;
                    case 2:
                        if (transaksi != null) {
                            System.out.println("Data Transaksi:");
                            transaksi.bacaTransaksiDariDatabase();
                        } else {
                            System.out.println("Belum ada transaksi yang dimasukkan.");
                        }
                        break;
                    case 3:
                        if (transaksi != null) {
                            System.out.print("Masukkan ID Transaksi yang akan diperbarui: ");
                            int idUpdate = scanner.nextInt();
                            System.out.print("Masukkan Harga Barang Baru: ");
                            double newHarga = scanner.nextDouble();
                            transaksi.perbaruiTransaksiDiDatabase(idUpdate, newHarga);
                        } else {
                            System.out.println("Belum ada transaksi yang dimasukkan.");
                        }
                        break;
                    case 4:
                        if (transaksi != null) {
                            System.out.print("Masukkan ID Transaksi yang akan dihapus: ");
                            int idHapus = scanner.nextInt();
                            transaksi.hapusTransaksiDariDatabase(idHapus);
                        } else {
                            System.out.println("Belum ada transaksi yang dimasukkan.");
                        }
                        break;
                    case 0:
                        System.out.println("Keluar dari program.");
                        break;
                    default:
                        System.out.println("Menu tidak valid.");
                        break;
                }
            } while (menu != 0);

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}

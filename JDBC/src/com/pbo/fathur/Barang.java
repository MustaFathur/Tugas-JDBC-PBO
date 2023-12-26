package com.pbo.fathur;
public class Barang {
    protected String kodeBarang;
    protected String namaBarang;
    protected double hargaBarang;

    public Barang(String kodeBarang, String namaBarang, double hargaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    public void tampilkanInfo() {
        System.out.println("Kode Barang: " + kodeBarang.toUpperCase());
        System.out.println("Nama Barang: " + namaBarang.toUpperCase());
        System.out.println("Harga Barang: " + hargaBarang);
    }
}

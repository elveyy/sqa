package com.praktikum;

public class Mahasiswa {

    private String nama;
    private double nilai;

    // Constructor
    public Mahasiswa(String nama, double nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public double getNilai() {
        return nilai;
    }

    // Method isLulus: lulus jika nilai >= 60
    public boolean isLulus() {
        return nilai >= 60;
    }

    // Setter for testing flexibility
    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
}

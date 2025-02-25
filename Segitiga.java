/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop23e;

/**
 *
 * @author LENOVO
 */
public class Segitiga {
    int alas;
    int tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void setBangunDatar(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getAlas() {
        return this.alas;
    }

    public int getTinggi() {
        return this.tinggi;
    }

    public double hitungLuas() {
        return 0.5 * (double)this.alas * (double)this.tinggi;
    }

    public void info() {
        System.out.println("Segitiga dengan Alas: " + this.alas + " dan Tinggi: " + this.tinggi);
        System.out.println("Luas Segitiga: " + this.hitungLuas());
    }
}

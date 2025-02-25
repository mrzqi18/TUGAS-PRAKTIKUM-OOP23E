/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop23e;

/**
 *
 * @author LENOVO
 */
public class PersegiPanjang {
    int panjang;
    int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void setBangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getPanjang() {
        return this.panjang;
    }

    public int getLebar() {
        return this.lebar;
    }

    public int hitungLuas() {
        return this.panjang * this.lebar;
    }

    public int hitungKeliling() {
        return 2 * (this.panjang + this.lebar);
    }

    public void info() {
        System.out.println("Persegi Panjang dengan Panjang: " + this.panjang + " dan Lebar: " + this.lebar);
        System.out.println("Luas Persegi Panjang: " + this.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + this.hitungKeliling());
    }
}

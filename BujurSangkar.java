/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop23e;

/**
 *
 * @author LENOVO
 */
public class BujurSangkar extends BangunDatar {
    int luas;
    int keliling;

    public BujurSangkar(int panjang, int lebar) {
        super(panjang, lebar);
    }

    public int getLuas() {
        this.luas = super.getPanjang() * super.getLebar();
        return this.luas;
    }

    public int getKeliling() {
        this.keliling = 4 * super.getPanjang();
        return this.keliling;
    }

    public void info() {
        System.out.println("Luas Bujur Sangkar:" + this.getLuas());
        System.out.println("Keliling Bujur Sangkar:" + this.getKeliling());
        System.out.println("=======================");
    }
}

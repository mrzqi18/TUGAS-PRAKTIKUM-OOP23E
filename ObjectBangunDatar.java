/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop23e;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ObjectBangunDatar {
      public static void main(String[] args) {
        System.out.println("================");
        System.out.println("1. Bujur Sangkar");
        System.out.println("2. Segitiga");
        System.out.println("3. Persegi Panjang");
        System.out.println("================");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Pilihan:");
        int pilihan = sc.nextInt();
        
            if (pilihan == 1) {
            System.out.print("Isikan Panjang: ");
            int panjang = sc.nextInt();
            System.out.print("Isikan Lebar: ");
            int lebar = sc.nextInt();
            if (panjang == lebar) {
                BujurSangkar bs = new BujurSangkar(panjang, lebar);
                bs.info();
            } else {
                System.out.println("Panjang dan Lebar harus sama untuk Bujur Sangkar.");
            }
            
            } else if (pilihan == 2) {
                System.out.print("Isikan Alas (Base): ");
                int alas = sc.nextInt();
                System.out.print("Isikan Tinggi (Height): ");
                int tinggi = sc.nextInt();
                Segitiga segitiga = new Segitiga(alas, tinggi);
                segitiga.info();

            } else if (pilihan == 3) {
                System.out.print("Isikan Panjang (Length): ");
                int panjang = sc.nextInt();
                System.out.print("Isikan Lebar (Width): ");
                int lebar = sc.nextInt();
                PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
                persegiPanjang.info();

            } else {
                System.out.println("Pilihan tidak valid!");
            }
    }
}

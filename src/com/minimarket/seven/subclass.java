package com.minimarket.seven;

import java.util.Scanner;

/**
 *
 * @author Adam Alifudin Alifudin
 * @author Yanda Bimantara
 */
public class subclass {
    
    // membuat scanner baru
    Scanner input = new Scanner(System.in);    
          
    //membuat variabel
    double bayar, total, kembalian, diskon, kekurangan;
    boolean beli[];
    int pesan, qty[], i;
    
    //variabel harga minuman
    double cocaCola = 5000, qtyCoca, subCoca;
    double leMineral = 3000, qytMineral, subMineral;
    double pocariSweat = 5000, qytPoca, subPoca;
    double tehKotak = 3700, qytTeh, subTeh;
    double redBull = 13900, qytRed, subRed;
    
    //variabel harga makanan
    double betterVanila = 5900, qytBetter,subBetter;
    double romaMalkistAbon=  4900,qytRoma,subRoma;
    double potabeeBBQBeef = 12500,qytPota,subPota;
    double sukroKacang= 7000,qytSukro,subSukro;
    double parotCreamMesses = 12000,qytParot,subParot;
    String makanan, minuman, jawab;
    
    void transaksi() {
        do {            
        System.out.println(" No  |            Nama Barang           |     Harga Barang     |");
        System.out.println(" 1   |       Coca Cola 350ml            |       Rp. 5.000,-    |");
        System.out.println(" 2   |       Le Mineral 600ml           |       Rp. 3.000,-    |");
        System.out.println(" 3   |       Pocari Sweat 500ml         |       Rp. 5.000,-    |");
        System.out.println(" 4   |       Teh Kotak 200ml            |       Rp. 3.700,-    |");
        System.out.println(" 5   |       Red Bull Kaleng 250ml      |       Rp. 13.900,-   |");
        System.out.println(" 6   |       Better Vanila 120g         |       Rp. 5.900,-    |");
        System.out.println(" 7   |       Roma Malkist Abon 135g     |       Rp. 4.900,-    |");
        System.out.println(" 8   |       Potabee BBQ Beef 120g      |       Rp. 12.500,-   |");
        System.out.println(" 9   |       Sukro Kacang 120g          |       Rp. 7.000,-    |");
        System.out.println(" 10  |       Parot Cream Messes 200g    |       Rp. 12.000,-   |");
        System.out.print("Masukan Pilihan Anda : (1-10) ");
        pesan = input.nextInt();
        switch (pesan) {
            case (1):
                System.out.println("\nPilihan Anda        : Coca Cola 350ml");
                System.out.print("Berapa pcs       : ");
                qtyCoca = input.nextInt();
                subCoca = cocaCola * qtyCoca;
                beli[0] = true;                
            break;                     
            case (2):
                System.out.println("\nPilihan Anda        : Le Mineral 600ml");
                System.out.print("Berapa pcs       : ");
                qytmineral=input.nextInt();
                submineral=leMineral*qytmineral;
                beli[1]=true;
            break;                     
            case (3):
                System.out.println("\nPilihan Anda        : Pocari Sweat 500ml ");
                System.out.print("Berapa pcs       : ");
                qytpoca=input.nextInt();
                subpoca=pocariSweat*qytpoca;
                beli[2]=true;
            break;                     
            default:
                System.err.println("Mohon maaf input salah!");
        }            
            System.out.println("Ingin Menambah pembelian? y/n");
            jawab = input.next();
        }while(jawab.equals("y"));
    } 
}

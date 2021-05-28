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
    boolean beli, beli1, beli2, beli3, beli4, beli5, beli6, beli7, beli8, beli9;
    int pesan;
    
    //variabel harga minuman
    double cocaCola = 5000, qytCoca, subCoca;
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
    String member, jawab;
    
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
        System.out.println("----------------------------------------------------------------");
        System.out.print("Masukan Pilihan Anda (1-10) : ");
        pesan = input.nextInt();
        switch (pesan) {
            case (1):
                System.out.println("\nPilihan Anda        : Coca Cola 350ml");
                System.out.print("Berapa pcs          : ");
                qytCoca = input.nextDouble();
                subCoca = cocaCola * qytCoca;                
                beli = true;
            break;                     
            case (2):
                System.out.println("\nPilihan Anda        : Le Mineral 600ml");
                System.out.print("Berapa pcs          : ");
                qytMineral=input.nextDouble();
                subMineral=leMineral*qytMineral;
                beli1 = true;
            break;                     
            case (3):
                System.out.println("\nPilihan Anda        : Pocari Sweat 500ml ");
                System.out.print("Berapa pcs          : ");
                qytPoca=input.nextDouble();
                subPoca=pocariSweat*qytPoca;
                beli2 = true;
            break;
            case (4):
                System.out.println("\nPilihan Anda        : Teh Kotak 200ml ");
                System.out.print("Berapa pcs          : ");
                qytTeh=input.nextDouble();
                subTeh=tehKotak*qytTeh;
                beli3 = true;
            break;
            case (5):
                System.out.println("\nPilihan Anda        : Red Bull Kaleng 250ml ");
                System.out.print("Berapa pcs          : ");
                qytRed=input.nextDouble();
                subRed=qytRed*redBull;
                beli4 = true;
            break;
            case (6):
                System.out.println("\nPilihan Anda        : Better Vanila 120g ");
                System.out.print("Berapa pcs          : ");
                qytBetter=input.nextDouble();
                subBetter=betterVanila*qytBetter;
                beli5 = true; 
            break;
            case (7):
                System.out.println("\nPilihan Anda        : Roma Malkist Abon 135g ");
                System.out.print("Berapa pcs          : ");
                qytRoma=input.nextDouble();
                subRoma=qytRoma*romaMalkistAbon;
                beli6 = true; 
                break;
            case (8):
                System.out.println("\nPilihan Anda        : Potabee BBQ Beef 120g  ");
                System.out.print("Berapa pcs          : ");  
                qytPota=input.nextDouble();
                subPota=qytPota*potabeeBBQBeef;
                beli7 = true;
            break;
            case (9):
                System.out.println("\nPilihan Anda        : Sukro Kacang 120g  ");
                System.out.print("Berapa pcs          : ");  
                qytSukro=input.nextDouble();
                subSukro=sukroKacang*qytSukro;
                beli8 = true;
            break;
            case (10):
                System.out.println("\nPilihan Anda        : Parot Cream Messes 200g  ");
                System.out.print("Berapa pcs          : "); 
                qytParot=input.nextDouble();
                subParot=qytParot*parotCreamMesses;
                beli9 = true; 
            break;
            default:
                System.err.println("Mohon maaf input salah!");
        }            
            System.out.print("Ingin Menambah pembelian? y/n : ");
            jawab = input.next();
        }while(jawab.equals("y"));
    } 
}

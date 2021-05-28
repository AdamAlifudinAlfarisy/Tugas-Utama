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
        System.out.print("Masukan Pilihan Anda : (1-10) ");
        pesan = input.nextInt();
        switch (pesan) {
            case (1):
                System.out.println("\nPilihan Anda        : Coca Cola 350ml");
                System.out.print("Berapa pcs       : ");
                qytCoca = input.nextInt();
                subCoca = cocaCola * qytCoca;
                beli[0] = true;                
            break;                     
            case (2):
                System.out.println("\nPilihan Anda        : Le Mineral 600ml");
                System.out.print("Berapa pcs       : ");
                qytMineral=input.nextInt();
                subMineral=leMineral*qytMineral;
                beli[1]=true;
            break;                     
            case (3):
                System.out.println("\nPilihan Anda        : Pocari Sweat 500ml ");
                System.out.print("Berapa pcs       : ");
                qytPoca=input.nextInt();
                subPoca=pocariSweat*qytPoca;
                beli[2]=true;
            break;
            case (4):
                System.out.println("\nPilihan Anda        : Teh Kotak 200ml ");
                System.out.print("Berapa pcs       : ");
                qytTeh=input.nextInt();
                subTeh=tehKotak*qytTeh;
                beli[3]=true;
            break;
            case (5):
                System.out.println("\nPilihan Anda        : Red Bull Kaleng 250ml ");
                System.out.print("Berapa pcs       : ");
                qytRed=input.nextInt();
                subRed=qytRed*redBull;
                beli[5]=true;
            break;
            case (6):
                System.out.println("\nPilihan Anda        : Better Vanila 120g ");
                System.out.print("Berapa pcs       : ");
                qytBetter=input.nextInt();
                subBetter=betterVanila*qytBetter;
                beli[6]=true;
            break;
            case (7):
                System.out.println("\nPilihan Anda        : Roma Malkist Abon 135g ");
                System.out.print("Berapa pcs       : ");
                qytRoma=input.nextInt();
                subRoma=qytRoma*romaMalkistAbon;
                beli[7]=true;
                break;
            case (8):
                System.out.println("\nPilihan Anda        :Potabee BBQ Beef 120g  ");
                System.out.print("Berapa pcs       : ");  
                qytPota=input.nextInt();
                subPota=qytPota*potabeeBBQBeef;
                beli[8]=true;
            break;
            case (9):
                System.out.println("\nPilihan Anda        :Sukro Kacang 120g  ");
                System.out.print("Berapa pcs       : ");  
                qytSukro=input.nextInt();
                subSukro=sukroKacang*qytSukro;
                beli[9]=true;
            break;
            case (10):
                System.out.println("\nPilihan Anda        :Parot Cream Messes 200g  ");
                System.out.print("Berapa pcs       : "); 
                qytParot=input.nextInt();
                subParot=qytParot*parotCreamMesses;
                beli[10]=true;
            break;
            default:
                System.err.println("Mohon maaf input salah!");
        }            
            System.out.println("Ingin Menambah pembelian? y/n");
            jawab = input.next();
        }while(jawab.equals("y"));
    } 
}

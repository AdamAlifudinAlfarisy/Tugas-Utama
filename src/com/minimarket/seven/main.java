package com.minimarket.seven;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Adam Alifudin A
 * @author Yanda Bimantara
 */
public class main {
    
    public static void main(String[] args) {
        
        // Scanner baru
        Scanner input = new Scanner(System.in);
        
        // membuat decimal format untuk angka belakang koma
        DecimalFormat df = new DecimalFormat("#.##");
        
        subclass objek = new subclass();
               
        System.out.println("----------- Selamat Datang di Minimarket Seven ----------------");
        System.out.println("---------------- Jaminan Harga Termurah -----------------------");
        objek.transaksi();
        
        objek.total = objek.subCoca + objek.subMineral + objek.subPoca + objek.subTeh + objek.subRed + objek.subBetter + objek.subRoma + objek.subPota + objek.subSukro + objek.subParot;
        System.out.println("Daftar Barang :");
        System.out.println("Nama Barang                 |   Harga     |  Jumlah Barang  |     SubTotal     |");
        if (objek.beli[0] ==true) {
            System.out.println(" Coca Cola 350ml                 :  Rp. "+df.format(objek.cocaCola)+"       "+df.format(objek.qytCoca)+"          Rp. "+df.format(objek.subCoca));
        }
        if (objek.beli[1] ==true) {
            System.out.println(" Le Mineral 600ml                   :  Rp. "+df.format(objek.leMineral)+"       "+df.format(objek.qytMineral)+"          Rp. "+df.format(objek.subMineral));
        }
        if (objek.beli[2] ==true) {
            System.out.println(" Pocari Sweat 500ml                 :  Rp. "+df.format(objek.pocariSweat)+"       "+df.format(objek.qytPoca)+"          Rp. "+df.format(objek.subPoca));
        }
        if (objek.beli[3] ==true) {
            System.out.println(" Teh Kotak 200ml                 :  Rp. "+df.format(objek.tehKotak)+"       "+df.format(objek.qytTeh)+"          Rp. "+df.format(objek.subTeh));
        }
        if (objek.beli[4] ==true) {
            System.out.println(" Red Bull Kaleng 250ml                 :  Rp. "+df.format(objek.redBull)+"       "+df.format(objek.qytRed)+"          Rp. "+df.format(objek.subRed));
        }
        if (objek.beli[5] ==true) {
            System.out.println(" Better Vanila 120g                 :  Rp. "+df.format(objek.betterVanila)+"       "+df.format(objek.qytBetter)+"          Rp. "+df.format(objek.subBetter));
        }
        if (objek.beli[6] ==true) {
            System.out.println(" Roma Malkist Abon 135g                 :  Rp. "+df.format(objek.romaMalkistAbon)+"       "+df.format(objek.qytRoma)+"          Rp. "+df.format(objek.subRoma));
        }
        if (objek.beli[7] ==true) {
            System.out.println(" Potabee BBQ Beef 120g                 :  Rp. "+df.format(objek.potabeeBBQBeef)+"       "+df.format(objek.qytPota)+"          Rp. "+df.format(objek.subPota));
        }
        if (objek.beli[8] ==true) {
            System.out.println(" Sukro Kacang 120g                 :  Rp. "+df.format(objek.sukroKacang)+"       "+df.format(objek.qytSukro)+"          Rp. "+df.format(objek.subSukro));
        }
        if (objek.beli[9] ==true) {
            System.out.println(" Parot Cream Messes 200g                 :  Rp. "+df.format(objek.parotCreamMesses)+"       "+df.format(objek.qytParot)+"          Rp. "+df.format(objek.subParot));
        }
        
    }
    
}

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
        
               
        System.out.println("----------- Selamat Datang di Minimarket Seven -----------------");
        System.out.println("---------------- Jaminan Harga Termurah ------------------------");
        objek.transaksi();
        
        objek.total = objek.subCoca + objek.subMineral + objek.subPoca + objek.subTeh + objek.subRed + objek.subBetter + objek.subRoma + objek.subPota + objek.subSukro + objek.subParot;
        System.out.println("Daftar Barang :");
        System.out.println("Nama Barang                 |    Harga     |  Jumlah Barang  |     SubTotal     |");
        if (objek.beli ==true) {
            System.out.println("Coca Cola 350ml             :  Rp. "+df.format(objek.cocaCola)+"            "+df.format(objek.qytCoca)+"               Rp. "+df.format(objek.subCoca));
        }
        if (objek.beli1 ==true) {
            System.out.println("Le Mineral 600ml            :  Rp. "+df.format(objek.leMineral)+"            "+df.format(objek.qytMineral)+"               Rp. "+df.format(objek.subMineral));
        }
        if (objek.beli2 ==true) {
            System.out.println("Pocari Sweat 500ml          :  Rp. "+df.format(objek.pocariSweat)+"            "+df.format(objek.qytPoca)+"               Rp. "+df.format(objek.subPoca));
        }
        if (objek.beli3 ==true) {
            System.out.println("Teh Kotak 200ml             :  Rp. "+df.format(objek.tehKotak)+"            "+df.format(objek.qytTeh)+"               Rp. "+df.format(objek.subTeh));
        }
        if (objek.beli4 ==true) {
            System.out.println("Red Bull Kaleng 250ml       :  Rp. "+df.format(objek.redBull)+"           "+df.format(objek.qytRed)+"               Rp. "+df.format(objek.subRed));
        }
        if (objek.beli5 ==true) {
            System.out.println("Better Vanila 120g          :  Rp. "+df.format(objek.betterVanila)+"            "+df.format(objek.qytBetter)+"               Rp. "+df.format(objek.subBetter));
        }
        if (objek.beli6 ==true) {
            System.out.println("Roma Malkist Abon 135g      :  Rp. "+df.format(objek.romaMalkistAbon)+"            "+df.format(objek.qytRoma)+"               Rp. "+df.format(objek.subRoma));
        }
        if (objek.beli7 ==true) {
            System.out.println("Potabee BBQ Beef 120g       :  Rp. "+df.format(objek.potabeeBBQBeef)+"           "+df.format(objek.qytPota)+"               Rp. "+df.format(objek.subPota));
        }
        if (objek.beli8 ==true) {
            System.out.println("Sukro Kacang 120g           :  Rp. "+df.format(objek.sukroKacang)+"            "+df.format(objek.qytSukro)+"               Rp. "+df.format(objek.subSukro));
        }
        if (objek.beli9 ==true) {
            System.out.println("Parot Cream Messes 200g     :  Rp. "+df.format(objek.parotCreamMesses)+"           "+df.format(objek.qytParot)+"               Rp. "+df.format(objek.subParot));
        } 
        
        objek.diskon = 0.05 * objek.total;
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("Total Pembayaran    : Rp. " + df.format(objek.total));
                System.out.print("Uang Anda           : Rp. ");
                objek.bayar = input.nextDouble();
                while(objek.bayar < objek.total){
                    objek.kekurangan = objek.total - objek.bayar;
                    System.err.println("\nMohon Maaf Pembayaran Anda Kurang       : Rp. " + objek.kekurangan);
                    System.out.print("Masukan Pembayaran Anda                 : Rp. ");
                    objek.bayar = input.nextInt();
                    
                    if (objek.bayar >= objek.total) {
                        break;
                    }
                }
                objek.kembalian = objek.bayar - objek.total;    
                
                System.out.print("Apakah Anda Member? y/n : ");
                objek.member = input.next();
                
                if (objek.member.equals("y")) {
                    System.out.println("\n-------------- Kepada Member Yang Terhormat ---------------");
                    System.out.println("----------- Selamat Anda Mendapatkan Cashback 5% -----------");
                    System.out.println("");
                    System.out.println("Pembayaran          : Rp. "+df.format(objek.total));
                    System.out.println("Uang Anda           : Rp. "+df.format(objek.bayar));
                    System.out.println("CashBack Anda       : Rp. "+df.format(objek.diskon));
                    System.out.println("Kembalian Anda      : Rp. "+df.format(objek.kembalian));
                    System.out.println("-------------------- Terima Kasih --------------------------");
                }   else {
                    System.out.println("Kembalian Anda      : Rp. " + df.format(objek.kembalian));
                    System.out.println("-------------------- Terima Kasih --------------------------");
                }
        
    }
    
}

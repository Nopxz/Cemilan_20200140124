/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cemilan_20200140124.cobajavacemilan_20200140124;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class inputjava {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Sayur: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Harga Perkilo: ");
        String hargakilo = input.nextLine();
        System.out.print("Masukkan Jumlah pembelian: ");
        String jumlahbeli = input.nextLine();
        System.out.print("Masukkan uang yang dibayarkan: ");
        String uangbayar = input.nextLine();
        
        System.out.println("Nama Sayur adalah "+nama);
        System.out.println("Harga "+ nama +" Per kilo adalah: "+hargakilo);
        System.out.println("Jumlah pembelian adalah: " +jumlahbeli+ " kg");
        System.out.println("Uang yang dibayarkan "+uangbayar);

                
    }
}

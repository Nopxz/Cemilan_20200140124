/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cemilan.Java.Cemilan.Java.Final;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ASUS
 */
@Controller
public class TokoJava {
    private int hitungawal(int harga, int jumlah){
        int totalawal = harga * jumlah;
        return totalawal;
    }
    
    private int hitungakhir(int harga, int jumlah){
        int hargaAkhir;
        int total = harga * jumlah;
        if (total < 16000){
            hargaAkhir = total - (total * 0);
        }
        else if (total > 16000){
            hargaAkhir = total - (total * 10 / 100);
        }
        else {
            hargaAkhir = total - (total * 15 / 100);
        }
        
        return hargaAkhir;
    }
    
     private int totalhargadiskon(int total, int hargaAkhir){
         int totalhargadiskon = total - hargaAkhir;
         return totalhargadiskon;
     }
     private int tampildiskon(int totalawal){
        int diskon;        
        if (totalawal < 16000){
            diskon = 0;
        }
        else if (totalawal > 16000){
            diskon = 10;
        }
        else {
            diskon = 15;
        }
        
        return diskon;
    }
     
    private int kembalian(int Bayar, int hargaAkhir){
        int kembalian = Bayar - hargaAkhir;
        return kembalian;
    }
    @RequestMapping("/input")
    //@ResponseBody
    public String getHasil(HttpServletRequest data, Model datasayur){
        String getNama = data.getParameter("namasayur");
        int getHarga = Integer.parseInt(data.getParameter("hargakilo"));
        int getJumlah = Integer.parseInt(data.getParameter("jumlahbeli"));
        int getBayar = Integer.parseInt(data.getParameter("uangbayar"));
        
        int totalawal = hitungawal(getHarga,getJumlah);
        int hargaAkhir = hitungakhir(getHarga,getJumlah);
        int totalhargadiskon = totalhargadiskon(totalawal,hargaAkhir);
        int kembalian = kembalian(getBayar,hargaAkhir);
        int diskon = tampildiskon(totalawal);
        
        
        datasayur.addAttribute("namasayur", getNama);
        datasayur.addAttribute("hargakilo", getHarga);
        datasayur.addAttribute("jumlahbeli", getJumlah);
        datasayur.addAttribute("uangbayar", getBayar);
        datasayur.addAttribute("hitungawal", totalawal);
        datasayur.addAttribute("hitungakhir", hargaAkhir);
        datasayur.addAttribute("totalhargadiskon", totalhargadiskon);
        datasayur.addAttribute("kembalian", kembalian);
        datasayur.addAttribute("tampildiskon", diskon);
        
      return"tableviewer";
        
    }
    
}

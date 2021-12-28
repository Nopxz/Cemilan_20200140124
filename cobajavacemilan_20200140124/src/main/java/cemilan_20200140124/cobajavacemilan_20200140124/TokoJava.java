/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cemilan_20200140124.cobajavacemilan_20200140124;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ASUS
 */
@Controller
public class TokoJava {
    @RequestMapping("/inputdata")
   public String getTable(Model isi){
           String result ="Nama Sayur";
           isi.addAttribute("expedisi", result);
           
          // DataKtp data = new DataKtp();
         ArrayList<List<String>> data = new ArrayList<>();
           data.add(0,Arrays.asList("Nama Sayur","Harga per Kg","Jumlah Beli","Uang yang diberikan"));
           data.add(1,Arrays.asList("Wortel","Rp 20000","kg buah","Rp 50000"));
           data.add(2,Arrays.asList("Kangkung","Rp 8000","3 kg","Rp 50000"));
           data.add(3,Arrays.asList("Kubis","Rp 10000","1 kg","Rp 10000"));
           data.add(4,Arrays.asList("Toge","Rp 5000","2 kg","Rp 10000"));
           data.add(5,Arrays.asList("Bayam","Rp 10000","2 kg","Rp 50000"));
           
           
           isi.addAttribute("tabel",data);
           
           return "tableviewer";
       }
}
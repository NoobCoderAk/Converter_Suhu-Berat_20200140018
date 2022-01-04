/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umy.praktek.satu.c;

/**
 *
 * @author ABID
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller


public class KonversiBerat {
    @RequestMapping("/massa")
    @ResponseBody
    public String konversi(){
        String konversi = "";
        double kg = 15, pon = 70, ons= 80, gr=500,  berat=0;
        
        String pilih = "6";// Ket 1( Kg ke Gr), 2 (Gr ke Kg), 3 (Kg ke ons), 4 (ons ke Kg), 5(Pon ke Ons) 6(ons Ke Pon)
        if (pilih == "1"){ // kg ke gr
            berat = kg * 1000;
            konversi = "Massa Benda (kg) jika di kenversi ke gr maka akan menjadi " + berat + " gr";
        }
        else if (pilih == "2"){ // gr ke kg
            berat = gr / 1000 ;
            konversi = "Massa Benda "+ gr +"(gr) jika di kenversi ke kg maka akan menjadi " + berat + " kg";
        }
        else if (pilih=="3"){// kg ke ons
            berat = kg * 35.274 ;
            konversi = "Massa Benda "+ kg+" (kg) jika di kenversi ke ons maka akan menjadi " + berat + " ons";
        }
        else if (pilih=="4"){// ons ke kg
            berat =  ons / 35.274 ;
            konversi = "Massa Benda "+ ons +" (ons) jika di kenversi ke kg maka akan menjadi " + berat + " kg";
        }
        else if (pilih=="5"){//Pon ke Ons
            berat = pon * 16 ;
            konversi = "Massa Benda "+ pon +" (pon) jika di kenversi ke ons maka akan menjadi " + berat + " ons";
        }
        else if (pilih=="6"){// ons ke pon
            berat = ons /16;
            konversi = "Massa Benda "+ ons +" (ons) jika di kenversi ke pon maka akan menjadi " + berat + " pon";
        }
        return konversi;
    }
}

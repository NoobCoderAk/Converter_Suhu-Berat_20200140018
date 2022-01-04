/*
 * Abid Akbar
 */
package umy.praktek.satu.c;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class KonversiSuhu {
    
    @RequestMapping("/suhu")
    @ResponseBody
    public String konversi (){
        String konversi = "";
        
        double celcius = 55.4, fahrenheit = 150.7, reamur= 200, suhu;
        
        String pilih= "F"; //pilihan untuk mengkonversi jika ingin yg lain silahkan menggalntinya dengan huruf (a/b/c/d)
        
        if (pilih=="C"){  // F ke C
            suhu = fahrenheit-32*5/9;
            konversi = "Hasil konversi dari "+ fahrenheit +"F ke Celcius : " + suhu ;
        }
        else if(pilih=="F"){ // C ke F
            suhu = 9/5*celcius+32;
            konversi = "Hasil konversi dari "+ celcius+"C ke Fahrenheit : " +suhu;
        }
        else if (pilih =="R"){ // C ke R
            suhu = celcius* 1.25;
            konversi = "Hasil konversi dari "+ celcius+"C ke Reamur : " +suhu;
        }
        else if (pilih == "A") {// R ke C
            suhu = reamur * 0.8;
            konversi = "Hasil konversi dari "+ reamur+"R ke Celcius : " +suhu;
            
        }
        else{ 
            konversi="tidak ditemukan";
        }
        
        return konversi;
    }
    
    @RequestMapping("/countdown")
    @ResponseBody
    public String countdown (){
        
        String hasil ="";
        for (int n = 55; n >=-1; n--){
            hasil +="Hasil : " + n + "<br>";
        }
        return hasil;
    }
    
}

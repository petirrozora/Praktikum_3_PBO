package Pertemuan3PBO;


public class KonversiSuhu2 extends KonversiSuhu{
	
    public void fahrenheitToReamur(float fahrenheit){
        float hasil = (fahrenheit-32)*4/9;
        System.out.println("Hasil konversi nilai "+fahrenheit+" Fahrenheit adalah : "+hasil+" Reamur");
    } 
}


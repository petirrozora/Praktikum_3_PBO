package Pertemuan3PBO;

public class KonversiSuhu {
	public void celciusToFahrenheit(float celcius){
        float hasil = celcius*9/5+32;
        System.out.println("Hasil konversi nilai "+celcius+" Celcius adalah : "+hasil+" Fahrenheit");        
    }
    public void celciusToReamur(float celcius){
        float hasil = celcius*4/5;
        System.out.println("Hasil konversi nilai "+celcius+" Celcius adalah : "+hasil+" Reamur");
    }

}

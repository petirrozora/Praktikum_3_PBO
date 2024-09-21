package Pertemuan3PBO;


public class Matematika implements InterfaceMatematika{
    public void pertambahan(int a, int b){
        int total = a+b;
        System.out.println("Pertambahan\t: "+a+" + "+b+" : "+total);
    }

    public void pengurangan(int a, int b) {
        int total = a-b;
        System.out.println("Pengurangan\t: "+a+"-"+b+" : "+total);
    }

    public void perkalian(int a, int b) {
        int total = a*b;
        System.out.println("Perkalian\t: "+a+"*"+b+" : "+total);
    }

    public void pembagian(int a, int b) {
        int total = a/b;
        System.out.println("Pembagian\t: "+a+"/"+b+" : "+total);
    } 
}

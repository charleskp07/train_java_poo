package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Staff personel1= new Staff("Akakpo");
        Staff personel2= new Staff("Yao");
        Staff personel3= new Staff("Kossi");
        Staff personel4= new Staff("Anani");
        Staff personel5= new Staff("Paul");

        Montres montre1 = new Montres(13,5);
        Montres montre2 = new Montres(12, 7);
//        Montres montre3 = new Montres();
//        Montres montre4 = new Montres();
//        Montres montre5 = new Montres();

        if (montre1.getHours()>23 || montre1.getMinutes()>59) {
            System.out.println("Heure ou minute invalide");
        }
        

        System.out.println("\n \n \t la montre de Mr "+ personel1.getNames() +" il est "+ montre1.getHours() +"h : "+ montre1.getMinutes() +" min");
        System.out.println("\n \t la montre de Mr "+ personel4.getNames() +" il est "+ montre1.getHours() +"h : "+ montre1.getMinutes() +" min");





    }
}
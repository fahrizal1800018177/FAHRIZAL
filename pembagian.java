package com.FAHRIZAL;

import java.util.Scanner;

class Kalkulator{
    
     void pembagian(float a, float b){
         float hasil = a / b;
        System.out.println("Hasil Pembagian Dari A dan B = " + hasil);
    }
}
public class Main{
    
     public static void main(String[] args) {

        Kalkulator kal = new Kalkulator();
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Masukkan Angka A : ");
        int inputA = userInput.nextInt();

        System.out.print("Masukkan Angka B : ");
        int inputB = userInput.nextInt();

        kal.pembagian(inputA, inputB);
        
    } 
}

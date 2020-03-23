package com.FAHRIZAL;

import java.util.Scanner;

class Kalkulator{
    
     void pembagian(int a, int b){
        System.out.println("Hasil Pembagian Dari A dan B = " + a / b);
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

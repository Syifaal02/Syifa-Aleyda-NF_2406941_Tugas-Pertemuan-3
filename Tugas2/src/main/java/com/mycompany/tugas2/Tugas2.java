package com.mycompany.Tugas2;

import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String vokal = "aeiou";
        String konsonan = "bcdfghjklmnpqrstvwxyz";
        
        System.out.print("Masukkan kata dengan 3 huruf (kecil) : ");
        String kata = input.nextLine();
        
        if (kata.length() == 3){ 
            
            if (konsonan.indexOf(kata.charAt(0)) != -1){
                System.out.println("Huruf ke-1 '" + kata.charAt(0) + "' = Konsonan");
                
                if (vokal.indexOf(kata.charAt(1)) != -1){
                System.out.println("Huruf ke-2 '" + kata.charAt(1) + "' = Vokal");
                
                    if (konsonan.indexOf(kata.charAt(2)) != -1) {
                        System.out.println("Huruf ke-3 '" + kata.charAt(2) + "' = Konsonan");
                        System.out.println();
                        System.out.println("Urutan huruf Konsonan-Vokal-Konsonan");
                    }
                    else {
                        System.out.println("Urutan huruf TIDAK Konsonan-Vokal-Konsonan");
                    }
                }
                else {
                    System.out.println("Urutan huruf TIDAK Konsonan-Vokal-Konsonan");
                }
            }
            else{
                System.out.println("Urutan huruf TIDAK Konsonan-Vokal-Konsonan");
            }
        }
        else {
            System.out.println("Kata lebih / kurang dari 3 huruf");
        }
        input.close();
    }
}

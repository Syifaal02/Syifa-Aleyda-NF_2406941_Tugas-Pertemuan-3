package com.mycompany.Tugas2;

import java.util.Scanner;

public class SoalNo3 {

    public static void main(String[] args) {

        Scanner input3 = new Scanner(System.in);

        System.out.print("Masukan Jam Masuk Kerja (1 - 12) : ");
        int masuk =  input3.nextInt();
        
        System.out.print("Masukan Jam Keluar Kerja (1 - 12) : ");
        int keluar = input3.nextInt();
        
        if((masuk >= 1 && masuk <= 12) && (keluar >=1 && keluar <= 12)){
            int durasi = (keluar - masuk + 12);
            
            System.out.println("Lama Bekerja " + durasi + " Jam");
            
            if(durasi > 12){
                System.out.println("Durasi kerja harus KURANG dari 12 jam");
            }
        }
        
        else {
            System.out.println("Input jam hanya boleh dari 1 - 12");
        }
        
        input3.close();
    }
}

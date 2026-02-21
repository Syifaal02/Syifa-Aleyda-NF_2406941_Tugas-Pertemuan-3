package com.mycompany.Tugas2;

import java.util.Scanner;

public class SoalNo2 {

    public static void main(String[] args) {

        Scanner input2 = new Scanner(System.in);
        
        System.out.print("Masukan nilai 3 Sisi : ");
        int sisi1 = input2.nextInt();
        int sisi2 = input2.nextInt();
        int sisi3 = input2.nextInt();
        
        if ((sisi1 == sisi2) && (sisi2 == sisi3) && (sisi3 == sisi1)){
            System.out.println("Termasuk Kubus");
        }
        
        else {
            System.out.println("Bukan Termasuk Kubus");
        }
        
        input2.close();
    }
}

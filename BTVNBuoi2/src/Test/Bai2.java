package Test;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi :");
        String chuoi = sc.nextLine();
        String chu = "";
        String so = "";

         for( int i = 0; i < chuoi.length();i++) {
             char tam = chuoi.charAt(i);
             if (tam >= '0' && tam <= '9') {
                 so += tam;
             } else {
                 chu += tam;
             }
         }
        System.out.println("Ket qua :");
        System.out.println(so);
        System.out.println(chu);
    }
}

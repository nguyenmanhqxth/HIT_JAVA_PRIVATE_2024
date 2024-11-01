package Test;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x;
        do{
            System.out.println("x = ");
            x = sc.nextFloat();
        }
        while (x<-100||x>100);
        int y;
        do{
            System.out.println("y = ");
            y = sc.nextInt();
        }
        while (y < Math.pow(-2,31) - 1 || y > Math.pow(2,31) - 1);
        float an = 1;
        for(int i = 1 ; i<=y; i++){
            an*=x;
        }
        System.out.println(an);
        sc.close();
    }
}

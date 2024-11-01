package Test;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        System.out.println("Nhập số:");
        Scanner sc = new Scanner(System.in);
        int so = sc.nextInt();

        String[] s1 = {"không","một","hai","ba","bốn","năm","sáu","bảy","tám","chín"};
        String[] s2 = {"mười","mười một","mười hai","mười ba","mười bốn","mười lăm","mười sáu","mười bảy","mười tám","mười chín"};
        String[] s3 = {"","hai mươi","ba mươi","bốn mươi","năm mươi","sáu mươi","bảy mươi","tám mươi","chín mươi"};
        String[] s4 = {"","một trăm","hai trăm","ba trăm","bốn trăm","năm trăm","sáu trăm","bảy trăm","tám trăm","chín trăm"};

        if(so < 10){
            System.out.println(s1[so]);
        }
        else if (so >= 10 && so < 20) {
            int a = so % 10;
            System.out.println(s2[a]);
        }
        else if (so >= 20 && so < 100){
            int b = so % 10;
            int c = so / 10;
            System.out.println(s3[c - 1] + " " + s1[b]);
        }
        else if (so >= 100 && so < 1000){
            int d = so / 100;
            int e = (so % 100) / 10;
            int f = so % 10;

            String kq = s4[d];


            if (e == 1) {
                kq += " mười " + s1[f];
            } else if (e > 1) {
                kq += " " + s3[e - 1] + " " + s1[f];
            } else {
                if (f != 0) {
                    kq += " lẻ " + s1[f];
                }
            }
            System.out.println(kq.trim());
        }
        sc.close();
    }
}

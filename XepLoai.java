/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class XepLoai {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Nhap so diem:");
        x = sc.nextInt();
        if(x<5){
            System.out.println("Kem");
        }
        if(x>5&&x<7){
            System.out.println("Trung binh");
    }
        if(x>7&&x<8){
            System.out.println("Kha");
        }
        if(x>8){
            System.out.println("Gioi");
        }
}
}

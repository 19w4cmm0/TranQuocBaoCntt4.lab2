/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT;

import java.util.Scanner;
public class SoChinhPhuong 
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập số cần kiểm tra: ");
        n = sc.nextInt();
        
        float kq = (float) Math.sqrt(n);
        if(kq == (int)kq)
        {
            System.out.println(n+ "là số chính phương");
        }
        else
        {
            System.out.println(n+ "không là số chính phương");
                }
    }
    
            

}

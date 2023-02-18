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
public class TinhGiaiThua {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n;

        
    
    System.out.println("Nhap so nguyen n:");
        n = myObj.nextInt();
        int dapAn = 1;
        int i = 1;
        while(i<=n)
        {
            dapAn = dapAn * i;
            i++;
        }
        System.out.println("Giai thua cua "+n+" la: "+dapAn);
    }
}

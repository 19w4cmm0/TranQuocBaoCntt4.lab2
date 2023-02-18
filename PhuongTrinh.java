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
public class PhuongTrinh {
    public static void giaiPhuongTrinhBacNhat(float a, float b)
    {
        if (a == 0){
            if (b == 0){
                System.out.println("Phương trình vô số nghiệm");
            }
            else{
                System.out.println("Phương trình vô nghiệm");
            }
            }
        else 
        {float nghiem=-b/a;
        System.out.println("Phương trình có một nghiệm: "+nghiem);
        }
    }
     
    public static void giaiPhuongTrinhBacHai(float a, float b, float c){
        if(a==0){
            giaiPhuongTrinhBacNhat(a,b);
        }
        else
        {
            float delta = (float) Math.pow(b, 2) - 4*a*c;
            if (delta<0)
        {System.out.println("PT vô nghiệm");}
        else if (delta==0)
        {
            float x1=-b/(2*a);
            System.out.println("PT có nghiệm kép x1=x2=" +x1);}
        else
        {
         float x1=(-b - (float)Math.sqrt(delta)/(2*a));
         float x2=(-b + (float)Math.sqrt(delta)/(2*a));
         
         System.out.printf("Nghiem x1: %2f \n", x1);
         System.out.printf("Nghiem x2: %2f \n", x2);
        }
        }
    }
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
float a, b, c;
System.out.println("Nhap a: ");
a = scanner.nextFloat();

System.out.println("Nhap b: ");
b = scanner.nextFloat();

System.out.println("Nhap c: ");
c = scanner.nextFloat();
giaiPhuongTrinhBacNhat(a, b);
giaiPhuongTrinhBacHai(a, b, c);

}
}
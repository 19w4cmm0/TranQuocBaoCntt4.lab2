
package BT;


import java.util.Scanner;
public class Menu {
    public static void menu(){
    
    
        System.out.println("#1.Giải phương trình bậc nhất");
        System.out.println("#2.Giải phương trình bậc hai");
        System.out.println("#3.Tính tiền điện");
        System.out.println("Chọn chức năng");
        Scanner s = new Scanner(System.in);
        int chon = s.nextInt();
        switch(chon){
            case 1:
                System.out.print("a: ");
                float a=s.nextFloat();
                System.out.print("b: ");
                float b=s.nextFloat();
                PhuongTrinh.giaiPhuongTrinhBacNhat(a, b);
                break;
                
            case 2:
                System.out.print("a: ");
                a=s.nextFloat();
                System.out.print("b: ");
                b=s.nextFloat();
                System.out.print("c: ");
                float c=s.nextFloat();
                PhuongTrinh.giaiPhuongTrinhBacHai(a, b, c);
                break;
            case 3:
                TienDien.tinhTienDien();
                break;
            default:
                System.exit(0);
        }
    
}
    public static void main(String[] args)
    {
            menu();
    }
}
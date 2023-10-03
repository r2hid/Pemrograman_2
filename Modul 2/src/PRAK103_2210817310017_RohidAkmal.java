import java.util.Scanner;

public class PRAK103_2210817310017_RohidAkmal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int angka = in.nextInt();

        if (angka%2==0) angka+=1;

        do {
            if (n==1){
                System.out.println(angka);
                break;
            }
            System.out.print(angka + ",");
            n-=1;
            angka+=2;
        }while (n>0);
    }
}
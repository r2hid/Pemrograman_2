import java.util.Scanner;

public class PRAK102_2210817310017_RohidAkmal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int urutan = in.nextInt();
        int angka = urutan;

        while (urutan >= 0) {
            if (angka % 5 == 0) {
                if(urutan==0){
                    System.out.print((angka/5)-1);
                    break;
                }
                System.out.print((angka/5)-1 + ", ");
            } else {
                if(urutan==0){
                    System.out.print(angka);
                    break;
                }
                System.out.print(angka + ", ");
            }
            angka+=1;
            urutan-=1;
        }
    }
}
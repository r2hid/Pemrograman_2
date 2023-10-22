import java.util.Scanner;

public class PRAK104_2210817310017_RohidAkmal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Tangan Abu: ");
        String Abu = in.nextLine();
        System.out.print("Tangan Bagas: ");
        String Bagas = in.nextLine();

        int poinAbu = 0;
        int poinBagas = 0;

        for (int i = 0; i <= Abu.length(); i += 2) {
            if(Abu.charAt(i)=='G'&&Bagas.charAt(i)=='B'
                    ||Abu.charAt(i)=='K'&&Bagas.charAt(i)=='G'
                    ||Abu.charAt(i)=='B'&&Bagas.charAt(i)=='K' ){
                poinBagas+=1;
            }
            else if(Abu.charAt(i)=='B'&&Bagas.charAt(i)=='G'
                    ||Abu.charAt(i)=='G'&&Bagas.charAt(i)=='K'
                    ||Abu.charAt(i)=='K'&&Bagas.charAt(i)=='B' ) {
                poinAbu+=1;
            }
        }
        if (poinAbu==poinBagas) {
            System.out.println("Seri");
        } else if (poinAbu>poinBagas) {
            System.out.println("Abu");
        }else {
            System.out.println("Bagas");
        }
    }
}
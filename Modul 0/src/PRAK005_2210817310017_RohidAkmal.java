import java.util.Scanner;

public class PRAK005_2210817310017_RohidAkmal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukan Makanan Favorit: ");
        String makanan = in.nextLine();
        System.out.print("Masukan Hobi: ");
        String Hobi = in.nextLine();

        System.out.println("Aku suka Makan "+makanan+" dan Hobiku "+Hobi);
    }
}
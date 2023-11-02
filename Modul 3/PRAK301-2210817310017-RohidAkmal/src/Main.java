import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Integer> listDadu = new LinkedList<>();
        int banyakDadu = input.nextInt();

        for (int i = 1; i <= banyakDadu; i++) {
            Dadu dadu = new Dadu();
            int isiDadu = dadu.acakNilai();
            listDadu.add(isiDadu);
            System.out.println("Dadu ke-" + i + " bernilai " + isiDadu);
        }
        int total = 0;

        for (int j = 0; j < banyakDadu; j++) {
            total += listDadu.getFirst();
            listDadu.removeFirst();
        }
        System.out.println("Total nilai dadu keseluruhan " + total);
    }
}
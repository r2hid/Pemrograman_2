import java.util.Random;

public class Dadu {
    int nilai;

    public int acakNilai() {
        Random rand = new Random();
        nilai = rand.nextInt(6)+1;
        return nilai;
    }
}
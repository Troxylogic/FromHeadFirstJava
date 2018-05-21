import java.sql.SQLOutput;

public class BeerSong {
    public static void main(String[] args) {
        int beerCount = 50;
        String word = " õlut ";

        while (beerCount > 0) {
            System.out.println("Riiulil on " + beerCount + word);
            beerCount--;
            System.out.println("Võtad ühe ära ja alles jääb " + beerCount);

            if (beerCount == 1) {
                word = " Õlu";

            }

            if (beerCount == 0) {
                System.out.println("Õlu on kahjugdgdks otsaadwadat :(");
            }


        }

    }
}

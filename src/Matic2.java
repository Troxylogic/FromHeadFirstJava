public class Matic2 {
    public static void main(String[] args) {
        String[] nimed = {"Mari", "Arnold", "Andrias", "Peeter", "Sandra", "Jaan", "Martin"};
        String[] teguvus = {"Sõidavad", "Ratustab", "Rallib", "Kimab", "Silitab"};
        String[] mida = {"Hobust", "Ratast", "Motikat", "patareid", "Siili"};

        int a = nimed.length;
        int b = teguvus.length;
        int c = mida.length;

        int rand1 = (int)(Math.random()* a);
        int rand2 = (int)(Math.random()* b);
        int rand3 = (int)(Math.random()* c);

        String phrase = nimed[rand1] + " " + teguvus[rand2] + " " + mida[rand3];

        System.out.println(phrase);

    }
}

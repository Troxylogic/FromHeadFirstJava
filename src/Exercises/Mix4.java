package Exercises;

public class Mix4 {
    int counter = 0;
    public static void main(String [] args) {
        int count = 0;
        Mix4 [] m4a =new Mix4[20];
        int x = 0;
        while (x < 9 ) {
            m4a[x] = new Mix4();
            System.out.println("new Mix4 id = " + x);
            System.out.println("before counter + 1 counter = " + m4a[x].counter);
            m4a[x].counter = m4a[x].counter + 1;
            System.out.println("m4a[].counter id = " + m4a[x].counter);
            System.out.println("start of count\n");
            count = count + 1;
            System.out.println("count 1 = " + count);
            count = count + m4a[x].maybeNew(x);
            System.out.println("count 2 = " + count);
            x = x + 1;
            System.out.println("end of While\n");
        }
        System.out.println(count + " "
                + m4a[1].counter);
    }
    public int maybeNew(int index) {
        if (index < 5) {
            Mix4 m4 = new Mix4();
            m4.counter = m4.counter + 1;
            return 1;
        }
        return 0;
    }
}

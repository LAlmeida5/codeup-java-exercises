public class ControlFlowExercises {
    public static void main(String[] args) {
    //Loop Basics
        // a.While
        int i = 5;
        while (i <= 15) {
            System.out.println("i is:" + i);
            i++;
        }

        // b.Do While
        int x = -2;
        do {
            x = x + 2 ;
            System.out.println(x);
        }
        while (x <= 98);

        int y = 100;
        do {
            System.out.println(y);
            y = y - 5;
        }
        while (y >= -10);

        long z = 2;
        do {
            System.out.println(z);
           z = z * z;
        }
        while(z <= 1000000);

        //c.For

        for(int a = 100; a >= -10; a = a - 5) {
            System.out.println(a);
        }

        for(long b=2; b <= 1000000; b = b *  b) {
            System.out.println(b);
        }

    //Fizzbuzz



    }
}

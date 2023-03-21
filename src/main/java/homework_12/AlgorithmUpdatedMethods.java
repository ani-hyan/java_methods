package homework_12;

import java.util.Random;

public class AlgorithmUpdatedMethods {
    public int primeFactor(int n) {
        if (n <= 1)
            return 1;
        int i = 2;
        int theLargest = 2;
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                theLargest = i;
                n /= i;
                i--;
            }
            i++;
        }

        if (theLargest == 2 && n % 2 != 0)
            return n;

        return theLargest;
    }

    public void random() {
        Random rd = new Random();
        int smallest = 100;
        int largest = 1;
        int i = 0;
        while (i < 10) {
            int n = rd.nextInt(101);
            if (n < smallest)
                smallest = n;
            else if (n > largest)
                largest = n;
            i++;
            System.out.println("random n is: " + n);
        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}

package math.problems;

public class PrimeNumber {

    public static void main(String[] args) {

        /*
         * Find list of Prime numbers from number 2 to 1 million.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */
        findPrimeNumbers();
    }

    static void findPrimeNumbers() {
        // Declare the variables
        int i, j, flag;
        int N = 100;

//		print_first_N_primes;
        // Print display message
        System.out.println("Prime numbers between 1 and "
                + N + " are:");

        // Traverse each number from 1 to N
        // with the help of for loop
        for (i = 1; i <= N; i++) {

            // Skip 0 and 1 as they are
            // niether prime nor composite
            if (i == 1 || i == 0)
                continue;

            // flag variable to tell
            // if i is prime or not
            flag = 1;

            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (flag == 1)
                System.out.print(i + " ");
        }
    }
}





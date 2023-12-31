// Java program to find
// the Prime Numbers from 1 to N
// using command line arguments

class GFG {

    // Function to check if x is prime
    public static int isPrime(int x)
    {
        int i;

        // Loop to check if x has any factor
        // other than 1 and x itself
        for (i = 2; i < x / 2 + 1; i++) {
            if (x % i == 0) {
                // Since i is a factor of x
                // x is not prime
                return 0;
            }
        }

        // x is prime
        return 1;
    }

    // Function to find prime numbers up to n
    public static void findPrimes(int n)
    {
        int i;

        // Loop from 2 to n
        // to find all prime numbers in between
        for (i = 2; i <= n; i++) {

            // Check if i is prime
            // If yes then print it
            // else continue to next number
            if (isPrime(i) == 1)
                System.out.print(i + ", ");
        }

        System.out.println();
    }

    // Driver code
    public static void main(String[] args)
    {

        // Check if length of args array is
        // greater than 0
        if (args.length > 0) {

            // Get the command line argument and
            // Convert it from string type to integer type
            int n = Integer.parseInt(args[0]);

            // Find all prime numbers upto n
            findPrimes(n);
        }
        else
            System.out.println("No command line "
                    + "arguments found.");
    }
}

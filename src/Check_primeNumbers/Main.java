package Check_primeNumbers;

public class Main {
	public static void main(String[] args) {

        int[] numbers = {7,12};  // checking numbers specified

        for (int n : numbers) {
            boolean isPrime = true;

            if (n <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= n / 2; i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime)
                System.out.println(n + " is a Prime number");
            else
                System.out.println(n + " is Not a Prime number");
        }
    }

}

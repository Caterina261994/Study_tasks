import java.util.Arrays;
import java.util.Scanner;

public class PrintSimpleNumber {
    public static int eratosfen(int n)  {
        int count = 0;
        boolean[] primes;
            primes=new boolean[n+1];
            Arrays.fill(primes, true);
            primes[0] = false;
            primes[1] = false;
            for (int i = 2; i < primes.length; ++i) {
                if (primes[i]) {
                    for (int j = 2; i * j < primes.length; ++j) {
                        primes[i * j] = false;
                    }
                }
            }
        for (int i = 2; i < primes.length; ++i) {
            if (primes[i]){
                count++;
            }
        }
        return count;
        }

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        for (int g = 0; g < 5; g++) {
            System.out.println("Введите верхнюю границу чисел для проверки:");
            int n = scan.nextInt();
            System.out.println("количество простых чисел = " + eratosfen(n));
        }
        }
    }

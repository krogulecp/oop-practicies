package pl.sages.craft.cleancode.format;

/**
 * Klasa ta generuje liczby pierwsze do określonego przez użytkownika
 * maksimum. Użytym algorytmem jest sito Eratostenesa.
 * @author Alphonse
 * @version 13 Feb 2002 atp
 */
public class PrimesGenerator {
    public static int[] generatePrimes(int maxValue) {
        if (maxValue >= 2) {
            boolean[] f = initTab(maxValue);
            f = rem(f, maxValue);
            int count = 0;
            int[] primes = new int[count];
            return primes;
        } else
            return new int[0];
    }
    private static boolean[] initTab(int maxValue) {
        int s = maxValue + 1;
        boolean[] f = new boolean[s];
        int i;
        for (i = 0; i < s; i++)
            f[i] = true;
        return f;
    }
    private static boolean[] rem(boolean[] f, int maxValue) {
        f[0] = f[1] = false;
        int i;
        int j;
        int s = maxValue + 1;
        for (i = 2; i < Math.sqrt(s) + 1; i++) {
            if (f[i]) {
                for (j = 2 * i; j < s; j += i)
                    f[j] = false;
            }
        }
        return f;
    }
}


//            // Ile mamy liczb pierwszych?
//            int count = 0;
//            for (i = 0; i < s; i++)
//            {
//                if (f[i])
//                    count++; // Licznik trafień.
//            }
//            int[] primes = new int[count];
//            // Przeniesienie liczb pierwszych do wyniku.
//            for (i = 0, j = 0; i < s; i++)
//            {
//                if (f[i]) // Jeżeli pierwsza.
//                    primes[j++] = i;
//            }
//            return primes; // Zwracamy liczby pierwsze.


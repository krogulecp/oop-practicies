package pl.sages.craft.cleancode.format;

/**
 * Klasa ta generuje liczby pierwsze do określonego przez użytkownika
 * maksimum. Użytym algorytmem jest sito Eratostenesa.
 * Algorytm jest dosyć prosty. Mamy tablicę liczb całkowitych
 * zaczynających się od 2. Wykreślamy wszystkie wielokrotności 2. Szukamy
 * następnej niewykreślonej liczby i wykreślamy wszystkie jej wielokrotności.
 * Powtarzamy działania do momentu osiągnięcia pierwiastka kwadratowego z maksymalnej wartości.
 *
 * @author Alphonse
 * @version 13 Feb 2002 atp
 */
class PrimesGenerator {

    /**
     * @param maxValue jest limitem generacji.
     */
    public static int[] generatePrimes(int maxValue)
    {
        if (maxValue < 2)
            return new int[0];

        int maxSize = maxValue + 1;
        boolean[] czyPierwsze = new boolean[maxSize];
        inicjujCzyPierwsze(maxSize, czyPierwsze);
        czyscNiepasujace(maxSize, czyPierwsze);
        int count = zliczLiczbyPierwsze(maxSize, czyPierwsze);

        return budujWynik(maxSize, czyPierwsze, count);
    }

    private static int[] budujWynik(int maxSize, boolean[] czyPierwsze, int count) {
        int[] primes = new int[count];
        for (int i = 0, j = 0; i < maxSize; i++)
        {
            if (czyPierwsze[i])
                primes[j++] = i;
        }
        return primes;
    }

    private static int zliczLiczbyPierwsze(int maxSize, boolean[] czyPierwsze) {
        // Ile mamy liczb pierwszych?
        int count = 0;
        for (int i = 0; i < maxSize; i++)
        {
            if (czyPierwsze[i]) {
                count++; // Licznik trafień.
            }
        }
        return count;
    }

    private static void inicjujCzyPierwsze(int maxSize, boolean[] czyPierwsze) {
        for (int i = 0; i < maxSize; i++)
            czyPierwsze[i] = true;
    }

    private static void czyscNiepasujace(int maxSize, boolean[] f) {
        f[0] = f[1] = false;
        for (int i = 2; i < Math.sqrt(maxSize) + 1; i++)
        {
            if (f[i]) // Jeżeli i nie jest wykreślone, wykreślamy jego wielokrotności.
            {
                for (int j = 2 * i; j < maxSize; j += i)
                    f[j] = false; // Wielokrotności nie są pierwsze.
            }
        }
    }
}


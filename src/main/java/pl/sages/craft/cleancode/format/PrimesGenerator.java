package pl.sages.craft.cleancode.format;

/**
 * Klasa ta generuje liczby pierwsze do określonego przez użytkownika
 * maksimum. Użytym algorytmem jest sito Eratostenesa.
 * <p>
 * Eratostenes z Cyrene, urodzony 276 p.n.e. w Cyrene, Libia --
 * zmarł 194 p.n.e. w Aleksandrii. Pierwszy człowiek, który obliczył
 * obwód Ziemi. Znany również z prac nad kalendarzem
 * z latami przestępnymi i prowadzenia biblioteki w Aleksandrii.
 * <p>
 * Algorytm jest dosyć prosty. Mamy tablicę liczb całkowitych
 * zaczynających się od 2. Wykreślamy wszystkie wielokrotności 2. Szukamy
 K O M E N T A R Z E 9 3
 * następnej niewykreślonej liczby i wykreślamy wszystkie jej wielokrotności.
 * Powtarzamy działania do momentu osiągnięcia pierwiastka kwadratowego z maksymalnej wartości.
 *
 * @author Alphonse
 * @version 13 Feb 2002 atp
 */
public class PrimesGenerator {

    /**
     * @param maxValue jest limitem generacji.
     */
    public static int[] generatePrimes(int maxValue)
    {
        if (maxValue >= 2) // Jedyny prawidłowy przypadek.
        {
            // Deklaracje.
            int s = maxValue + 1; // Rozmiar tablicy.
            boolean[] f = new boolean[s];
            int i;
            // Inicjalizacja tablicy wartościami true.
            for (i = 0; i < s; i++)
                f[i] = true;
            // Usuwanie znanych liczb niebędących pierwszymi.
            f[0] = f[1] = false;
            // Sito.
            int j;
            for (i = 2; i < Math.sqrt(s) + 1; i++)
            {
                if (f[i]) // Jeżeli i nie jest wykreślone, wykreślamy jego wielokrotności.
                {
                    for (j = 2 * i; j < s; j += i)
                        f[j] = false; // Wielokrotności nie są pierwsze.
                }
            }
            // Ile mamy liczb pierwszych?
            int count = 0;
            for (i = 0; i < s; i++)
            {
                if (f[i])
                    count++; // Licznik trafień.
            }
            int[] primes = new int[count];
            // Przeniesienie liczb pierwszych do wyniku.
            for (i = 0, j = 0; i < s; i++)
            {
                if (f[i]) // Jeżeli pierwsza.
                    primes[j++] = i;
            }
            return primes; // Zwracamy liczby pierwsze.
        }
        else // maxValue < 2
            return new int[0]; // Zwracamy pustą tablicę, jeżeli niewłaściwe dane wejściowe.
    }
}


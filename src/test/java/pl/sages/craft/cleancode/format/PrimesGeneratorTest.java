package pl.sages.craft.cleancode.format;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author krogulecp
 */
class PrimesGeneratorTest {

    @Test
    void shouldGeneratePrimes(){
        //given
        //when
        int[] primes = PrimesGenerator.generatePrimes(10);

        for (int i: primes) {
            System.out.println(i);
        }

        //Poniższe ciekawe ćwiczenie -
        Integer a1 = new Integer(30);
        Integer b1 = new Integer(30);
        System.out.println(a1 == b1);

        Integer a2 = 30;
        Integer b2 = 30;
        System.out.println(a2 == b2);

        Integer a3 = 150;
        Integer b3 = 150;
        System.out.println(a3 == b3);

        assertArrayEquals(new int[]{2,3,5,7}, primes);
    }

}
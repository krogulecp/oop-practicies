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
        //then
        assertArrayEquals(new int[]{2,3,5,7}, primes);
    }

}
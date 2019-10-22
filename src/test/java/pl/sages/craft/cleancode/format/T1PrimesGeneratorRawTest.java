package pl.sages.craft.cleancode.format;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author krogulecp
 */
class T1PrimesGeneratorRawTest {

    @Test
    void shouldGeneratePrimes(){
        //given
        //when
        int[] primes = T1PrimesGeneratorRaw.generatePrimes(10);

        //then
        assertArrayEquals(new int[]{2,3,5,7}, primes);
    }

}
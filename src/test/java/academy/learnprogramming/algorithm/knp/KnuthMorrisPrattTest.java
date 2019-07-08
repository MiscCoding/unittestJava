package academy.learnprogramming.algorithm.knp;

import academy.learnprogramming.algorithm.KNP.KnuthMorrisPratt;
import org.junit.Assert;
import org.junit.Test;

public class KnuthMorrisPrattTest {

    @Test
    public void computeLSPTableTest(){
        KnuthMorrisPratt kmp = new KnuthMorrisPratt();

        int [] actual = kmp.computeLSPTable(new char[]{'a', 'b', 'a', 'b', 'a', 'c'});
        int [] expect = new int[]{0,0,1,2,3,0};
        Assert.assertArrayEquals(expect, actual);
    }
}

package academy.learnprogramming.algorithm.bruteforce;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class BruteForceTest {
    BruteForce b = null;
    char [] array;
    @Before
    public void init() {
        b = new BruteForce();
        String s = new String("academy.learnprogramming");
        array = s.toCharArray();
    }

    @Test
    public void firstMatchTest(){
        Assert.assertEquals(0, b.firstMatch(array, new char[]{'a'}));
        Assert.assertEquals(16, b.firstMatch(array, new char[]{'g'}));
        Assert.assertEquals(22, b.firstMatch(array, new char[]{'n', 'g'}));
        Assert.assertEquals(6, b.firstMatch(array, new char[]{'y', '.', 'l', 'e'}));
        Assert.assertEquals(-1, b.firstMatch(array, new char[]{'z', 'z'}));
    }

    @Test
    public void everyMatch(){
        int [] expect = new int[array.length];
        Arrays.fill(expect, -1);
        expect[0] = 0;
        expect[1] = 2;
        expect[2] = 10;
        expect[3] = 18;
        System.out.println(Arrays.toString(expect));
        int[] found = b.everyMatch(array, new char[]{'a'});
        System.out.println("expect " + Arrays.toString(found));

        Arrays.fill(expect, -1);
        expect[0] = 16;
        expect[1] = 23;
        System.out.println("expect " + Arrays.toString(found));
        found = b.everyMatch(array, new char[]{'g'});
        Assert.assertArrayEquals(expect, found);

        Arrays.fill(expect, -1);
        expect[0] = 7;

        System.out.println("expect " + Arrays.toString(found));
        found = b.everyMatch(array, new char[]{'.'});
        Assert.assertArrayEquals(expect, found);
//        Assert.assertEquals(16, b.everyMatch(array, new char[]{'g'}));
//        Assert.assertEquals(22, b.everyMatch(array, new char[]{'n', 'g'}));
//        Assert.assertEquals(6, b.everyMatch(array, new char[]{'y', '.', 'l', 'e'}));
//        Assert.assertEquals(-1, b.everyMatch(array, new char[]{'z', 'z'}));
    }

    public void resetExpectArray(int [] expect){
        Arrays.fill(expect, -1);
    }
}

package academy.learnprogramming.algorithm.utils;

import academy.learnprogramming.algorithm.SimpleUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleUnitTest {
    SimpleUtils utils = null;
    @Before
    public void init(){
        utils = new SimpleUtils();
    }

    @Test
    public void stringToBooleanTrueTest(){

        Assert.assertTrue( utils.stringToBoolean("y"));

    }

    @Test
    public void stringToBooleanFalseTest(){

        Assert.assertFalse( utils.stringToBoolean("n"));
    }
}

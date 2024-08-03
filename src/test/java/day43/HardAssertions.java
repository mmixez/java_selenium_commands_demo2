package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

    @Test
    void test() {
       // Assert.assertEquals("xyz","xyz");
       // Assert.assertNotEquals(123,124);
        Assert.assertTrue(1==2);
    }
}

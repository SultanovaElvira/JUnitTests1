import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by LENOVO on 31.05.2017.
 */

public class MyUnitTest {

    @Test
    public void testConcatenate1() {
        MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);

    }

    @Test
    public void testConcatenate2() {
        MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwoo", result);

    }
}
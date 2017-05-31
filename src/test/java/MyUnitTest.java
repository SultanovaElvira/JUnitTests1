import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by LENOVO on 31.05.2017.
 */

public class MyUnitTest {

    @Test
    public void testConcatenate() {
        MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);

    }
}
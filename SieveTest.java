import java.util.*;
import org.junit.Assert.*;

public class SieveTest () {

    @Before
    public void setUp() throws Exception {}

    @After
    public void tearDown() throws Exception {}

    @Test
    public void calcMaxValid() throws Exception {
        String[] length = {"20"};
        int max = Sieve.calculateMax(length);
        assertEquals(max, 20);
    }

    @Test
    public void calcMaxMultArg() throws Exception {
        String[] length = {"45", "30", "50"};
        int max = Sieve.calculateMax(length);
        assertEquals(max, 45);
    }


    @Test
    public void calcMaxNoArg() throws Exception {
        try {
            String[] length = {};
            int max = Sieve.calculateMax(length);
            fail("Illegal Argument Exception should be thrown.");
        } catch (IllegalArgumentException e) {
            //invalid arg exception thrown because invalid arg was thrown
            return;
        }

    }

}

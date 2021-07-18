package milestone1.junit.stringConcat;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyUnitTest {
    @Test
    public void testShouldReturnConcatedString(){
        MyUnit myunit = new MyUnit();
        String s1 = "Javed";
        String s2 = " Ali";
        assertEquals("Javed Ali",myunit.stringConcat(s1,s2));
    }
}

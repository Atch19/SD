import static org.junit.Assert.*;
import org.junit.*;
public class evenTest{
    public even mp = new even();
    @Test
    public void test1(){
        int test = 3;
        assertEquals(true, even.testEven(test));
    }
}
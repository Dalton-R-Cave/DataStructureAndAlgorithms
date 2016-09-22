import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void testFibAt0(){
        long fibZero = Fibonacci.fib(0);

        assertEquals(0L, fibZero);
    }

    @Test
    public void testFibAt1(){
        long fibOne = Fibonacci.fib(1);

        assertEquals(1L, fibOne);
    }

    @Test
    public void testFibAt5(){
        long fibFive = Fibonacci.fib(5);

        assertEquals(5L, fibFive);
    }

    @Test
    public void testFibAt20(){
        long fibTwenty = Fibonacci.fib(20);

        assertEquals(6765L, fibTwenty);
    }

    @Test
    public void testFibAt30(){
        long fibThirty = Fibonacci.fib(30);

        assertEquals(832040L, fibThirty);
    }

    @Test
    public void testFibAt40(){
        long fibForty = Fibonacci.fib(40);

        assertEquals(102334155L, fibForty);
    }

    @Test
    public void testFibNoCacheAt20(){
        long fibTwenty = Fibonacci.fibNoCache(20);

        assertEquals(6765L, fibTwenty);
    }

    @Test
    public void testFibNoCacheAt40(){
        long fibForty = Fibonacci.fibNoCache(40);

        assertEquals(102334155L, fibForty);
    }

}

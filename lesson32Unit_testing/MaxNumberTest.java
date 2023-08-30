package lesson32Unit_testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumberTest {

    /*
    test cases:
    1.v massive net elements(massiv pustoi)
    2.v massive 1 element
    3.v massive 2 elementa
    4.v massive iz neskolkih elements, max nahoditsya v seredine
    5.v massive iz neskolkih elements, max pervyi
    6.v massive iz neskolkih elements, max poslednii
     */
    private MaxNumber m=new MaxNumber();
    @Test
    public void zeroElementTest(){
        int[] actual={};
        assertEquals(-1,m.findMax(actual));
    }
    @Test
    public void oneElementTest(){
        int[] ints={2};
        assertEquals(2,m.findMax(ints));
    }
    @Test
    public void twoElementsTest(){
        int[] twoE={2,2};
        assertEquals(2,m.findMax(twoE));
    }
    @Test
    public void severalElementsMiddleTest(){
        int[] actual={2,4,7,9,3,1,5};
        assertEquals(9,m.findMax(actual));
    }
    @Test
    public void severalElemFirstTest(){
        int[] actual={45,37,8,9,1,7};
        assertEquals(45,m.findMax(actual));
    }
    @Test
    public void severalElemLastTest(){
        int[] actual={45,37,8,9,1,7,86};
        assertEquals(86,m.findMax(actual));
    }


}
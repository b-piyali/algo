package piyali.dsa.scaler.sorting;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NobleIntegerTest {
    NobleInteger nobleInteger = new NobleInteger();

    @Test
    public void solveTest1(){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 2, 1, 3));
        assertEquals(nobleInteger.solve(nums), 1);
    }

    @Test
    public void solveTest2(){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 1, 3, 3));
        assertEquals(nobleInteger.solve(nums), -1);
    }

    @Test
    public void solveTest3(){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 7, 0, 9, 3, 6, 0, 6));
        assertEquals(nobleInteger.solve(nums), -1);
    }
}
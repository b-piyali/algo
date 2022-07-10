package piyali.dsa.scaler.sorting;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticProgressionTest {
    ArithmeticProgression ap = new ArithmeticProgression();

    @Test
    public void solveTest1(){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 5, 1));
        assertEquals(ap.solve(nums), 1);
    }

    @Test
    public void solveTest2(){
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 1));
        assertEquals(ap.solve(nums), 0);
    }
}
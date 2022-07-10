package piyali.dsa.scaler.binary_search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CeilingInSortedArrayTest {
    CeilingInSortedArray ceilingInSortedArray;

    @BeforeEach
    void setup(){
        ceilingInSortedArray = new CeilingInSortedArray();
    }

    @Test
    public void test1(){
        int len = 11;
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-98, -95, -79, -68, -41, -40, -18, 8, 34, 49, 73));
        int target = 29;
        int output = 34;
        assertEquals(output, ceilingInSortedArray.solve(len, input, target));
    }

    @Test
    public void test2(){
        int len = 5;
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2, 5, 6, 9, 18));
        int target = 7;
        int output = 9;
        assertEquals(output, ceilingInSortedArray.solve(len, input, target));
    }

    @Test
    public void test3(){
        int len = 6;
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 7, 9, 11, 19, 20));
        int target = 22;
        int output = -1;
        assertEquals(output, ceilingInSortedArray.solve(len, input, target));
    }
}
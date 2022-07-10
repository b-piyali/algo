package piyali.dsa.scaler.binary_search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SearchBitonicArrayTest {
    SearchBitonicArray bitonicArray;

    @BeforeEach
    void setup(){
        bitonicArray = new SearchBitonicArray();
    }

    @Test
    public void test1(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11));
        int target = 12;
        int output = 18;
        assertEquals(output, bitonicArray.solve(input, target));
    }

    @Test
    public void test2(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 9, 10, 20, 17, 5, 1));
        int target = 20;
        int output = 3;
        assertEquals(output, bitonicArray.solve(input, target));
    }

    @Test
    public void test3(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9, 10, 3, 2, 1));
        int target = 30;
        int output = -1;
        assertEquals(output, bitonicArray.solve(input, target));
    }

    @Test
    public void test4(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21));
        int target = 1;
        int output = 0;
        assertEquals(output, bitonicArray.solve(input, target));
    }
}
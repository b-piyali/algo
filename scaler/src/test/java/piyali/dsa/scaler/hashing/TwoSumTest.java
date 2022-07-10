package piyali.dsa.scaler.hashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private TwoSum twoSum;

    @BeforeEach
    void setup(){
        twoSum = new TwoSum();
    }

    @Test
    public void  twoSumTest1(){
        List<Integer> input = new ArrayList<>(Arrays.asList(2, 7, 11, 15));
        int target = 9;
        List<Integer> output = new ArrayList<>(Arrays.asList(1, 2));
        assertEquals(output, twoSum.twoSum(input, target));
    }

    @Test
    public void  twoSumTest2(){
        List<Integer> input = new ArrayList<>(Arrays.asList(4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8));
        int target = -3;
        List<Integer> output = new ArrayList<>(Arrays.asList(4, 8 ));
        assertEquals(output, twoSum.twoSum(input, target));
    }
}
package piyali.dsa.scaler.hashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SubarrayWithGivenSumTest {
    SubarrayWithGivenSum subarrayGivenSum;

    @BeforeEach
    void setup(){
        subarrayGivenSum = new SubarrayWithGivenSum();
    }

    @Test
    public void subarrey2ElementSum(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int target = 5;
        ArrayList<Integer> resunt = new ArrayList<>(Arrays.asList(2, 3));
        assertEquals(resunt, subarrayGivenSum.solve(list, target));
    }

    @Test
    public void subarreyNoElementSum(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 10, 20, 100, 105));
        int target = 110;
        ArrayList<Integer> resunt = new ArrayList<>(Arrays.asList(-1));
        assertEquals(resunt, subarrayGivenSum.solve(list, target));
    }

    @Test
    public void subarrey3ElementSum(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 2, -1, 3, 10, 5, 6, 3));
        int target = 12;
        ArrayList<Integer> resunt = new ArrayList<>(Arrays.asList(-1, 3, 10));
        assertEquals(resunt, subarrayGivenSum.solve(list, target));
    }
}
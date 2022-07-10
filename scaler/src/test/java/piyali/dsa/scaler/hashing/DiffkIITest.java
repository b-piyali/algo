package piyali.dsa.scaler.hashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DiffkIITest {
    DiffkII diff;

    @BeforeEach
    void setup(){
        diff = new DiffkII();
    }

    @Test
    public void diffPossibleTest1(){
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,5,3));
        int target = 2;
        assertEquals(1, diff.diffPossible(nums, target));
    }

    @Test
    public void diffPossibleTest2(){
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,5,3));
        int target = 6;
        assertEquals(0, diff.diffPossible(nums, target));
    }

    @Test
    public void diffPossibleTest4(){
        List<Integer> nums = new ArrayList<>(Arrays.asList(95, 97, 52, 51, 98, 41, 88, 12, 61, 32, 78, 9, 51, 39, 28, 28));
        int target = 43;
        assertEquals(1, diff.diffPossible(nums, target));
    }

    @Test
    public void diffPossibleTest3(){
        List<Integer> nums = new ArrayList<>(Arrays.asList(77, 28, 19, 21, 67, 15, 53, 25, 82, 52, 8, 94, 50, 30, 37, 39, 9, 43, 35, 48, 82, 53, 16, 20, 13, 95, 18, 67, 77, 12, 93, 0));
        int target = 53;
        assertEquals(1, diff.diffPossible(nums, target));
    }
}
package com.phudm.MathUtility.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    //Test case with 0 !
    @Test // Dùng để test data được tạo sẵn trong hàm, không phải truyền tham số từ ngoài
    public void testFactorialGivenRightArg0RunWell(){
        int n = 0; // cho/given n = 0
        long ExpectedResult = 1; // hy vọng 0 giai thừa ở trên sẽ là 1
        long actualValue = MathUtility.getFactorial(n); // thực tế là mấy đoán xem

        assertEquals(1, actualValue);
    }

    //Test case with 1 !
    @Test
    public void testFactorialGivenRightArg1RunWell(){
        int n = 1;
        long ExpectedResult = 1;
        long actualValue = MathUtility.getFactorial(n);

        assertEquals(1, actualValue);
    }

    //Test case with 2 !
    @Test
    public void testFactorialGivenRightArg2RunWell(){
        int n = 2;
        long ExpectedResult = 2;
        long actualValue = MathUtility.getFactorial(n);

        assertEquals(2, actualValue);
    }

    //Test case with 4 !
    @Test
    public void testFactorialGivenRightArg4RunWell(){
        int n = 4;
        long ExpectedResult = 24;
        long actualValue = MathUtility.getFactorial(n);

        assertEquals(24, actualValue);
    }

    //Test case with 5 !
    @Test
    public void testFactorialGivenRightArg5RunWell(){
        int n = 5; // cho/given n = 5
        long ExpectedResult = 120; // hy vọng 5 giai thừa ở trên sẽ là 120
        long actualValue = MathUtility.getFactorial(n); // thực tế là mấy đoán xem

        assertEquals(120, actualValue);
    }

}
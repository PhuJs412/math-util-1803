package com.phudm.MathUtility.core;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathUtilityDDTTest {

    // Chuẩn bị 1 mảng 2 chiều để chứa data vào test hàm getFactorial() của mình
    // Hàm này phải là Static - nằm ở 1 chỗ cố định trong RAM để cung cấp data cho các hàm test
    public static Object[][] initData(){
        return new Object[][]{
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120},
                {6, 720}
        };
    }

    @ParameterizedTest //Tham số hóa testing, dùng để đưa giá trị từ ngoài vào
    @MethodSource("initData")
    public void testFactorialGivenRightArgRunWell(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }

}
package com.phudm;

import com.phudm.MathUtility.core.MathUtility;

public class Main {
    public static void main(String[] args) {
        //testFactorialGivenRightArg0RunWell();
        // testFactorialGivenRightArg1RunWell();
       testFactorialGivenRightArg5RunWell();
        // testFactorialGivenRightArgMinus2ThrowException();
    }
    //Code các test case để test hàm chạy đúng hay sai, đang thực hảnh TDD
    //Kỹ thuật đặt tên hàm ứng với tên 1 test case, test case với n = 0, hàm trả về ngon
    // Tên hàm mang ý nghĩa test case để giúp dân dev kiểm tra tính thiếu đủ -> tránh định nghĩa thuốc trừ sâu
    public static void testFactorialGivenRightArg0RunWell(){
        int n = 0; // cho/given n = 0
        long ExpectedResult = 1; // hy vọng 0 giai thừa ở trên sẽ là 1
        long actualValue = MathUtility.getFactorial(n); // thực tế là mấy đoán xem

        //So sánh giữa expected và actual
        System.out.println("Expected result: " + ExpectedResult + " Actual: " + actualValue);
        System.out.println("Status: " + (actualValue == ExpectedResult)); // phép so sánh trả về kiểu boolean "(actualValue == ExpectedResult)"
    }

    public static void testFactorialGivenRightArg1RunWell(){
        int n = 1; // cho/given n = 0
        long ExpectedResult = 1; // hy vọng 0 giai thừa ở trên sẽ là 1
        long actualValue = MathUtility.getFactorial(n); // thực tế là mấy đoán xem

        //So sánh giữa expected và actual
        System.out.println("Expected result: " + ExpectedResult + " Actual: " + actualValue);
        System.out.println("Status: " + (actualValue == ExpectedResult)); // phép so sánh trả về kiểu boolean "(actualValue == ExpectedResult)"
    }

    public static void testFactorialGivenRightArg5RunWell(){
        int n = 5; // cho/given n = 5
        long ExpectedResult = 120; // hy vọng 0 giai thừa ở trên sẽ là 1
        long actualValue = MathUtility.getFactorial(n); // thực tế là mấy đoán xem

        //So sánh giữa expected và actual
        System.out.println("Expected result: " + ExpectedResult + " Actual: " + actualValue);
        System.out.println("Status: " + (actualValue == ExpectedResult)); // phép so sánh trả về kiểu boolean "(actualValue == ExpectedResult)"
    }

    //Test giải thừa với -2, hy vọng trả về 1 ngoại lệ xuống hiện
    public static void testFactorialGivenRightArgMinus2ThrowException(){
        MathUtility.getFactorial(-2);
        //Khi đưa n = -2, Thấy ngoại lệ mình rơi nước mắt
        // Code ta thiết kế là: nếu n âm thì phải có ngoại lệ xuất hiện
        // Mà BI giờ khi mình run với N = -2, Ngoại lệ XH, ko hoảng hốt
        // Mà lại mừng vì app run như thiết kế
    }
}
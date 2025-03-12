package com.phudm.MathUtility.core;

public class MathUtility {

        // Class này là bộ thư viện
        //n! = 1.2.3.4. ... n
        //0! = 1
        //20! vừa đủ kểu long, 21! kiểu long chứa ko nổi, tràn
        //quy ước hàm này chỉ tính n từ 0 ... 20
        //code hàm thì cx đồng thời phải kiểm thử hàm; muốn kiểm thử phải có test case!!!

//        public static long getFactorial(int n){
//            if(n < 0 || n > 20){
//                //return -1;
//                throw new IllegalArgumentException("n must be between 0 and 20");
//            }
//            if(n == 0){
//                return 1; //Early return, thoát sớm nếu có thể !!!
//            }
//            //Khỏi viết else cho code nhìn đẹp
//            // n bắt đầu từ 1...
//
//            // thuật con heo đất, nhân dồn, cộng dồn
//            long result = 1;
//            for (int i = 1; i <= n ; i++) {
//                    result *= i; //i bị nhân dồn vào result = result * i;
//            }
//            return result;
//    }

//CHUYỂN SANG TÍNH GIAI THỪA BẰNG ĐỆ QUY, GỌI LẠI CHÍNH MÌNH VƠỚI QUY MÔ NHO HƠN
    //N! = N  * (N-1)!
    public static long getFactorial(int n){
        if(n < 0 || n > 20){
            //return -1;
            throw new IllegalArgumentException("n must be between 0 and 20");
        }
        if(n == 0){
            return 1; //Early return, thoát sớm nếu có thể !!!
        }
        //Khỏi viết else cho code nhìn đẹp
        // n bắt đầu từ 1...

        // công thức de quy
        return n * getFactorial(n - 1);
    }

    // TEST CASE #2
    // VERIFY GETFACTORIAL() WITH N = 1
    // TEST/PROCEDURE
    //  (1) GIVEN N WITH 0
    //  (2) CALL GETFACTORIAL(N)
    // EXPECTED VALUE/ RESULT: THE METHOD WILL RETURN 1

    // TEST CASE #1
    // VERIFY GETFACTORIAL() WITH N = 0
    // TEST/PROCEDURE
    //  (1) GIVEN N WITH 0
    //  (2) CALL GETFACTORIAL(N)
    // EXPECTED VALUE/ RESULT: THE METHOD WILL RETURN 1

    // TEST CASE #3
    // VERIFY GETFACTORIAL() WITH N = 5
    // TEST/PROCEDURE
    //  (1) GIVEN N WITH 0
    //  (2) CALL GETFACTORIAL(N)
    // EXPECTED VALUE/ RESULT: THE METHOD WILL RETURN 120

    // CÒN NHIỀU TEST CASE NỮA!!!
}

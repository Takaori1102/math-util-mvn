package com.DanhNVT.mathutil.main;

import com.danh.mathutil.core.MathUtility;

public class Main {

    public static void main(String[] args) {

        //Test case #1 - Xem chi tiết mô tả ở duối (n = 0 | 0!)
        int n = 0; // tình huống kiểm tra 0!
        long expected = 1; // 0! hi vọng ra 1, ko cần lập trình cũng ra kq này
        long actual = MathUtility.getFactorial(n); //0! thực tế là mấy, gọi hàm và run là biết ngay

        //so sánh expected == actual hay ko??
        System.out.println("0 -> expected = " + expected
                + " | actual = " + actual);

        //Cách 1: Kiểm thử = sức người: Mắt nhìn, não nghĩ
        //testcase #2
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println("1! -> expected = " + expected
                + " | actual = " + actual);

        //test case #3
        System.out.println("5! -> expected = 120 "
                + " | actual = " + MathUtility.getFactorial(5));

    }

}

//Test case #1: CHECK getFactorial() with n = 0
//STEPS/PROCEDURE:
//  1. Given n=0
//  2. Invoke/call getFactorial(n=0)
//EXPECT RESULT: The method return 1 stands for 0! = 1
//STATUS       : PASSED? OR FAILED? --> lúc chạy hàm mới biết kết quả
//                                      gọi là TEST RUN. Có thể test đi
//                                      test lại nhiều lần
//test case #2: Check getFactorial(with n = 1)
//STEPS/PROCEDURES:
//          1. Given n = 1;
//          2. call/invoke getFactorial(n=1)
//EXPECTED RESULT
//          the method returns 1(standing for 1! = 1)
//STATUS       : PASSED? OR FAILED? --> to be updated later
//                                      when finishing Test Run
//test case #3: Check getFactorial(with n = 1)
//STEPS/PROCEDURES:
//          1. Given n = 1;
//          2. call/invoke getFactorial(n=1)
//EXPECTED RESULT
//          the method returns 120(standing for 5! = 120)
//STATUS       : PASSED? OR FAILED? --> to be updated later
//                                      when finishing Test Run
//            
//DEV phải test code của mình, có 3 cách xử lý
//Cách 1: In ra kết quả xử lý của hàm ra màn hình
//Nhắc lại: Công việc của QC bao gồm:
// Thiết kế Test case, run test case, ghi lại bug nếu có
//          Test case  Test Run               Log Bug > Jira, Bugzilla
// Test case: hỏi xem QC test app ntn bằng cách đưa vào data, 
// giá trị kỳ vong & cách dùng app với bộ data đó
// Lát hồi run thử xem sao => test run
//Đề thi PE ở đây!! thiết kế test case
//Ta thiết kế test case tính hàm tính giai thừa ta vừa viết
//Test code đc gọi là unit test 
//Test case cho unit test gọi là unit test case


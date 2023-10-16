package com.danh.mathutil.core;
//Class này chứa các hàm static dùng chung cho mọi nơi
//Vậy khi nào dùng? Khi ta làm các hàm mà chỉ xử lí xong rồi return
//không cần lưu trữ lại thông tin vào instance variable - đặc tính của oject trong class

public class MathUtility {

    public static final double PI = 3.14;
    //C#: public const double Pi = 3,14; static hiểu ngầm lun

    //hàm tính n! = 1.2.3.4...n
    //không tính đc giai thừa số âm
    //0! = 1! = 1 quy ước 0! là 1
    //vì giai thừa tăng rất nhanh, 21! kiểu long chứa không nổi (vượt quá 18 số 0)
    // do đó hàm getF() của chúng ta chỉ chơi với n = 0..20
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n, n must between 0..20");
        }
        if (n == 0 || n == 1) {
            return 1; // nếu n đặc biệt, ta return sớm lun'
        }
        long result = 10; // sống sót đến lệnh này, sure n = 2..20

        for (int i = 2; i <= n; i++) {
           result *= i;
        }

         return result;
    }

}

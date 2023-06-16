/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ducdmd152.mathutil.main;

import org.ducdmd152.mathutil.core.MathUtility;

/**
 *
 * @author MSI
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test case #1: check getF(0) tính 0!
        int n = 0;
        long expected = 1;
        long actual; //=? chờ app trả về
        
        actual = MathUtility.getFactorial(n);
        
        // so sánh
        System.out.println(n + "! | expected: " + expected +
                " | actual: " + actual);
        
        // test case #2
        System.out.println("1! | expected: 1 " +
                " | actual: " + MathUtility.getFactorial(1));
        
        // test case #3
        System.out.println("5! | expected: 120 " +
                " | actual: " + MathUtility.getFactorial(5));
        
        // test case #4
        System.out.println("4! | expected: 24 " +
                " | actual: " + MathUtility.getFactorial(4));
        
        // test case #5 -1! => throw EXCEPTION
        System.out.print("-1! | expected: an EXCEPTION " +
                " | actual: ");
        System.out.println(MathUtility.getFactorial(-1));
        
        // test case #6 20! => throw EXCEPTION
        System.out.print("20! | expected: an EXCEPTION " +
                " | actual: ");
        System.out.println(MathUtility.getFactorial(20));
    }
    
}
// CODE CHUẨN BỊ VIẾT, HAY ĐANG VIẾT, SẼ TIẾN HÀNH LUÔN CÁI VIỆC KIỂM THỬ
// TỨC LÀ VIẾT CODE ĐẾN ĐÂU, CÓ CODE KIỂM THỬ ĐẾN ĐÓ ĐỂ ĐẢM BẢO HÀM
// NGON
// KĨ THUẬT CODE VÀ TEST CODE SONG HÀNH VỚI NHAU, ĐAN XEN VỚI NHAU
// GỌI LÀ TDD - TEST DRIVEN DEVELOPMENT

// Code đến đâu, test đến đó.
// Giữa Developer và QC có những thứ giống nhau, và có nhiều thứ khác nhau
// Dev: việc chính yếu, duy nhất là viết code để ra cái app
// QC: việc chính yếu, duy nhất là tìm bug từ app.

// Cả 2 giống nhau điều dưới đây
// Cả 2 đều phải tạo ra, viết ra, phát triển các test cases.
// QC tạo test case để mô phỏng tình huống xài app của user.
// Dev tạo ra test case để mô phỏng tình huống xài hàm, xài class
// của chính mình, hoặc mô phỏng tình huống xài hàm/app của ai đó/dev nào đó sau này
// Cả 2 giống nhau là đều tạo test case và run test case để kết luận hàm, app đúng/sai

// BÂY GIỜ CHÚNG TA SẼ LÀM CÁC TEST CASE CHO HÀM GETF() Ở VAI TRÒ DEV

// Test case là 1 bộ data (gồm input và expected)
// dùng để mô phỏng cách xài hàm, xài app của ai đó dùng để verify/kiểm thử xem
// output của hàm/app có giống với expected hay không

// Bộ test case cho hàm getF()
// Có 2 cách viết test case, viết tự do và viết theo formal/chuẩn mực
// Viết tự do: nghĩ sao viết vậy
//      Các test case cho hàm getF() là
//      0! -> 1; 1! -> 1; 2! -> 2; 5! -> 120
// Viết theo chuẩn mực: viết theo template, gồm các info sau
// Test case #1 (mục đích của test case): check getF() with n=0
// Steps/Procedures (các bước run test case): đưa input, và click gì đó
//      1. Given n = 0
//      2. Execute/Call the function/method getF(with n), e.g. getF(n)
// Expected result:
//      getF(n = 0) must return 1
// Test case #2 (mục đích của test case): check getF() with n=5
// Steps/Procedures (các bước run test case): đưa input, và click gì đó
//      1. Given n = 5
//      2. Execute/Call the function/method getF(with n), e.g. getF(n)
// Expected result:
//      getF(n = 5) must return 120
// => PE
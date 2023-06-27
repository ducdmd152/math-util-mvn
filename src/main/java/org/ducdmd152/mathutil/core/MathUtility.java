/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ducdmd152.mathutil.core;

// class này clone giống java.util.Math
// chứa các hàm static Math.sqrt(), Math.sin(), Math.random()
public class MathUtility {
    public static final double PI = 3.1415;
    
    //hàm getF(n) là hàm tính n! = 1.2.3...n
    // n>=0 ; n<0 => exception (CHỬI) / -1
    // 0! = 1! = 1
    // vì giai thừa tăng rất nhanh, 21! long không chứa nổi (long ~ 18 số 0, ~ 20! vừa đủ)
    // 21! 22! 23! > 20! => CHỬI, ném Exception
//    public static long getFactorial(int n) {
//        if(n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid argument n, n must be between 0..20, plz");
//        if(n == 0 || n == 1)
//            return 1;
//        
//        long product = 1;
//        for(int i = 2; i <= n; i++)
//            product *= i;
//        
//        return product;
//    }
    
    public static long getFactorial(int n) {
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument n, n must be between 0..20, plz");
        if(n == 0 || n == 1)
            return 1;
        
        return n * getFactorial(n-1);
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.giaolang.mathutil.main;

import com.giaolang.mathutil.core.MathUtility;

/**
 *
 * @author tan18
 */
public class Main {
    public static void main(String[] args) {
        //test thử hàm mình vừa viết tính giai thừa đúng không
        //chuẩn bị bộ data test, test case
        
        //Test Case #1: Check if getFactorial() runs
        //                              well with n = 0
        //Test Procedures/Steps:
        //              Give n = 0
        //              Invoke getFactorial(n=0)
        
        //Expected Result: 1; //0! == 1???
        
        long expected = 1;//em hy vọng 1 được trả về
        int n = 0; //nếu anh đã đưa vào 0
        long actual = MathUtility.getFactorial(n); //chạy mới biết
        
        //in ra và tự kế luận có đúng không
        System.out.println(n + "! exepected = " + expected + " | actual = " + actual);
    }
}

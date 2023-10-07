/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.EmTanIT.mathutil.core;

import com.giaolang.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author tan18
 */
public class MathUtilityTest {
    
    //Mọi framework đều là thư viện và không có chiều ngược lại
    //Framework là thư viện nhưng ép phải viết theo 1 khuôn khổ, trình tự nhất định
    //Thư viện free hơn
    
    //Cấu trúc TC: ID | DESC | STEPS/ PROCEDURE | EXPECTED RESULT | STATUS
    //Test Case #1 - Verify getFactorial(with n = 0)
    //Steps:
       //       1. Given n = 0
       //       2. Call/ invoke getFactorial(n = 0)
    //Expected Result
       //   The method return 1 as the result of 0 !
    //Status: Passed | Failed đoán xem, chờ code xong, chạy mới biết được
    
    @Test
    public void verifyFactorialGivenRightArgument0ReturnsOk(){
        assertEquals(1, MathUtility.getFactorial(0));
    }
    
    //Test Case #2 - Verify getFactorial(with n = 1)
    //Steps:
        //      1. Given n = 1
        //      2. Call/ Invoke getFactorial(n = 1)
    //Expected Result
        //  The method return 1 as the result of 1 !
    //Status: Passed
    @Test
    public void verifyFactorialGivenRightArgument1ReturnsOk(){
        assertEquals(1, MathUtility.getFactorial(1));
    }
    
    //Test Case #3 - Verify getFactorial(with n = 5)
    //Steps:
        //      1. Given n = 5
        //      2. Call/ Invoke getFactorial(n =  5)
    //Expected Result
        //  The method return 120 as the result of 5 !
    //Status: Passed
    @Test
    public void verifyFactorialGivenRightArgument5ReturnsOk(){
        assertEquals(120, MathUtility.getFactorial(5));
    }
    //Clean and Build netBean ko làm gì cả
    //nó nhờ maven và ng kiến làm giùm
    //Maven giúp mình biến đổi từ dot Java -> dot class
}   

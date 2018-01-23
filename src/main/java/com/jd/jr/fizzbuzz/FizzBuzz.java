package com.jd.jr.fizzbuzz;

/**
 * 需求：
 * 写一个程序输入一个数值，返回对应的结果。
 * 1. 但是遇到数字为3的倍数的时候，打印“Fizz”替代数字，
 * 2. 5的倍数用“Buzz”代替，
 * 3. 既是3的倍数又是5的倍数打印“FizzBuzz”。
 *
 * @author zhangkai9@jd.com
 * @date 18-1-23
 */
public class FizzBuzz {
    public String process(int i) {
        if (i % 3 == 0) {
            return "Fizz";
        }
        if (i % 5 == 0) {
            return "Buzz";
        }
        return null;
    }
}

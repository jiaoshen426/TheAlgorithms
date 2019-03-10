package com.jiaoshen.string;

/**
 * 回文
 *
 * @author jiaoshen
 * @date 2019/3/10-17:11
 */
public class PalindromeDemo {
    /**
     * 判断数字是否回文
     *
     * @param num
     * @return
     */
    public static boolean isPalindrome(int num) {
        int numlength = String.valueOf(num).length();
        if (numlength < 2) {
            return true;
        }

        char[] numArray = String.valueOf(num).toCharArray();
        for (int i = 0; i < numlength / 2; i++) {
            if (numArray[i] != numArray[numlength - i - 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 输出数字的反序数字（只限于正数）
     *
     * @param num
     * @return
     */
    public static Integer getReverse(int num) {
        int reverse = 0;
        while (num > 0) {
            reverse *=10;
            reverse += num % 10;
            num /= 10;
        }
        return reverse;
    }

    /**
     * 把数字和其反序相加直到获得回文
     *
     * @return
     */
    private static void getEndPalindromeNum(int num) {
       if(isPalindrome(num)){
           System.out.println(num +"是回文");
       }
       else{
           int subNum =num + getReverse(num);
           System.out.println(num +"+"+ getReverse(num)+"="+subNum );
           getEndPalindromeNum(subNum);
       }
    }


    public static void main(String[] args) {
        getEndPalindromeNum(196);

    }

}

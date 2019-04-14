package com.jiaoshen.test;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * @author jiaoshen
 * @date 2019/4/15-0:24
 */
public class Testhashsha256 {
    //   SECRET KEY
    private final static String secret_key = "ea1b3f8262cb4d22baacf35ee0f51ea6";
    /**
     * 将加密后的字节数组转换成字符串
     *
     * @param b 字节数组
     * @return 字符串
     */
    private static String byteArrayToHexString(byte[] b) {
        StringBuilder hs = new StringBuilder();
        String stmp;
        for (int n = 0; b!=null && n < b.length; n++) {
            stmp = Integer.toHexString(b[n] & 0XFF);
            if (stmp.length() == 1){
                hs.append('0');
            }
            hs.append(stmp);
        }
        return hs.toString().toLowerCase();
    }
    /**
     * sha256_HMAC加密
     * @param message 消息
     * @param secret  秘钥
     * @return 加密后字符串
     */
    private static String sha256_HMAC(String message, String secret) {
        String hash = "";
        try {
            Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
            SecretKeySpec secret_key = new SecretKeySpec(secret.getBytes(), "HmacSHA256");
            sha256_HMAC.init(secret_key);
            byte[] bytes = sha256_HMAC.doFinal(message.getBytes());
            hash = byteArrayToHexString(bytes);
            System.out.println(hash);
        } catch (Exception e) {
            System.out.println("Error HmacSHA256 ===========" + e.getMessage());
        }
        return hash;
    }
     public static void main(String[] args) {
         String timestemp ="1554861086";
         String  userID = "3v0O";
         String sign ="4bcc1a5e0517310f3fecf87edd1ff52cb34ddd7f2b9a8d7c9a2eb6777b1c9d86";
         String s1= timestemp+":"+userID+":"+secret_key;
         System.out.println(sha256_HMAC(s1,secret_key).equals(sign));


        }

}

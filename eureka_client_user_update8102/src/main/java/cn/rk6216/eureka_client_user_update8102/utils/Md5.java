package cn.rk6216.eureka_client_user_update8102.utils;

import java.math.BigInteger;
import java.security.MessageDigest;

// Md5 算法
public class Md5 {
    public static String md5(String str){
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
            md.update(str.getBytes());
            // digest()最后确定返回md5 hash值，返回值为8位字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
            // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
            //一个byte是八位二进制，也就是2位十六进制字符（2的8次方等于16的2次方）
            String result = new BigInteger(1, md.digest()).toString(16);
            System.out.println("in----->" + result);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String yh(String text) {
        System.out.println(text);
        StringBuilder result=new StringBuilder();
        String temp="";
        for(int i=0;i<text.length();){
            temp=text.substring(i,i+3);
            result.append((char)(Integer.parseInt(temp)^169));
            i+=3;
        }
        System.out.println(result);
        return result.toString();
    }

}

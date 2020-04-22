package cn.rk6216.client_login8098.utils;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 *  @author: YML
 *  @Date: 2020/4/14 15:23
 *  @Description:工具类，给前端密码进行解密和实现md5
 */
public class PasswordCode {

    //解密方法，说明：前端的加密逻辑为将密码的每一位转ascill码后进行和key169的异或，
    //然后拼接成一串数字发送到后端，所以解密需要将每三位取一个值异或169后转为字符则是该位原来的字符
    public String getPassword(String text){
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

    public String md5(String str){
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
            md.update(str.getBytes());
            // digest()最后确定返回md5 hash值，返回值为8位字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
            // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
            //一个byte是八位二进制，也就是2位十六进制字符（2的8次方等于16的2次方）
            //System.out.println(new BigInteger(1, md.digest()).toString(16));打印的和后来的不一样，千万别new一个
            return new BigInteger(1, md.digest()).toString(16);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

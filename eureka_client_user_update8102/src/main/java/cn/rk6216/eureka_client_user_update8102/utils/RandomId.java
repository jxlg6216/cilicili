package cn.rk6216.eureka_client_user_update8102.utils;

import java.util.Random;

/**
 *  生成随机 ID
 *  @author: Lizq
 *  @Date: 2019/12/23 10:32
 */
public class RandomId {

    //生成随机的20位 ID 样例：{3A5C-75A4-D9FA-11E92}
    public static String getRandom20Id(){
        char[] str={'A','B','C','1','D','E','2','F','G','3','H','4','I','5','J','K','6','L','M','N','7','O','P','8','Q','R','S','9','T','U','V','0','W','X','Y','Z'};
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        for(int i=0;i<20;i++){
            if(i==4 || i==9 || i==14)stringBuilder.append("-");
            else stringBuilder.append(str[random.nextInt(35)]);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    //生成随机的16位 样例：{3A5-DjA-1E9-9EB3}
    public static String getRandom16Id(){
        char[] str={'A','B','C','1','D','E','2','F','G','3','H','4','I','5','J','K','6','L','M','N','7','O','P','8','Q','R','S','9','T','U','V','0','W','X','Y','Z'};
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        for(int i=0;i<16;i++){
            if(i==3 || i==7 || i==11)stringBuilder.append("-");
            else stringBuilder.append(str[random.nextInt(35)]);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

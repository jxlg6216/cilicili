package cn.rk6216.client_upload8090.Utils;

import cn.rk6216.client_upload8090.entity.CheckFileTypeResult;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *  @author: YML
 *  @Date: 2020/3/29 13:54
 *  @Description: 功能是检测上传的图片是否是正确的文件格式
 */
public class CheckImg {
    //仅仅支持jpg和png格式
    public static CheckFileTypeResult checkImg(MultipartFile img)throws IOException{
        CheckFileTypeResult result=new CheckFileTypeResult();
        if(img.isEmpty()){
            result.setStatus(false);
            result.setWhy("文件为空");
            return result;
        }
        byte[] bs=img.getBytes();
        StringBuilder sb1=new StringBuilder();
        String tem="";
        //将文件头转化为StringBuilder
        for(int i=0;i<4;i++){
            tem=Integer.toHexString(bs[i] & 0xFF);
            if (tem.length() < 2) {
                sb1.append(0);
            }
            sb1.append(tem);
        }
        //匹对jpg和png文件头
        if(sb1.toString().equals("ffd8ffe0")||sb1.toString().equals("89504e47")){
            result.setStatus(true);
            return result;
        }else {
            result.setStatus(false);
            result.setWhy("文件内容不属于jpg或png内容，无法解析");
            return result;
        }
    }
}

package cn.rk6216.client_upload8090.Utils;

import cn.rk6216.client_upload8090.entity.CheckFileTypeResult;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *  @author: YML
 *  @Date: 2020/2/8 20:57
 *  @Description: 工具类，用于判断上传的文件是否为视频类型，可防止恶意上传
 */
public class CheckFileType {

    //默认判断文件头前三个字节内容
    public static int CHECK_BYTES_NUMBER = 3;

    public final static Map<String, String> FILE_TYPE_MAP = new HashMap<String, String>();

//    private CheckFileType(){}
    static{
        getAllFileType(); //初始化文件类型信息
    }

    /**
     * Discription:[getAllFileType,常见文件头信息]
     */
    private static void getAllFileType()
    {
        //3gp,mov,asf,asx
        //FILE_TYPE_MAP.put("2e524d46", "rmvb"); //rmvb/rm相同，暂时不会
        FILE_TYPE_MAP.put("464c5601", "flv"); //flv与f4v相同
        FILE_TYPE_MAP.put("00000020", "mp4");
        //FILE_TYPE_MAP.put("3026b275", "wmv"); //wmv与asf相同,暂时不会
        FILE_TYPE_MAP.put("52494646", "avi");
        FILE_TYPE_MAP.put("000001ba", "mpg");
    }
    /**
    * @Description 检测文件真实的类型
    * @Author  YML
    * @Date   2020/2/8 21:15
    */
    public static CheckFileTypeResult getFileType(MultipartFile mu)throws IOException{
        CheckFileTypeResult re=new CheckFileTypeResult();
        try{
            byte[] bs=mu.getBytes();
            if(bs.length<=0||bs==null){
                re.setWhy("文件为空");
                return re;
            }
            StringBuilder sb=new StringBuilder();
            String temp="";
            //将文件头转化为StringBuilder
            for(int i=0;i<4;i++){
                // 以十六进制(基数 16)无符号整数形式返回一个整数参数的字符串表示形式
                temp=Integer.toHexString(bs[i] & 0xFF);
                if (temp.length() < 2) {
                    sb.append(0);
                }
                sb.append(temp);
            }
            //匹对类型
            Iterator<String> iterator=FILE_TYPE_MAP.keySet().iterator();
            while(iterator.hasNext()){
                String key = iterator.next();
                if(key.equals(sb.toString())){
                    re.setStatus(true);
                    re.setType(FILE_TYPE_MAP.get(key));
                    break;
                }
            }
            if(re.getStatus()==false)
                re.setWhy("无法匹对合适的类型，请检测文件类型是否合适");
        }catch (IOException e){
            System.out.println("------IO错误------"+e);
        }
        return re;
    }
}

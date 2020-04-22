package cn.rk6216.client_upload8090.service.impl;

import cn.rk6216.client_upload8090.Utils.CheckImg;
import cn.rk6216.client_upload8090.service.IUploadIMG;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class UploadIMGServicerImpl implements IUploadIMG{
    //思路：把原来的头像删掉，心头像重命名id.jpg
    @Override
    public Boolean uploadImg(MultipartFile file,String userid) {
        CheckImg checkImg=new CheckImg();
        try{
            if(checkImg.checkImg(file).getStatus()){
                File old=new File("C:\\Users\\yml\\Desktop\\"+userid+".jpg");
                if (!old.exists()) { // 文件不存在
                    System.out.println("要删除的文件不存在！");
                }
                Boolean flag=old.delete();
                //头像必须存在，否则无法修改，也无法进如下面的接收文件代码
                if(flag){
                    file.transferTo(new File("C:\\Users\\yml\\Desktop\\"+userid+".jpg"));
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return true;
    }
}

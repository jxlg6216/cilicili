package cn.rk6216.client_upload8090.controller;

import cn.rk6216.client_upload8090.service.IUploadIMG;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@CrossOrigin
public class UploadImgController {

    @Autowired
    private IUploadIMG iUploadIMG;

    /**
    * @Description
    * @Author  YML
    * @Date   2020/3/29 14:35
    * @Param  传入两个参数，新头像文件和用户id，用户id用来命名图片
    * @Return
    * @Exception
    *
    */
    @RequestMapping("/headUpload")
    public String userHeadImgUpload(MultipartFile head,String userid)throws IOException {
        System.out.println("进入imgupload控制层");
        //上传成功返回success
        if(iUploadIMG.uploadImg(head,userid)){
            return "success";
        }
        return "error";
    }
}

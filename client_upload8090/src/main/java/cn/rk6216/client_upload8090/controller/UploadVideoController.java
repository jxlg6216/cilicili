package cn.rk6216.client_upload8090.controller;

import cn.rk6216.client_upload8090.entity.UploadResult;
import cn.rk6216.client_upload8090.entity.VideoInformation;
import cn.rk6216.client_upload8090.service.IUploadVideo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 *  @author: YML
 *  @Date: 2020/2/8 15:10
 *  @Description: 上传视频conroller
 */
@RestController
@CrossOrigin
public class UploadVideoController {

    @Autowired
    private IUploadVideo iUploadVideo;

    /**
    * @Description 实现视频上传
    * @Author  YML
    * @Date   2020/2/9 16:32
    * @Param  文件及参数
     * 注意这里的参数videofile的名称要和前端的一致，不然会出现空指针异常
    */
    @PostMapping("/uploadVideo")
    public String uploadVideo(MultipartFile videofile, VideoInformation info)throws IOException {
        UploadResult uploadResult = iUploadVideo.uploadVideoAndSaveInfo(videofile,info);
        System.out.println(info.getVideoType());
        if(uploadResult.getStatus()==false){
            return uploadResult.getWhy();
        }
        return uploadResult.getWhy();
    }
}

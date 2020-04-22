package cn.rk6216.client_upload8090.service;

import cn.rk6216.client_upload8090.entity.UploadResult;
import cn.rk6216.client_upload8090.entity.VideoInformation;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 *  @author: YML
 *  @Date: 2020/2/8 15:58
 *  @Description: 上传视频服务层接口
 */
public interface IUploadVideo extends IService<VideoInformation> {
    //实现上传和保存视频信息到数据库
    public UploadResult uploadVideoAndSaveInfo(MultipartFile uploadFile,VideoInformation info)throws IOException;
}

package cn.rk6216.client_upload8090.service;

import org.springframework.web.multipart.MultipartFile;

//上传图片服务接口
public interface IUploadIMG {
    Boolean uploadImg(MultipartFile file,String userid);
}

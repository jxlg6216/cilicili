package cn.rk6216.client_upload8090.entity;

import lombok.Data;
/**
 *  @author: YML
 *  @Date: 2020/2/8 16:45
 *  @Description: 上传结果
 */
@Data
public class UploadResult {
    //上传结果,true为上传成功
    private Boolean status;
    //如果上传失败，这个写失败原因
    private String why;
}

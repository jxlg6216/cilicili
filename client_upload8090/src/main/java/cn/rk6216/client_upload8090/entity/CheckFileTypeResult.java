package cn.rk6216.client_upload8090.entity;

import lombok.Data;

/**
 *  @author: YML
 *  @Date: 2020/2/8 21:09
 *  @Description: 检测上传文件的结果
 */
@Data
public class CheckFileTypeResult {
    //检测状态，默认为false(错误)
    private Boolean status=false;
    //如果类型正确，则设置为该类型
    private String type;
    //错误原因
    private String why;
}

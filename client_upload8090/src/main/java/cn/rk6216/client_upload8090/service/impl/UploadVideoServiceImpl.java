package cn.rk6216.client_upload8090.service.impl;

import cn.rk6216.client_upload8090.Utils.ChangeVideoType;
import cn.rk6216.client_upload8090.Utils.CheckFileType;
import cn.rk6216.client_upload8090.dao.UploadVideoMapper;
import cn.rk6216.client_upload8090.entity.CheckFileTypeResult;
import cn.rk6216.client_upload8090.entity.UploadResult;
import cn.rk6216.client_upload8090.entity.VideoInformation;
import cn.rk6216.client_upload8090.service.IUploadVideo;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.logging.SimpleFormatter;

/**
 *  @author: YML
 *  @Date: 2020/2/8 16:00
 *  @Description: 视频上传实现类
 */
@Service
public class UploadVideoServiceImpl extends ServiceImpl<UploadVideoMapper, VideoInformation> implements IUploadVideo {

    @Autowired
    private UploadVideoMapper uploadVideoMapper;

    @Override
    public UploadResult uploadVideoAndSaveInfo(MultipartFile uploadFile,VideoInformation info)throws IOException {
        UploadResult result=new UploadResult();
        //文件大于1G驳回
        if(uploadFile.getSize()>1024*1024*1024){
            result.setStatus(false);
            result.setWhy("上传的文件过大，建议在1G之内");
            return result;
        }
        if(uploadFile.isEmpty()){
            result.setStatus(false);
            result.setWhy("文件为空");
            return result;
        }
        CheckFileType check=new CheckFileType();
        CheckFileTypeResult cfr=check.getFileType(uploadFile);
        //文件类型错误，上传的为非视频类型文件
        if(cfr.getStatus()==false){
            result.setStatus(false);
            result.setWhy(cfr.getWhy());
            return result;
        }
        //构建上传的视频的真实路径
        String id=UUID.randomUUID().toString();
        File newFile = new File("E:\\NewIDEAwork\\cilicili\\Video\\"+id+".mp4");
        //将上传的视频类型文件转化为mp4格式,如果已经是mp4，则直接保存到服务器
        if(cfr.getType().equals("mp4")){
            //保存文件
            uploadFile.transferTo(newFile);
        }else{
            ChangeVideoType change=new ChangeVideoType();
            String temppath="E:\\NewIDEAwork\\cilicili\\Video\\"+id+"."+cfr.getType();
            File temp=new File(temppath);
            uploadFile.transferTo(temp);
            //rmvb需要先转avi再到mp4
            if(cfr.getType().equals("rmvb")){
                //未完
//                change.processAVItoMp4();
                result.setStatus(false);
                result.setWhy("暂不支持rmvb类格式，建议使用avi或mp4格式");
            }else{
                change.process(temp,newFile);
            }
        }

        //获取上传时间并固定格式为yyyy.MM.dd
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy.MM.dd");
        String time=sdf.format(new Date());
        //设置视频的上传时间、视频id和审核状态(未审核)
        info.setVideoTime(time);
        info.setVideoId(id);
        info.setVideoStatus("0");
        info.setVideoCollectionCount(0);
        info.setVidoePraiseCount(0);
        //保存视频信息
        uploadVideoMapper.insert(info);
        //上传成功设置上传结果对象
        result.setStatus(true);
        result.setWhy("success");
        return result;
    }
}

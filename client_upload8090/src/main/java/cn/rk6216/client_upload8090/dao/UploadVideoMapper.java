package cn.rk6216.client_upload8090.dao;

import cn.rk6216.client_upload8090.entity.VideoInformation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 *  @author: YML
 *  @Date: 2020/2/8 15:53
 *  @Description: dao接口，视频上传后将视频信息保存到数据库以便后续使用
 */
@Mapper
public interface UploadVideoMapper extends BaseMapper<VideoInformation> {
    //保存视频信息
    void saveVideoInformation(@Param("info") VideoInformation v);
}

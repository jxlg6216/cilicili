package cn.rk6216.client_videoplay8088.dao;

import cn.rk6216.client_videoplay8088.entity.VideoInformation;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IndexMapper {
    //查询视频列表(无分类综合排序)
    List<VideoInformation> findByZonghe();
    //查询视频列表(无分类点赞排序)
    List<VideoInformation> findByPraise();
    //查询视频列表(无分类收藏排序)
    List<VideoInformation> findByCollect();

    //查询视频列表(有分类综合排序)
    List<VideoInformation> findClassByZonghe(@Param("ty")String string);
    //查询视频列表(有分类点赞排序)
    List<VideoInformation> findClassByPraise(@Param("ty")String string);
    //查询视频列表(有分类收藏排序)
    List<VideoInformation> findClassByCollect(@Param("ty")String string);
}

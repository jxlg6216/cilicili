package cn.rk6216.client_videoplay8088.service;

import cn.rk6216.client_videoplay8088.entity.VideoInformation;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 *  @author: YML
 *  @Date: 2019/12/24 9:51
 *  @Description:
 */
public interface IIndexService {
    /**
    * @Description 根据参数查询视频列表(综合排序)，当参数值为n时为不分类综合排序
    * @Author  YML
    * @Date   2019/12/24 9:55
    * @Param  分类参数标识
    * @Return  视频实体列表
    */
    PageInfo<VideoInformation> findVideoByZonghe(String string,int pageNo,int pageSize);

    /**
    * @Description 根据参数查询视频列表(按点赞数排序)，当参数值为n时为不分类点赞排序
    * @Author  YML
    * @Date   2019/12/24 9:58
    * @Param  分类参数标识
    * @Return 视频实体列表
    */
    PageInfo<VideoInformation> findVideoByMorePraise(String string,int pageNo,int pageSize);

    /**
     * @Description 根据参数查询视频列表(按收藏数排序)，当参数值为n时为不分类收藏排序
     * @Author  YML
     * @Date   2019/12/24 10:00
     * @Param  分类参数标识
     * @Return 视频实体列表
     */
    PageInfo<VideoInformation> findVideoByMoreCollect(String string,int pageNo,int pageSize);
}

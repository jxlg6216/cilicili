package cn.rk6216.client_videoplay8088.service.Impl;

import cn.rk6216.client_videoplay8088.dao.IndexMapper;
import cn.rk6216.client_videoplay8088.entity.VideoInformation;
import cn.rk6216.client_videoplay8088.service.IIndexService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *  @author: YML
 *  @Date: 2019/12/24 16:11
 *  @Description: 实现类
 */
@Service
public class IndexServiceImpl implements IIndexService {

    @Resource
    private IndexMapper indexMapper;

    /**
    * @Description 综合排序
    * @Author  YML
    * @Date   2019/12/24 16:13
    * @Param  分类参数，如果是n则不分类
    * @Return 视频列表
    */
    @Override
    public PageInfo<VideoInformation> findVideoByZonghe(String string,int pageNo,int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<VideoInformation> list=null;
        if(string.equals("n")){
            list= indexMapper.findByZonghe();
        }else{
            list=indexMapper.findClassByZonghe(string);
        }
        PageInfo<VideoInformation> result=new PageInfo<VideoInformation>(list);
        return result;
    }

    /**
    * @Description 更多点赞排序
    * @Author  YML
    * @Date   2019/12/24 16:13
    * @Param  分类参数，如果是n则不分类
    * @Return 视频列表
    */
    @Override
    public PageInfo<VideoInformation> findVideoByMorePraise(String string,int pageNo,int pageSize) {
        //初始化分类
        PageHelper.startPage(pageNo,pageSize);
        List<VideoInformation> list=null;
        if(string.equals("n")){
            list=indexMapper.findByPraise();
        }else{
            list=indexMapper.findClassByPraise(string);
        }
        //通过返回结果实现分类
        PageInfo<VideoInformation> result=new PageInfo<VideoInformation>(list);
        return result;
    }

    /**
    * @Description 更多收藏排序
    * @Author  YML
    * @Date   2019/12/24 16:14
    * @Param  分类参数，如果是n则不分类
    * @Return  视频列表
    */
    @Override
    public PageInfo<VideoInformation> findVideoByMoreCollect(String string,int pageNo,int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<VideoInformation> list=null;
        if(string.equals("n")){
            list=indexMapper.findByCollect();
        }else{
            list=indexMapper.findClassByCollect(string);
        }
        PageInfo<VideoInformation> result=new PageInfo<VideoInformation>(list);
        return result;
    }
}

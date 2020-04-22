package cn.rk6216.client_videoplay8088.controller;

import cn.rk6216.client_videoplay8088.entity.VideoInformation;
import cn.rk6216.client_videoplay8088.service.IIndexService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *  @author: YML
 *  @Date: 2019/12/24 18:09
 *  @Description: 处理feign中的IndexService接口请求
 */
@RestController
@CrossOrigin//设置允许跨域访问
public class IndexController {

    @Autowired
    private IIndexService iIndexService;

    @RequestMapping("/main")//访问首页显示最近最热视频列表(分页查询)
    public PageInfo<VideoInformation> findAllVideo(@RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
                                                   @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize){
        PageInfo<VideoInformation> pageInfo=null;
        pageInfo=iIndexService.findVideoByZonghe("n",pageNo,pageSize);
        return pageInfo;
    }

    @RequestMapping("/mainP")//访问首页并点击点赞最多返回点赞最多列表(分页查询)
    public PageInfo<VideoInformation> findAllVideoP(@RequestParam(name="pageNo",defaultValue = "1") Integer pageNo,
                                                    @RequestParam(name="pageSize",defaultValue = "10") Integer pageSize){
        PageInfo<VideoInformation> pageInfo=null;
        pageInfo=iIndexService.findVideoByMorePraise("n",pageNo,pageSize);
        return pageInfo;
    }

    @RequestMapping("/mainC")//访问首页并点击收藏最多返回收藏最多列表(分页查询)
    public PageInfo<VideoInformation> findAllVideoC(@RequestParam(name="pageNo",defaultValue = "1")Integer pageNo,
                                                    @RequestParam(name="pageSize",defaultValue = "10")Integer pageSize){
        PageInfo<VideoInformation> pageInfo=null;
        pageInfo=iIndexService.findVideoByMoreCollect("n",pageNo,pageSize);
        return pageInfo;
    }

    @RequestMapping("/class")//点击分类进入到某个类的视频列表
    public PageInfo<VideoInformation> findClassVideo(@RequestParam(name="type") String string,
                                                     @RequestParam(name="pageNo",defaultValue = "1")Integer pageNo,
                                                     @RequestParam(name="pageSize",defaultValue = "10")Integer pageSize){
        PageInfo<VideoInformation> pageInfo=null;
        pageInfo=iIndexService.findVideoByZonghe(string,pageNo,pageSize);
        return pageInfo;
    }

    @RequestMapping("/classP")//点击按照点赞数返回类视频列表
    public PageInfo<VideoInformation> findClassPVideo(@RequestParam(name="type") String string,
                                                      @RequestParam(name="pageNo",defaultValue = "1")Integer pageNo,
                                                      @RequestParam(name="pageSize",defaultValue = "10")Integer pageSize){
        PageInfo<VideoInformation> pageInfo=null;
        pageInfo=iIndexService.findVideoByMorePraise(string,pageNo,pageSize);
        return pageInfo;
    }

    @RequestMapping("/classC")//点击按照收藏返回类视频列表
    public PageInfo<VideoInformation> findClassCVideo(@RequestParam(name="type") String string,
                                                      @RequestParam(name="pageNo",defaultValue = "1")Integer pageNo,
                                                      @RequestParam(name="pageSize",defaultValue = "10")Integer pageSize){
        PageInfo<VideoInformation> pageInfo=null;
        pageInfo=iIndexService.findVideoByMoreCollect(string,pageNo,pageSize);
        return pageInfo;
    }
}

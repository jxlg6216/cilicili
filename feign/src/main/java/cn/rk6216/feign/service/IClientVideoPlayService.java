package cn.rk6216.feign.service;

import cn.rk6216.feign.entity.VideoInformation;
import com.github.pagehelper.PageInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("client-videoplay")
public interface IClientVideoPlayService {

    String config = "/video";

    @RequestMapping(config + "/main")//访问首页显示最近最热视频列表(分页查询)
    public PageInfo<VideoInformation> findAllVideo(@RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
                                                   @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize);

    @RequestMapping(config + "/mainP")//访问首页并点击点赞最多返回点赞最多列表(分页查询)
    public PageInfo<VideoInformation> findAllVideoP(@RequestParam(name="pageNo",defaultValue = "1") Integer pageNo,
                                                    @RequestParam(name="pageSize",defaultValue = "10") Integer pageSize);

    @RequestMapping(config + "/mainC")//访问首页并点击收藏最多返回收藏最多列表(分页查询)
    public PageInfo<VideoInformation> findAllVideoC(@RequestParam(name="pageNo",defaultValue = "1")Integer pageNo,
                                                    @RequestParam(name="pageSize",defaultValue = "10")Integer pageSize);

    @RequestMapping(config + "/class")//点击分类进入到某个类的视频列表
    public PageInfo<VideoInformation> findClassVideo(@RequestParam(name="type") String string,
                                                     @RequestParam(name="pageNo",defaultValue = "1")Integer pageNo,
                                                     @RequestParam(name="pageSize",defaultValue = "10")Integer pageSize);

    @RequestMapping(config + "/classP")//点击按照点赞数返回类视频列表
    public PageInfo<VideoInformation> findClassPVideo(@RequestParam(name="type") String string,
                                                      @RequestParam(name="pageNo",defaultValue = "1")Integer pageNo,
                                                      @RequestParam(name="pageSize",defaultValue = "10")Integer pageSize);

    @RequestMapping(config + "/classC")//点击按照收藏返回类视频列表
    public PageInfo<VideoInformation> findClassCVideo(@RequestParam(name="type") String string,
                                                      @RequestParam(name="pageNo",defaultValue = "1")Integer pageNo,
                                                      @RequestParam(name="pageSize",defaultValue = "10")Integer pageSize);
}

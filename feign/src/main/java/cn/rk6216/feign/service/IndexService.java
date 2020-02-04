package cn.rk6216.feign.service;

import cn.rk6216.feign.entity.VideoInformation;
import com.github.pagehelper.PageInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "CLIENT-VIDEOPLAY")
@RequestMapping("/video")
public interface IndexService {

    @RequestMapping("/main")//访问首页显示最近最热视频列表(分页查询)
    PageInfo<VideoInformation> findAllVideo(@RequestParam("pageNo")int pageNo, @RequestParam("pageSize")int pageSize);

    @RequestMapping("/mainP")//访问首页并点击点赞最多返回点赞最多列表
    PageInfo<VideoInformation> findAllVideoP(@RequestParam("pageNo")int pageNo, @RequestParam("pageSize")int pageSize);

    @RequestMapping("/mainC")//访问首页并点击收藏最多返回收藏最多列表
    PageInfo<VideoInformation> findAllVideoC(@RequestParam("pageNo")int pageNo, @RequestParam("pageSize")int pageSize);

    @RequestMapping("/class")//点击分类进入到某个类的视频列表
    PageInfo<VideoInformation> findClassVideo(@RequestParam("type") String type,@RequestParam("pageNo")int pageNo, @RequestParam("pageSize")int pageSize);

    @RequestMapping("/classP/{type}")//点击按照点赞数返回类视频列表
    PageInfo<VideoInformation> findClassPVideo(@RequestParam("type") String type,@RequestParam("pageNo")int pageNo, @RequestParam("pageSize")int pageSize);

    @RequestMapping("/classC/{type}")//点击按照收藏返回类视频列表
    PageInfo<VideoInformation> findClassCVideo(@RequestParam("type") String type,@RequestParam("pageNo")int pageNo, @RequestParam("pageSize")int pageSize);
}

package cn.rk6216.feign.controller;

import cn.rk6216.feign.entity.VideoInformation;
import cn.rk6216.feign.service.IndexService;
import com.github.pagehelper.PageInfo;
import feign.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
@CrossOrigin
public class IndexController {
    @Resource
    private IndexService indexService;

    @RequestMapping("/a")
    public String toPageTest(){return "index";}

    @RequestMapping("/main")//登录首页查找最热视频列表
    public PageInfo<VideoInformation> findMain(HttpSession session,
                           @RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
                           @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize){
        PageInfo<VideoInformation> result=indexService.findAllVideo(pageNo,pageSize);
//        session.setAttribute("indexVideo",result);
        return result;
    }

    @RequestMapping("/mainP")//登录首页查找点赞最多列表
    public PageInfo<VideoInformation> findMainP(HttpSession session,
                            @RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
                            @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize){
        PageInfo<VideoInformation> result=indexService.findAllVideoP(pageNo,pageSize);
//        session.setAttribute("ivideoP",result);
        return result;
    }

    @RequestMapping("/mainC")//登录首页查找点赞最多列表
    public PageInfo<VideoInformation> findMainC(HttpSession session,
                            @RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
                            @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize){
        PageInfo<VideoInformation> result=indexService.findAllVideoC(pageNo,pageSize);
//        session.setAttribute("ivideoC",result);
        return result;
    }

    @RequestMapping("/class")//点击某类返回该类综合排序,参数class对应某个类
    public PageInfo<VideoInformation> findClass(@RequestParam("class") String string,HttpSession session,
                            @RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
                            @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize){
        PageInfo<VideoInformation> result=indexService.findClassVideo(string,pageNo,pageSize);
//        session.setAttribute("classVideo",result);
        return result;
    }

    @RequestMapping("/classP")//点击点赞排序返回类的点赞列表,参数class对应某个类
    public PageInfo<VideoInformation> findClassP(@RequestParam("class") String string,HttpSession session,
                             @RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
                             @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize){
        PageInfo<VideoInformation> result=indexService.findClassPVideo(string,pageNo,pageSize);
//        session.setAttribute("classVideoP",result);
        return result;
    }

    @RequestMapping("/classC")//点击点赞排序返回类的点赞列表,参数class对应某个类
    public PageInfo<VideoInformation> findClassC(@RequestParam("class") String string,HttpSession session,
                             @RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
                             @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize){
        PageInfo<VideoInformation> result=indexService.findClassCVideo(string,pageNo,pageSize);
//        session.setAttribute("classVideoC",result);
        return result;
    }
}

package cn.rk6216.feign.controller;

import cn.rk6216.feign.entity.VideoInformation;
import cn.rk6216.feign.service.IndexService;
import com.github.pagehelper.PageInfo;
import feign.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@CrossOrigin
public class IndexController {
    @Resource
    private IndexService indexService;

    @RequestMapping("/a")
    public String toPageTest(){return "index";}

    @ResponseBody
    @RequestMapping("/main")//登录首页查找最热视频列表
    public PageInfo<VideoInformation> findMain(HttpSession session,
                           @RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
                           @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize){
        PageInfo<VideoInformation> result=indexService.findAllVideo(pageNo,pageSize);
        session.setAttribute("indexVideo",result);
//        return "某个thymeleaf页面:主页";
//        return "index";
        return result;
    }

    @RequestMapping("/mainP")//登录首页查找点赞最多列表
    public String findMainP(HttpSession session,
                            @RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
                            @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize){
        PageInfo<VideoInformation> result=indexService.findAllVideoP(pageNo,pageSize);
        session.setAttribute("ivideoP",result);
        return "index";
    }

    @RequestMapping("/mainC")//登录首页查找点赞最多列表
    public String findMainC(HttpSession session,
                            @RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
                            @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize){
        PageInfo<VideoInformation> result=indexService.findAllVideoC(pageNo,pageSize);
        session.setAttribute("ivideoC",result);
        return "index";
    }

    @ResponseBody
    @RequestMapping("/class")//点击某类返回该类综合排序,参数class对应某个类
    public String findClass(@RequestParam("class") String string,HttpSession session,
                            @RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
                            @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize){
        PageInfo<VideoInformation> result=indexService.findClassVideo(string,pageNo,pageSize);
        session.setAttribute("classVideo",result);
        return "页面：类视频页面";
    }

    @RequestMapping("/classP/{class}")//点击点赞排序返回类的点赞列表,参数class对应某个类
    public String findClassP(@Param("class") String string,HttpSession session,
                             @RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
                             @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize){
        PageInfo<VideoInformation> result=indexService.findClassPVideo(string,pageNo,pageSize);
        session.setAttribute("classVideoP",result);
        return "页面：类视频页面";
    }

    @RequestMapping("/classC/{class}")//点击点赞排序返回类的点赞列表,参数class对应某个类
    public String findClassC(@Param("class") String string,HttpSession session,
                             @RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo,
                             @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize){
        PageInfo<VideoInformation> result=indexService.findClassCVideo(string,pageNo,pageSize);
        session.setAttribute("classVideoC",result);
        return "页面：类视频页面";
    }
}

package cn.rk6216.client_download8092.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 *  @author: YML
 *  @Date: 2020/2/21 22:48
 *  @Description: 视频下载controller
 */
@RestController
@CrossOrigin
public class DownloadVideoController {

    /**
    * @Description 根据视频id找到视频并将文件重命名为视频标题.mp4，返回给前端
    * @Author  YML
    * @Date   2020/2/22 16:44
    */
    @RequestMapping("/downloadVideo")
    public String downloadVideo(@RequestParam("videoId")String videoId,
                                HttpServletRequest httpServletRequest,
                                HttpServletResponse httpServletResponse){
        System.out.println("------------------------>>>>>>>>>>>>>>>>>>");
        //如果传来的参数为空则报错
        if(videoId==null){
            return "参数错误";
        }
        //将目标视频文件放入File对象中
        String fileName=videoId+".mp4";
        String realPath="E:\\NewIDEAwork\\cilicili\\Video\\";
        File file=new File(realPath,fileName);
        if(file.exists()){
            //设置响应信息
            //httpServletResponse.setContentType("application/force-download");//设置强制下载不打开
            //httpServletResponse.setContentType("application/octet-stream");
            httpServletResponse.setContentType("video/mpeg4");
            httpServletResponse.setHeader("Content-Disposition","attachment;fileName="+fileName);
            byte[] buffer=new byte[1024];
            //初始化流
            FileInputStream fis=null;
            BufferedInputStream bis=null;
            try{
                //操作流，来自网上大佬的
                fis=new FileInputStream(file);
                bis=new BufferedInputStream(fis);
                OutputStream os=httpServletResponse.getOutputStream();
                int i=bis.read(buffer);
                while(i!=-1){
                    os.write(buffer,0,i);
                    i=bis.read(buffer);
                }
                System.out.println("success");
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                if(bis!=null){
                    try{
                        bis.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
                if(fis!=null){
                    try{
                        fis.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }
        }
        System.out.println(fileName);
        return fileName;
    }

    @RequestMapping("/downloadTest")
    public void test(HttpServletResponse response){
        String realpath="E:\\NewIDEAwork\\cilicili\\Video\\";
        String fileName="123.jpg";
        File file=new File(realpath,fileName);
        if(file.exists()){
            response.setContentType("application/octet-stream");
            response.setHeader("Content-Disposition","attachment;fileName="+fileName);
            byte[] buffer=new byte[1024];
            //初始化流
            FileInputStream fis=null;
            BufferedInputStream bis=null;
            try{
                //操作流，来自网上大佬的
                fis=new FileInputStream(file);
                bis=new BufferedInputStream(fis);
                OutputStream os=response.getOutputStream();
                int i=bis.read(buffer);
                while(i!=-1){
                    os.write(buffer,0,i);
                    i=bis.read(buffer);
                }
                System.out.println("success");
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                if (bis != null) {
                    try {
                        bis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

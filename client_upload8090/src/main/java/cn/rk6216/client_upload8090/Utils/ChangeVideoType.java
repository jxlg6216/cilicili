package cn.rk6216.client_upload8090.Utils;

import it.sauronsoftware.jave.*;

import java.io.File;

/**
 *  @author: YML
 *  @Date: 2020/2/8 21:53
 *  @Description: 视频转码，用来将视频转化为mp4格式
 */
public class ChangeVideoType {
    private static final String FORMAT = "mp4";
    //private static final String VIDEO_CODE = "libx264";//视频编码格式msmpeg4v2
    private static final String VIDEO_CODE = "mpeg4";
    private static final String AUDIO_CODE = "libmp3lame";//音频编码格式

    /**
    * @Description 将avi,wmv,flv转mp4
    * @Author  YML
    * @Date   2020/2/11 22:39
    * @Param 旧文件sourcFile，新文件targetFile
    * @Return
    * @Exception
    *
    */
    public String process(File sourceFile, File targetFile) {

        VideoAttributes videoAttributes = new VideoAttributes();
        videoAttributes.setCodec(VIDEO_CODE);//编解码器
        videoAttributes.setBitRate(360000);//设置比特率值
        videoAttributes.setFrameRate(60);//设置帧率

        AudioAttributes audio = new AudioAttributes();
        audio.setCodec(AUDIO_CODE);
        audio.setBitRate(64000);
        audio.setChannels(1);
        audio.setSamplingRate(22050);

        EncodingAttributes attrs1 = new EncodingAttributes();
        attrs1.setVideoAttributes(videoAttributes);
        attrs1.setAudioAttributes(audio);
        attrs1.setFormat(FORMAT);
        Encoder encoder = new Encoder();

        try {
            String path = targetFile.getPath();
            //targetFile = new File(path + File.separator + sourceFile.getName());
            //参数分别是需转码的源文件，转换后的文件，一个包含编码所需数据的参数
            encoder.encode(sourceFile, targetFile, attrs1);

            if (targetFile.exists()) {
                return targetFile.getAbsolutePath();
            }
        } catch (EncoderException e) {
            e.printStackTrace();
        }
        return "";
    }
    /**
    * @Description 将rmvb转avi，再到mp4，未写完，不会了
    * @Author  YML
    * @Date   2020/2/14 20:49
    * @Param
    * @Return
    * @Exception
    *
    */
    public String processAVItoMp4(File sourcefile,File targetfile){
        //未完，
        process(sourcefile,targetfile);
        return "";
    }
}

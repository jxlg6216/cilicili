package cn.rk6216.eureka_client_comment8086.dao;

import cn.rk6216.eureka_client_comment8086.pojo.VideoComment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 *  视频评论 dao 层接口
 *  @author: Lizq
 *  @Date: 2019/12/23 10:07
 */
public interface VideoCommentMapper extends BaseMapper<VideoComment> {

    /**
     *  同步点赞数的 SQL 接口
     * @param
     * @return
    */
    @Update("update video_comment set comment_praise_count = #{commentPraiseCount} where comment_id = #{commentId}")
    int updateVideoCommentPraise(@Param("commentId")String commentId,@Param("commentPraiseCount") int videoPraiseCount);

}
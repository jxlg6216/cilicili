package cn.rk6216.entityandtools.mapper;

import cn.rk6216.entityandtools.entitys.Comment;
import cn.rk6216.entityandtools.entitys.CommentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    int countByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    int deleteByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    int insert(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    int insertSelective(Comment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    List<Comment> selectByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated Sun Dec 22 17:05:56 CST 2019
     */
    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);
}
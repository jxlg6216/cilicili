package cn.rk6216.eureka_client_user_update8102.dao;

import cn.rk6216.eureka_client_user_update8102.pojo.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserInfoMapper extends BaseMapper<UserInfo> {

    @Update("update user_info set user_check = #{check} where user_id = #{userId}")
    int updateCheck(@Param("check") String checked, @Param("userId") String userId);

    @Update("update user_info set user_check = #{check} where user_email = #{userEmail}")
    int updateCheckByEmail(@Param("check") String checked, @Param("userEmail") String userEmail);

    @Select("select user_check from user_info where user_id = #{userId}")
    String getCheck(@Param("userId")String userId);

    @Select("select user_check from user_info where user_email = #{userEmail}")
    String getCheckByEmail(@Param("userEmail")String userEmail);

    @Update("update user_info set user_password = #{userPassword} where user_id = #{userId}")
    int updatePassword(@Param("userId") String userId, @Param("userPassword") String userPassword);

    @Update("update user_info set user_password = #{userPassword} where user_Email = #{userEmail}")
    int updatePasswordByEmail(@Param("userEmail") String userEmail, @Param("userPassword") String userPassword);
}
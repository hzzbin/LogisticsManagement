package com.fan.mapper;

import com.fan.model.AdminAccount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface AdminAccountMapper {
    @Select("select id, account, password, admin_id, create_time, update_time from admin_account")
//    @Results(value = {
//            @Result(column = "id", property = "id"),
//            @Result(column = "account", property = "account"),
//            @Result(column = "password", property = "password"),
//            @Result(column = "admin_id", property = "adminId"),
//            @Result(column = "create_time", property = "createTime"),
//            @Result(column = "update_time", property = "updateTime")
//    })
    List<AdminAccount> getAdminAccountList();
}

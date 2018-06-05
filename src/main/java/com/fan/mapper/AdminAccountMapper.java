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
    List<AdminAccount> getAdminAccountList();
}

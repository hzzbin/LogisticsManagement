package com.fan.controller;


import com.fan.mapper.AdminAccountMapper;
import com.fan.model.AdminAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminAccountMapper adminAccountMapper;

    @RequestMapping("/list")
    @ResponseBody
    public List<AdminAccount> getAdmins() {
        List<AdminAccount> list =  adminAccountMapper.getAdminAccountList();

        for (AdminAccount account : list) {
            System.out.println("adminId : " + account.getAdminId());
            System.out.println("createTime : " + account.getCreateTime());
            System.out.println("updateTime : " + account.getUpdateTime());
        }
        return list;
    }
}

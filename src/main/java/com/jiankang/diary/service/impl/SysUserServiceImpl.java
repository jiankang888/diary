package com.jiankang.diary.service.impl;

import com.jiankang.diary.mapper.SysUserMapper;
import com.jiankang.diary.model.SysUser;
import com.jiankang.diary.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public void save(SysUser sysUser) {
        sysUserMapper.insert(sysUser);
    }
}

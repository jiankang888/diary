package com.jiankang.diary.service;

import com.jiankang.diary.model.SysUser;

import java.util.List;

public interface SysUserService {

    void save(SysUser sysUser);

    List<SysUser> selectAll();
}

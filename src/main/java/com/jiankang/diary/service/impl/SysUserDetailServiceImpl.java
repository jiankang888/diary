package com.jiankang.diary.service.impl;

import com.jiankang.diary.mapper.SysUserDetailMapper;
import com.jiankang.diary.model.SysUserDetail;
import com.jiankang.diary.service.SysUserDetailService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Service("sysUserDetailService")
public class SysUserDetailServiceImpl implements SysUserDetailService {

    @Resource
    private SysUserDetailMapper sysUserDetailMapper;

    @Override
    public void save(SysUserDetail sysUserDetail) {
        sysUserDetailMapper.insert(sysUserDetail);
    }
}

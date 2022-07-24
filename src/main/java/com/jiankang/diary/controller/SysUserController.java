package com.jiankang.diary.controller;
import java.util.Date;
import java.util.UUID;

import com.jiankang.diary.core.CommonCodeEnum;
import com.jiankang.diary.core.JsonResult;
import com.jiankang.diary.model.SysUser;
import com.jiankang.diary.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class SysUserController {

    Logger logger = LoggerFactory.getLogger(SysUserController.class);

    @Autowired
    private SysUserService sysUserService;

    @PostMapping("/save")
    public JsonResult save(@RequestBody @Valid SysUser sysUser, BindingResult errors) {
        JsonResult jsonResult = new JsonResult();

        if (errors.hasErrors()) {
            ObjectError error = errors.getAllErrors().get(0);
            logger.debug(error.getCode());
            jsonResult.setStatus(CommonCodeEnum.PARAM_ERROR.getCode());
            jsonResult.setMsg(error.getDefaultMessage());
            return jsonResult;
        }

        sysUser.setUserUuid(UUID.randomUUID().toString().replaceAll("-",""));
        sysUser.setRecordState("0");
        sysUser.setRecordLastOperation("A");
        sysUser.setRecordUpdateUserUuid("1");
        sysUser.setRecordUpdateTime(new Date());
        sysUser.setRecordCreateTime(new Date());
        sysUser.setRecordCreateUserUuid("1");
        sysUserService.save(sysUser);
        return jsonResult.success(null);
    }

}

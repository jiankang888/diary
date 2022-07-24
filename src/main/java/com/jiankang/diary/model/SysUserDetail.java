package com.jiankang.diary.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_user_detail")
public class SysUserDetail {
    /**
     * 用于标识不同记录
     */
    @Id
    @Column(name = "record_id")
    private Long recordId;

    /**
     * 主键（用户id）
     */
    @Id
    @Column(name = "sys_user_detail_uuid")
    private Long sysUserDetailUuid;

    /**
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 真实姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 性别（0：女，1：男，2：保密）
     */
    private Byte gender;

    /**
     * 头像
     */
    private String portrait;

    /**
     * 地区ID
     */
    @Column(name = "area_id")
    private Long areaId;

    /**
     * 0：无效
            1：有效
     */
    @Column(name = "record_state")
    private String recordState;

    /**
     * a：增加
            m：修改
            d：删除
     */
    @Column(name = "record_last_operation")
    private String recordLastOperation;

    @Column(name = "record_update_user_uuid")
    private String recordUpdateUserUuid;

    @Column(name = "record_update_time")
    private Date recordUpdateTime;

    @Column(name = "record_create_time")
    private Date recordCreateTime;

    @Column(name = "record_create_user_uuid")
    private String recordCreateUserUuid;

    /**
     * 获取用于标识不同记录
     *
     * @return record_id - 用于标识不同记录
     */
    public Long getRecordId() {
        return recordId;
    }

    /**
     * 设置用于标识不同记录
     *
     * @param recordId 用于标识不同记录
     */
    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    /**
     * 获取主键（用户id）
     *
     * @return sys_user_detail_uuid - 主键（用户id）
     */
    public Long getSysUserDetailUuid() {
        return sysUserDetailUuid;
    }

    /**
     * 设置主键（用户id）
     *
     * @param sysUserDetailUuid 主键（用户id）
     */
    public void setSysUserDetailUuid(Long sysUserDetailUuid) {
        this.sysUserDetailUuid = sysUserDetailUuid;
    }

    /**
     * 获取昵称
     *
     * @return nick_name - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取真实姓名
     *
     * @return real_name - 真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置真实姓名
     *
     * @param realName 真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取性别（0：女，1：男，2：保密）
     *
     * @return gender - 性别（0：女，1：男，2：保密）
     */
    public Byte getGender() {
        return gender;
    }

    /**
     * 设置性别（0：女，1：男，2：保密）
     *
     * @param gender 性别（0：女，1：男，2：保密）
     */
    public void setGender(Byte gender) {
        this.gender = gender;
    }

    /**
     * 获取头像
     *
     * @return portrait - 头像
     */
    public String getPortrait() {
        return portrait;
    }

    /**
     * 设置头像
     *
     * @param portrait 头像
     */
    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    /**
     * 获取地区ID
     *
     * @return area_id - 地区ID
     */
    public Long getAreaId() {
        return areaId;
    }

    /**
     * 设置地区ID
     *
     * @param areaId 地区ID
     */
    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    /**
     * 获取0：无效
            1：有效
     *
     * @return record_state - 0：无效
            1：有效
     */
    public String getRecordState() {
        return recordState;
    }

    /**
     * 设置0：无效
            1：有效
     *
     * @param recordState 0：无效
            1：有效
     */
    public void setRecordState(String recordState) {
        this.recordState = recordState;
    }

    /**
     * 获取a：增加
            m：修改
            d：删除
     *
     * @return record_last_operation - a：增加
            m：修改
            d：删除
     */
    public String getRecordLastOperation() {
        return recordLastOperation;
    }

    /**
     * 设置a：增加
            m：修改
            d：删除
     *
     * @param recordLastOperation a：增加
            m：修改
            d：删除
     */
    public void setRecordLastOperation(String recordLastOperation) {
        this.recordLastOperation = recordLastOperation;
    }

    /**
     * @return record_update_user_uuid
     */
    public String getRecordUpdateUserUuid() {
        return recordUpdateUserUuid;
    }

    /**
     * @param recordUpdateUserUuid
     */
    public void setRecordUpdateUserUuid(String recordUpdateUserUuid) {
        this.recordUpdateUserUuid = recordUpdateUserUuid;
    }

    /**
     * @return record_update_time
     */
    public Date getRecordUpdateTime() {
        return recordUpdateTime;
    }

    /**
     * @param recordUpdateTime
     */
    public void setRecordUpdateTime(Date recordUpdateTime) {
        this.recordUpdateTime = recordUpdateTime;
    }

    /**
     * @return record_create_time
     */
    public Date getRecordCreateTime() {
        return recordCreateTime;
    }

    /**
     * @param recordCreateTime
     */
    public void setRecordCreateTime(Date recordCreateTime) {
        this.recordCreateTime = recordCreateTime;
    }

    /**
     * @return record_create_user_uuid
     */
    public String getRecordCreateUserUuid() {
        return recordCreateUserUuid;
    }

    /**
     * @param recordCreateUserUuid
     */
    public void setRecordCreateUserUuid(String recordCreateUserUuid) {
        this.recordCreateUserUuid = recordCreateUserUuid;
    }
}
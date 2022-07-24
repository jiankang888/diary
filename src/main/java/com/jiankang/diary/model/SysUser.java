package com.jiankang.diary.model;

import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Table(name = "sys_user")
public class SysUser {
    /**
     * 用于标识不同记录
     */
    @Id
    @Column(name = "record_id")
    private Long recordId;

    /**
     * 主键
     */
    @Id
    @Column(name = "user_uuid")
    private String userUuid;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    @NotBlank(message = "用户姓名不能为空！")
    @Size(min = 3, max = 10, message = "用户姓名长度过少或过长！")
    private String userName;

    /**
     * 密码
     */
    @NotBlank
    private String password;

    /**
     * 状态（0：正常，1：冻结）
     */
    private Byte status;

    /**
     * 手机号码
     */
    @Column(name = "phone_num")
    @NotBlank
    private String phoneNum;

    /**
     * 邮箱
     */
    @NotBlank
    private String email;

    /**
     * 第三方归属（0：非第三方，1：微信，2：支付宝）
     */
    @Column(name = "third_party_own")
    private Byte thirdPartyOwn;

    /**
     * 第三方ID
     */
    @Column(name = "third_party_id")
    private String thirdPartyId;

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
     * 获取主键
     *
     * @return user_uuid - 主键
     */
    public String getUserUuid() {
        return userUuid;
    }

    /**
     * 设置主键
     *
     * @param userUuid 主键
     */
    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取状态（0：正常，1：冻结）
     *
     * @return status - 状态（0：正常，1：冻结）
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态（0：正常，1：冻结）
     *
     * @param status 状态（0：正常，1：冻结）
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取手机号码
     *
     * @return phone_num - 手机号码
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * 设置手机号码
     *
     * @param phoneNum 手机号码
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取第三方归属（0：非第三方，1：微信，2：支付宝）
     *
     * @return third_party_own - 第三方归属（0：非第三方，1：微信，2：支付宝）
     */
    public Byte getThirdPartyOwn() {
        return thirdPartyOwn;
    }

    /**
     * 设置第三方归属（0：非第三方，1：微信，2：支付宝）
     *
     * @param thirdPartyOwn 第三方归属（0：非第三方，1：微信，2：支付宝）
     */
    public void setThirdPartyOwn(Byte thirdPartyOwn) {
        this.thirdPartyOwn = thirdPartyOwn;
    }

    /**
     * 获取第三方ID
     *
     * @return third_party_id - 第三方ID
     */
    public String getThirdPartyId() {
        return thirdPartyId;
    }

    /**
     * 设置第三方ID
     *
     * @param thirdPartyId 第三方ID
     */
    public void setThirdPartyId(String thirdPartyId) {
        this.thirdPartyId = thirdPartyId;
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
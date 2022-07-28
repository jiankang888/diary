package com.jiankang.diary.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_diary")
public class SysDiary {
    /**
     * 用于标识不同记录
     */
    @Id
    @Column(name = "record_id")
    private Long recordId;

    @Id
    @Column(name = "sys_diary_uuid")
    private String sysDiaryUuid;

    private String title;

    private String content;

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
     * @return sys_diary_uuid
     */
    public String getSysDiaryUuid() {
        return sysDiaryUuid;
    }

    /**
     * @param sysDiaryUuid
     */
    public void setSysDiaryUuid(String sysDiaryUuid) {
        this.sysDiaryUuid = sysDiaryUuid;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
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
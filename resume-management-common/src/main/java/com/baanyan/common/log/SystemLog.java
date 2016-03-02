package com.baanyan.common.log;

import java.sql.Timestamp;

/**
 * Created by steve on 3/2/16.
 */
public class SystemLog {

    private String userName;
    private String userId;
    private String exeOperation;
    private Timestamp createTime;

    @Override
    public String toString() {
        return "SystemLog{" +
                "userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", exeOperation='" + exeOperation + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getExeOperation() {
        return exeOperation;
    }

    public void setExeOperation(String exeOperation) {
        this.exeOperation = exeOperation;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}

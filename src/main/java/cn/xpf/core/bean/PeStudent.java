package cn.xpf.core.bean;

import java.io.Serializable;
import java.util.Date;

public class PeStudent implements Serializable {
    private String id;

    /**
     * 用户名
     */
    private String loginId;

    /**
     * 关联user表的id
     */
    private String fkUserId;

    /**
     * 班级
     */
    private String className;

    /**
     * 专业
     */
    private String orientName;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }

    public String getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(String fkUserId) {
        this.fkUserId = fkUserId == null ? null : fkUserId.trim();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public String getOrientName() {
        return orientName;
    }

    public void setOrientName(String orientName) {
        this.orientName = orientName == null ? null : orientName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", loginId=").append(loginId);
        sb.append(", fkUserId=").append(fkUserId);
        sb.append(", className=").append(className);
        sb.append(", orientName=").append(orientName);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
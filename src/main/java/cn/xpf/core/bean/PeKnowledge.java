package cn.xpf.core.bean;

import java.io.Serializable;
import java.util.Date;

public class PeKnowledge implements Serializable {
    private String id;

    /**
     * 知识点名称
     */
    private String title;

    /**
     * 关联course的id
     */
    private String fkCourseId;

    /**
     * 创建时间
     */
    private Date crateTime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getFkCourseId() {
        return fkCourseId;
    }

    public void setFkCourseId(String fkCourseId) {
        this.fkCourseId = fkCourseId == null ? null : fkCourseId.trim();
    }

    public Date getCrateTime() {
        return crateTime;
    }

    public void setCrateTime(Date crateTime) {
        this.crateTime = crateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", fkCourseId=").append(fkCourseId);
        sb.append(", crateTime=").append(crateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
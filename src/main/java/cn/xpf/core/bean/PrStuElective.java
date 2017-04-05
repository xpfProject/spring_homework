package cn.xpf.core.bean;

import java.io.Serializable;
import java.util.Date;

public class PrStuElective implements Serializable {
    private String id;

    /**
     * 关联course的id
     */
    private String fkCourseId;

    /**
     * 关联student的id
     */
    private String fkStudentId;

    /**
     *  选课是否有效
     */
    private Integer flagValid;

    /**
     * 创建时间
     */
    private Date creatTime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFkCourseId() {
        return fkCourseId;
    }

    public void setFkCourseId(String fkCourseId) {
        this.fkCourseId = fkCourseId == null ? null : fkCourseId.trim();
    }

    public String getFkStudentId() {
        return fkStudentId;
    }

    public void setFkStudentId(String fkStudentId) {
        this.fkStudentId = fkStudentId == null ? null : fkStudentId.trim();
    }

    public Integer getFlagValid() {
        return flagValid;
    }

    public void setFlagValid(Integer flagValid) {
        this.flagValid = flagValid;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", fkCourseId=").append(fkCourseId);
        sb.append(", fkStudentId=").append(fkStudentId);
        sb.append(", flagValid=").append(flagValid);
        sb.append(", creatTime=").append(creatTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
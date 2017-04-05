package cn.xpf.core.bean;

import java.io.Serializable;

public class PrTchElective implements Serializable {
    private String id;

    /**
     * 关联course的id
     */
    private String fkCourseId;

    /**
     * 关联teacher的id
     */
    private String fkTeacherId;

    /**
     * 授课是否有效
     */
    private Integer flagValid;

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

    public String getFkTeacherId() {
        return fkTeacherId;
    }

    public void setFkTeacherId(String fkTeacherId) {
        this.fkTeacherId = fkTeacherId == null ? null : fkTeacherId.trim();
    }

    public Integer getFlagValid() {
        return flagValid;
    }

    public void setFlagValid(Integer flagValid) {
        this.flagValid = flagValid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", fkCourseId=").append(fkCourseId);
        sb.append(", fkTeacherId=").append(fkTeacherId);
        sb.append(", flagValid=").append(flagValid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
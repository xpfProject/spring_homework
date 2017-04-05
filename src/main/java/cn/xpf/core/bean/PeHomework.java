package cn.xpf.core.bean;

import java.io.Serializable;
import java.util.Date;

public class PeHomework implements Serializable {
    private String id;

    /**
     * 作业名称
     */
    private String name;

    /**
     * 作业类型
     */
    private Integer type;

    /**
     * 创建人
     */
    private String creatUser;

    /**
     * 创建时间
     */
    private Date creatTime;

    /**
     * 作业状态
     */
    private Integer state;

    /**
     * 作业开始时间
     */
    private Date startTime;

    /**
     * 作业结束时间
     */
    private Date endTime;

    /**
     * 是否显示分数
     */
    private Integer showScore;

    /**
     * 是否显示答案
     */
    private Integer showAnswer;

    /**
     * 关联pe_course的id
     */
    private String fkCourseId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCreatUser() {
        return creatUser;
    }

    public void setCreatUser(String creatUser) {
        this.creatUser = creatUser == null ? null : creatUser.trim();
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getShowScore() {
        return showScore;
    }

    public void setShowScore(Integer showScore) {
        this.showScore = showScore;
    }

    public Integer getShowAnswer() {
        return showAnswer;
    }

    public void setShowAnswer(Integer showAnswer) {
        this.showAnswer = showAnswer;
    }

    public String getFkCourseId() {
        return fkCourseId;
    }

    public void setFkCourseId(String fkCourseId) {
        this.fkCourseId = fkCourseId == null ? null : fkCourseId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", creatUser=").append(creatUser);
        sb.append(", creatTime=").append(creatTime);
        sb.append(", state=").append(state);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", showScore=").append(showScore);
        sb.append(", showAnswer=").append(showAnswer);
        sb.append(", fkCourseId=").append(fkCourseId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package cn.xpf.core.bean;

import java.io.Serializable;
import java.util.Date;

public class PeHomeworkDetail implements Serializable {
    private String id;

    /**
     * 关联homework的id
     */
    private String fkHomeworkId;

    /**
     *  作业序号
     */
    private Integer sequence;

    /**
     * 作业题目
     */
    private String title;

    /**
     * 作业选项
     */
    private String content;

    /**
     * 答案
     */
    private String answer;

    /**
     * 关联题库题目的id
     */
    private String fkQuestionId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 题目分数
     */
    private Double score;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFkHomeworkId() {
        return fkHomeworkId;
    }

    public void setFkHomeworkId(String fkHomeworkId) {
        this.fkHomeworkId = fkHomeworkId == null ? null : fkHomeworkId.trim();
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getFkQuestionId() {
        return fkQuestionId;
    }

    public void setFkQuestionId(String fkQuestionId) {
        this.fkQuestionId = fkQuestionId == null ? null : fkQuestionId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", fkHomeworkId=").append(fkHomeworkId);
        sb.append(", sequence=").append(sequence);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", answer=").append(answer);
        sb.append(", fkQuestionId=").append(fkQuestionId);
        sb.append(", createTime=").append(createTime);
        sb.append(", score=").append(score);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
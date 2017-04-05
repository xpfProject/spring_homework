package cn.xpf.core.bean;

import java.io.Serializable;
import java.util.Date;

public class PeStoreQuestion implements Serializable {
    private String id;

    /**
     * 关联knowledge的id
     */
    private String fkKnowledgeId;

    /**
     *  题目序号
     */
    private Integer sequence;

    /**
     * 题目信息
     */
    private String title;

    /**
     * 选项内容
     */
    private String content;

    /**
     * 答案
     */
    private String anwser;

    private Date creatTime;

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

    public String getFkKnowledgeId() {
        return fkKnowledgeId;
    }

    public void setFkKnowledgeId(String fkKnowledgeId) {
        this.fkKnowledgeId = fkKnowledgeId == null ? null : fkKnowledgeId.trim();
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

    public String getAnwser() {
        return anwser;
    }

    public void setAnwser(String anwser) {
        this.anwser = anwser == null ? null : anwser.trim();
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
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
        sb.append(", fkKnowledgeId=").append(fkKnowledgeId);
        sb.append(", sequence=").append(sequence);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", anwser=").append(anwser);
        sb.append(", creatTime=").append(creatTime);
        sb.append(", score=").append(score);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
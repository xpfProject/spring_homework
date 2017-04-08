package cn.xpf.core.bean;

import java.io.Serializable;
import java.util.Date;

public class PeStuHomeworkHistory implements Serializable {
    private String id;

    /**
     * 关联homework的id
     */
    private String homeworkId;

    /**
     * 关联user的id
     */
    private String userId;

    /**
     * 作业分数
     */
    private String score;

    /**
     * 最后一次得分
     */
    private String lastScore;

    /**
     * 作业内容
     */
    private String content;

    /**
     * 上传的文件
     */
    private String userFile;

    /**
     * 关联批改的老师的id
     */
    private String checkUser;

    /**
     * 作业批改时间
     */
    private Date checkTime;

    /**
     * 作业状态
     */
    private Integer state;

    /**
     * 创建时间
     */
    private Date creatTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getHomeworkId() {
        return homeworkId;
    }

    public void setHomeworkId(String homeworkId) {
        this.homeworkId = homeworkId == null ? null : homeworkId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }

    public String getLastScore() {
        return lastScore;
    }

    public void setLastScore(String lastScore) {
        this.lastScore = lastScore == null ? null : lastScore.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getUserFile() {
        return userFile;
    }

    public void setUserFile(String userFile) {
        this.userFile = userFile == null ? null : userFile.trim();
    }

    public String getCheckUser() {
        return checkUser;
    }

    public void setCheckUser(String checkUser) {
        this.checkUser = checkUser == null ? null : checkUser.trim();
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", homeworkId=").append(homeworkId);
        sb.append(", userId=").append(userId);
        sb.append(", score=").append(score);
        sb.append(", lastScore=").append(lastScore);
        sb.append(", content=").append(content);
        sb.append(", userFile=").append(userFile);
        sb.append(", checkUser=").append(checkUser);
        sb.append(", checkTime=").append(checkTime);
        sb.append(", state=").append(state);
        sb.append(", creatTime=").append(creatTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
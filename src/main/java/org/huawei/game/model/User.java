package org.huawei.game.model;

/**
 * Created by Administrator on 2019/8/14.
 */
public class User {
    private Integer id;
    private Integer groupId;
    private Integer topGroup;
    private Integer energy;
    private Integer sumScore;
    private Integer sumScoreRank;
    private Integer weekScore;
    private Integer weekScoreRank;
    private Integer signCount;
    private Integer signScore;
    private Integer taskLvl;
    private Integer taskCount;
    private Integer taskScore;
    private Integer pkCount;
    private Integer pkScore;
    private Integer pkWin;
    private Integer pkLost;
    private Integer createdAt;
    private Integer updateAt;
    private Integer onlineAt;
    private Integer status;
    private String groups;
    private String userName;
    private String mobile;
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getTopGroup() {
        return topGroup;
    }

    public void setTopGroup(Integer topGroup) {
        this.topGroup = topGroup;
    }

    public String getGroups() {
        return groups;
    }

    public Integer getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    public Integer getEnergy() {
        return energy;
    }

    public void setEnergy(Integer energy) {
        this.energy = energy;
    }

    public Integer getSumScore() {
        return sumScore;
    }

    public void setSumScore(Integer sumScore) {
        this.sumScore = sumScore;
    }

    public Integer getSumScoreRank() {
        return sumScoreRank;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSumScoreRank(Integer sumScoreRank) {
        this.sumScoreRank = sumScoreRank;
    }

    public Integer getWeekScore() {
        return weekScore;
    }

    public void setWeekScore(Integer weekScore) {
        this.weekScore = weekScore;
    }

    public Integer getWeekScoreRank() {
        return weekScoreRank;
    }

    public void setWeekScoreRank(Integer weekScoreRank) {
        this.weekScoreRank = weekScoreRank;
    }

    public Integer getSignCount() {
        return signCount;
    }

    public void setSignCount(Integer signCount) {
        this.signCount = signCount;
    }

    public Integer getSignScore() {
        return signScore;
    }

    public void setSignScore(Integer signScore) {
        this.signScore = signScore;
    }

    public Integer getTaskLvl() {
        return taskLvl;
    }

    public void setTaskLvl(Integer taskLvl) {
        this.taskLvl = taskLvl;
    }

    public Integer getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(Integer taskCount) {
        this.taskCount = taskCount;
    }

    public Integer getTaskScore() {
        return taskScore;
    }

    public void setTaskScore(Integer taskScore) {
        this.taskScore = taskScore;
    }

    public Integer getPkCount() {
        return pkCount;
    }

    public void setPkCount(Integer pkCount) {
        this.pkCount = pkCount;
    }

    public Integer getPkScore() {
        return pkScore;
    }

    public void setPkScore(Integer pkScore) {
        this.pkScore = pkScore;
    }

    public Integer getPkWin() {
        return pkWin;
    }

    public void setPkWin(Integer pkWin) {
        this.pkWin = pkWin;
    }

    public Integer getPkLost() {
        return pkLost;
    }

    public void setPkLost(Integer pkLost) {
        this.pkLost = pkLost;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getOnlineAt() {
        return onlineAt;
    }

    public void setOnlineAt(Integer onlineAt) {
        this.onlineAt = onlineAt;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", groupId=" + groupId +
                ", topGroup=" + topGroup +
                ", energy=" + energy +
                ", sumScore=" + sumScore +
                ", sumScoreRank=" + sumScoreRank +
                ", weekScore=" + weekScore +
                ", weekScoreRank=" + weekScoreRank +
                ", signCount=" + signCount +
                ", signScore=" + signScore +
                ", taskLvl=" + taskLvl +
                ", taskCount=" + taskCount +
                ", taskScore=" + taskScore +
                ", pkCount=" + pkCount +
                ", pkScore=" + pkScore +
                ", pkWin=" + pkWin +
                ", pkLost=" + pkLost +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                ", onlineAt=" + onlineAt +
                ", status=" + status +
                ", groups='" + groups + '\'' +
                ", userName='" + userName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

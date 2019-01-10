package model;

import java.util.Date;

public class IcInformation {
    private Short uniNo;

    private Short inforType;

    private String title;

    private String content;

    private String createUser;

    private String createName;

    private Date createTime;

    private String replyContent;

    private String replyUser;

    private String replyName;

    private Date replyTime;

    private String checkUser;

    private String checkName;

    private Date checkTime;

    private String companyCode;

    private Short status;

    private Short sendRoute;

    private String ipaddress;

    private String ipaddressReply;

    private String userCode;

    private String userName;

    public Short getUniNo() {
        return uniNo;
    }

    public void setUniNo(Short uniNo) {
        this.uniNo = uniNo;
    }

    public Short getInforType() {
        return inforType;
    }

    public void setInforType(Short inforType) {
        this.inforType = inforType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public String getReplyUser() {
        return replyUser;
    }

    public void setReplyUser(String replyUser) {
        this.replyUser = replyUser;
    }

    public String getReplyName() {
        return replyName;
    }

    public void setReplyName(String replyName) {
        this.replyName = replyName;
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public String getCheckUser() {
        return checkUser;
    }

    public void setCheckUser(String checkUser) {
        this.checkUser = checkUser;
    }

    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getSendRoute() {
        return sendRoute;
    }

    public void setSendRoute(Short sendRoute) {
        this.sendRoute = sendRoute;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public String getIpaddressReply() {
        return ipaddressReply;
    }

    public void setIpaddressReply(String ipaddressReply) {
        this.ipaddressReply = ipaddressReply;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
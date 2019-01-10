package model;

public class IcAnnouncePermit {
    private Short permitId;

    private Short announceId;

    private String userType;

    public Short getPermitId() {
        return permitId;
    }

    public void setPermitId(Short permitId) {
        this.permitId = permitId;
    }

    public Short getAnnounceId() {
        return announceId;
    }

    public void setAnnounceId(Short announceId) {
        this.announceId = announceId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
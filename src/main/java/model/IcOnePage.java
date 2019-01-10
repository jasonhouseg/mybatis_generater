package model;

import java.util.Date;

public class IcOnePage {
    private Short pageId;

    private String pageCode;

    private String langCode;

    private String pageTitle;

    private Date createTime;

    private String creatorCode;

    private Date editTime;

    private String editorCode;

    private String companyCode;

    private String pageText;

    public Short getPageId() {
        return pageId;
    }

    public void setPageId(Short pageId) {
        this.pageId = pageId;
    }

    public String getPageCode() {
        return pageCode;
    }

    public void setPageCode(String pageCode) {
        this.pageCode = pageCode;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreatorCode() {
        return creatorCode;
    }

    public void setCreatorCode(String creatorCode) {
        this.creatorCode = creatorCode;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public String getEditorCode() {
        return editorCode;
    }

    public void setEditorCode(String editorCode) {
        this.editorCode = editorCode;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getPageText() {
        return pageText;
    }

    public void setPageText(String pageText) {
        this.pageText = pageText;
    }
}
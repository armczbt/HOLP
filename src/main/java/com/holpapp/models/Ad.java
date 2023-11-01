package com.holpapp.models;

import java.time.LocalDateTime;

public class Ad {
    private Integer id;
    private String type;
    private String title;
    private String description;
    private String ad_when;
    private String ad_where;
    private Integer idCreator;
    private LocalDateTime creationDate;
    private String validated;
    private Integer beneficiary;
    private String priority;
    private Boolean done;

    public Ad(Integer id,String type, String title, String description, String ad_when, String ad_where, Integer idCreator, LocalDateTime creationDate, String validated, Integer beneficiary, String priority, Boolean done) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.description = description;
        this.ad_when = ad_when;
        this.ad_where = ad_where;
        this.idCreator = idCreator;
        this.creationDate = creationDate;
        this.validated = validated;
        this.beneficiary = beneficiary;
        this.priority = priority;
        this.done = done;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

   

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdWhen() {
        return ad_when;
    }

    public void setAdWhen(String ad_when) {
        this.ad_when = ad_when;
    }

    public String getAdWhere() {
        return ad_where;
    }

    public void setAdWhere(String ad_where) {
        this.ad_where = ad_where;
    }

    public Integer getIdCreator() {
        return idCreator;
    }

    public void setIdCreator(Integer idCreator) {
        this.idCreator = idCreator;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public String getValidation() {
        return validated;
    }

    public void setValidation(String validated) {
        this.validated = validated;
    }

    public Integer getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(Integer beneficiary) {
        this.beneficiary = beneficiary;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Boolean isDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}

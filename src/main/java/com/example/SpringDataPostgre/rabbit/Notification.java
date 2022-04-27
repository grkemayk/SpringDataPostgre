package com.example.SpringDataPostgre.rabbit;

import java.io.Serializable;
import java.util.Date;

public class Notification implements Serializable {//Serializable interface'inden imp. olmak zorunda

    private String notificationId;
    private Date createdDate;
    private Boolean seen;
    private String message;

    @Override
    public String toString() {
        return "Notification{" +
                "notificationId='" + notificationId + '\'' +
                ", createdDate=" + createdDate +
                ", seen=" + seen +
                ", message='" + message + '\'' +
                '}';
    }

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getSeen() {
        return seen;
    }

    public void setSeen(Boolean seen) {
        this.seen = seen;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

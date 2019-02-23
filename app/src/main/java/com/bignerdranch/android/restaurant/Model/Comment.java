package com.bignerdranch.android.restaurant.Model;

public class Comment {
    private String username;
    private String comment;
    private String time;
    private String img;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getImg() {
        return img;
    }
}

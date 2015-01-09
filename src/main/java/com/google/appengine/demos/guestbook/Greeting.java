package com.google.appengine.demos.guestbook;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.users.User;
import com.textquo.twist.annotations.Ancestor;
import com.textquo.twist.annotations.Entity;

import java.util.Date;

@Entity
public class Greeting {

    @Ancestor
    private Key parent;

    private User user;

    private Date date;

    private String content;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Key getParent() {
        return parent;
    }

    public void setParent(Key parent) {
        this.parent = parent;
    }
}

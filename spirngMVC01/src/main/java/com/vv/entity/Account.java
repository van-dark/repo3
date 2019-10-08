package com.vv.entity;

public class Account {
    private String uname;
    private int coin;
    private User user;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "uname='" + uname + '\'' +
                ", coin=" + coin +
                ", user=" + user +
                '}';
    }
}

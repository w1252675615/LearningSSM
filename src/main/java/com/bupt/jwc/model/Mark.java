package com.bupt.jwc.model;

public class Mark {
    private int mid;

    private int sid;

    private int cid;

    private int score;

    public Mark(){}

    public Mark(int mid, int sid, int cid, int score) {
        this.mid = mid;
        this.sid = sid;
        this.cid = cid;
        this.score = score;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

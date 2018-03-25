package com.example.mrpython.elsreen.module.game.Data;

/**
 * Created by vuong on 3/25/2018.
 */

public class Player {
    private String uName;
    private  long scores;
    private int level;
    private long curExp;

    public  Player(){

    }

    //region SET && GET
    public void setName(String uName){
        if(uName == null) return;
        this.uName = uName;
    }
    public void setScores(long scores){
        if(scores < 0) return;
        this.scores = scores;
    }
    public void setLevel(int level){
        if(level < 0) return;
        this.level = level;
    }
    public void setCurExp(long curExp){
        if(curExp < 0) return;
        this.curExp = curExp;
    }
    public String getName(){
        if(this.uName == null) return "User";
        return this.uName;
    }
    public long getScores(){
        return this.scores;
    }
    public  int getLevel(){
        return this.level;
    }
    public long getCurExp(){
        return this.curExp;
    }
    // endregion

    public void addScore(long s){
        if(s <= 0 ) return;
        this.scores += s;
    }
    public void addCurExp(long e){
        if(e <=0 ) return;
        this.curExp += e;
    }
    public void addLevel(int l){
        if(l <= 0) {
            this.level ++;
        }else{
            this.level += l;
        }

    }
}

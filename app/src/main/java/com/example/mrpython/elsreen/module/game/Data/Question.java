package com.example.mrpython.elsreen.module.game.Data;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by vuong on 3/25/2018.
 */

public class Question {
    private String question;
    private String result;
    private ArrayList<String> answer;
    public  Question(){
        answer = new ArrayList<String>();
    }
    //region SET && GET

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        if(question == null) return;
        this.question = question;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        if(result == null) return;
        this.result = result;
    }

    public ArrayList<String> getAnswer() {
        return answer;
    }

    public void setAnswer(ArrayList<String> answer) {
        if(answer == null) return;
        this.answer = answer;
    }
    //endregion
    public void addAnser(String ans){
        if(ans == null) return;
        this.answer.add(ans);
    }
    public boolean isResult(String re){
        if(re == null) return false;
        if((this.answer.indexOf(re)) == -1) return false;
        if(! re.equals(this.result)) return false;
        return true;
    }

    public void suffletAnswer(){
        Collections.shuffle(this.answer);
    }
}

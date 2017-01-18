package com.tryout.officecrime;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Kshitij on 16-12-29.
 */
public class Crime {

    private UUID Id; // Universal Unique Identifier class
    private String Title;
    private Date date;
    private Boolean solved;

    public Crime(){
        Id = UUID.randomUUID(); // Generates random and unique identifier
        date = new Date();
        solved = false;
    }

    public void setTitle(String Title){
        this.Title = Title;
    }

    public String getTitle(){
        return this.Title;
    }

    public UUID getId(){
        return this.Id;
    }

    @Override
    public String toString() {
        return Title;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Boolean getSolved(){
        return solved;
    }

    public void setSolved(Boolean solve){
        this.solved = solve;
    }
    // BAL

}

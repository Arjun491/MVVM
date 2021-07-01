package com.example.mvvm;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "note_table")
public class Note {

 @PrimaryKey(autoGenerate = true) // means sqlite will auto increment the id which is primary key for note table
    private int id=0;
    private String title="";
    private String description="";
    private int priority=0;

    @Ignore // means subtitle will not added in table as a columns
    private String subTitle="";
/*Constructor*/

    public Note(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    /*Setters*/

    public void setId(int id) {
        this.id = id;
    }



    /*Getters*/
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}

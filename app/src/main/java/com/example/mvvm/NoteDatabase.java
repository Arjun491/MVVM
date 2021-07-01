package com.example.mvvm;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
@Database(entities = {Note.class}, version = 1)

// class to create database
public abstract class NoteDatabase extends RoomDatabase {

    private static NoteDatabase instance;

    public abstract NoteDao noteDao();
// synchronized means only one thread can access below method so we can avoid creation of two or more instance of this database
    //
    public static synchronized NoteDatabase getInstance(Context context)
    {
        // instance of database should note be more than one
        if(instance==null){
        // if instance is null means no database is create, then create a new DB
// .fallbackToDestructiveMigration() will create DB over again whenever DB version change
            instance= Room.databaseBuilder(context.getApplicationContext(), NoteDatabase.class, "note_database")
                    .fallbackToDestructiveMigration()
            .build();

        }
        return instance;
    }




}

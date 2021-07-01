package com.example.mvvm;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;


@Dao
public interface NoteDao {


    @Insert
    void insert(Note note);

    @Update
    void update (Note note);


    @Delete
    void delete (Note note);


    // delete all note at once

    @Query("DELETE FROM note_table")
    void deleteAllNotes(Note note);


    // return all notes list to show in recycler view or list view in descending order //

    @Query("SELECT * FROM note_table ORDER BY priority DESC")
    LiveData<List<Note> > getAllNotes();

}

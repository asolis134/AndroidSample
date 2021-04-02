package com.example.sample

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface SampleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(sample: SampleUser)

    @Query("SELECT * FROM SampleUser")
    fun getUsers(): List<SampleUser>

}
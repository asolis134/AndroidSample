package com.example.sample

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(entities = [SampleUser::class], version = 3)
abstract class SampleAppDatabase : RoomDatabase() {
    abstract fun aimDao(): SampleDao

    companion object{
        /*written to update database to latest versions on upgrade, required otherwise app will crash when retrieving db.
        * can also be fixed by deleting storage. */
        val Migration_2_3:Migration = object:Migration(2, 3){
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("ALTER TABLE 'SampleUser' " +
                        "ADD COLUMN intMetricMonthDefault INTEGER NOT NULL DEFAULT 2;")
            }
        }

    }
}
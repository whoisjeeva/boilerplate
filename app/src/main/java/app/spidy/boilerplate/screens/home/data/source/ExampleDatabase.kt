package app.spidy.boilerplate.screens.home.data.source

import androidx.room.Database
import androidx.room.RoomDatabase
import app.spidy.boilerplate.screens.home.model.Example

@Database(entities = [Example::class], version = 1)
abstract class ExampleDatabase: RoomDatabase() {
    abstract val exampleDao: ExampleDao

    companion object {
        const val NAME = "example_db"
    }
}
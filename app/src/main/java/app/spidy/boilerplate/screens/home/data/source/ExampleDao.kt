package app.spidy.boilerplate.screens.home.data.source

import androidx.room.*
import app.spidy.boilerplate.screens.home.model.Example
import kotlinx.coroutines.flow.Flow

@Dao
interface ExampleDao {
    @Query("SELECT * FROM example")
    fun getNotes(): Flow<List<Example>>

    @Query("SELECT * FROM example WHERE exampleId = :exampleId")
    suspend fun getNoteById(exampleId: Int): Example?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Example)

    @Delete
    suspend fun deleteNote(note: Example)
}
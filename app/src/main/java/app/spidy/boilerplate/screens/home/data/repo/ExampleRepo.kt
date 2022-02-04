package app.spidy.boilerplate.screens.home.data.repo

import app.spidy.boilerplate.screens.home.data.source.ExampleDao
import app.spidy.boilerplate.screens.home.model.Example
import kotlinx.coroutines.flow.Flow

class ExampleRepo(private val dao: ExampleDao) {
    fun getNotes(): Flow<List<Example>> {
        return dao.getNotes()
    }

    suspend fun getNoteById(noteId: Int): Example? {
        return dao.getNoteById(noteId)
    }

    suspend fun insertNote(note: Example) {
        dao.insertNote(note)
    }

    suspend fun deleteNote(note: Example) {
        dao.deleteNote(note)
    }
}
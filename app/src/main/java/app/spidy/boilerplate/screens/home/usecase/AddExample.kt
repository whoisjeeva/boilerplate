package app.spidy.boilerplate.screens.home.usecase

import app.spidy.boilerplate.screens.home.data.repo.ExampleRepo
import app.spidy.boilerplate.screens.home.model.Example
import app.spidy.boilerplate.screens.home.model.InvalidExampleException

class AddExample(private val repo: ExampleRepo) {
    @Throws(InvalidExampleException::class)
    suspend operator fun invoke(note: Example) {
        if (note.title.isBlank()) {
            throw InvalidExampleException("The title of the note can't be empty")
        }
        if (note.content.isBlank()) {
            throw InvalidExampleException("The content of the note can't be empty")
        }
        repo.insertNote(note)
    }
}
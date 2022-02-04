package app.spidy.boilerplate.screens.home.usecase

import app.spidy.boilerplate.screens.home.data.repo.ExampleRepo
import app.spidy.boilerplate.screens.home.model.Example

class DeleteExample(private val repo: ExampleRepo) {
    suspend operator fun invoke(note: Example) {
        repo.deleteNote(note)
    }
}
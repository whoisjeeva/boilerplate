package app.spidy.boilerplate.screens.home.usecase

import app.spidy.boilerplate.screens.home.data.repo.ExampleRepo
import app.spidy.boilerplate.screens.home.model.Example
import kotlinx.coroutines.flow.Flow

class GetExamples(private val repo: ExampleRepo) {
    operator fun invoke(): Flow<List<Example>> {
        return repo.getNotes()
    }
}
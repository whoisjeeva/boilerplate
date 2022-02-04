package app.spidy.boilerplate.core.di

import android.app.Application
import androidx.room.Room
import app.spidy.boilerplate.screens.home.data.repo.ExampleRepo
import app.spidy.boilerplate.screens.home.data.source.ExampleDatabase
import app.spidy.boilerplate.screens.home.usecase.AddExample
import app.spidy.boilerplate.screens.home.usecase.DeleteExample
import app.spidy.boilerplate.screens.home.usecase.ExampleUseCases
import app.spidy.boilerplate.screens.home.usecase.GetExamples
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideExampleDatabase(app: Application): ExampleDatabase {
        return Room.databaseBuilder(
            app, ExampleDatabase::class.java, ExampleDatabase.NAME).build()
    }

    @Provides
    @Singleton
    fun provideExampleRepo(db: ExampleDatabase): ExampleRepo {
        return ExampleRepo(db.exampleDao)
    }

    @Provides
    @Singleton
    fun provideExampleCases(repo: ExampleRepo): ExampleUseCases {
        return ExampleUseCases(
            getNotes = GetExamples(repo),
            deleteNote = DeleteExample(repo),
            addNote = AddExample(repo)
        )
    }
}
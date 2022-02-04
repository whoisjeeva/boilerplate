package app.spidy.boilerplate.screens.home.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "example")
data class Example(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int
) {
    @PrimaryKey(autoGenerate = true)
    var exampleId: Int = 0
}

class InvalidExampleException(message: String): Exception(message)

package app.spidy.boilerplate.screens.home.presentation

import androidx.lifecycle.ViewModel
import app.spidy.boilerplate.screens.home.usecase.ExampleUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val exampleUseCases: ExampleUseCases
): ViewModel() {

}
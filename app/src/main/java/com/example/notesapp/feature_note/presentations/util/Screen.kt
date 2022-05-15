package com.example.notesapp.feature_note.presentations.util

sealed class Screen(val route:String){
    object NotesScreen:Screen("NotesScreen")
    object AddEditNoteScreen:Screen("AddEditNoteScreen")
}

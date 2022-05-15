package com.example.notesapp.feature_note.domain.use_case

import com.example.notesapp.feature_note.domain.model.InvalidNoteException
import com.example.notesapp.feature_note.domain.model.Note
import com.example.notesapp.feature_note.domain.repository.NoteRepository
import javax.inject.Inject


class AddNoteUseCase @Inject constructor(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("Title of the note can not be empty")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("Content of the note can not be empty")
        }

        repository.insertNote(note)
    }
}
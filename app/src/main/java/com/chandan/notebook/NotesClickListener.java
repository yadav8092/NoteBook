package com.chandan.notebook;

import androidx.cardview.widget.CardView;

import com.chandan.notebook.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}

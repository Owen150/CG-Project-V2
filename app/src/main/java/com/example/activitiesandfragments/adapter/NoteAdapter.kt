package com.example.activitiesandfragments.adapter

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.activitiesandfragments.databinding.NoteLayoutBinding
import com.example.activitiesandfragments.model.Note

class NoteAdapter: RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {
    class NoteViewHolder(val itemBinding: NoteLayoutBinding): RecyclerView.ViewHolder(itemBinding.root)

    private val differCallback = object: DiffUtil.ItemCallback<Note>(){
        override fun areItemsTheSame(oldItem: Note, newItem: Note): Boolean {
            TODO("Not yet implemented")
        }

        override fun areContentsTheSame(oldItem: Note, newItem: Note): Boolean {
            TODO("Not yet implemented")
        }

    }
}
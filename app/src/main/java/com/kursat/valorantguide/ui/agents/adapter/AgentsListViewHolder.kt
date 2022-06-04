package com.kursat.valorantguide.ui.agents.adapter

import androidx.recyclerview.widget.RecyclerView
import com.kursat.valorantguide.databinding.RowAgentsListItemBinding
import com.kursat.valorantguide.model.Data

class AgentsListViewHolder(private val binding: RowAgentsListItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(items: Data) = with(binding) {
        agentsData = items
    }
}
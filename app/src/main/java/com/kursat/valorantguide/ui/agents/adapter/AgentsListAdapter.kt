package com.kursat.valorantguide.ui.agents.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.kursat.valorantguide.R
import com.kursat.valorantguide.databinding.RowAgentsListItemBinding
import com.kursat.valorantguide.model.Data

class AgentsListAdapter(private val items: List<Data>) :
    RecyclerView.Adapter<AgentsListViewHolder>() {

    var itemClick: ((Data) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AgentsListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: RowAgentsListItemBinding =
            DataBindingUtil.inflate(inflater, R.layout.row_agents_list_item, parent, false)
        return AgentsListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AgentsListViewHolder, position: Int) {
        holder.bind(items[position])
        holder.itemView.setOnClickListener {
            itemClick?.invoke(items[position])
        }
    }

    override fun getItemCount(): Int = items.size
}
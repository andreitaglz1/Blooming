package ni.edu.uca.blooming.ui.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ni.edu.uca.blooming.ui.post.Posts
import ni.edu.uca.blooming.R

class BloomAdapter(private val itemClickListener: OnItemClickListener) : ListAdapter<Posts, BloomAdapter.BloomViewHolder> (DiffCallback()){


    private class DiffCallback : DiffUtil.ItemCallback<Posts>() {
        override fun areItemsTheSame(oldItem: Posts, newItem: Posts): Boolean {
            return oldItem.texto == newItem.texto
        }

        override fun areContentsTheSame(oldItem: Posts, newItem: Posts): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BloomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context).inflate(R.layout.lista_bloom_account, parent, false)
        return BloomViewHolder(layoutInflater)
    
    }

    override fun onBindViewHolder(holder: BloomViewHolder, position: Int) {
        holder.bind(getItem(position), itemClickListener)
    }


    inner class BloomViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        private val tvBloom = itemView.findViewById(R.id.tvBloom) as TextView
        private val btnEditar = itemView.findViewById(R.id.btnEdit) as ImageButton
        private val btnBorrar = itemView.findViewById(R.id.btnDelete) as ImageButton

        fun bind(item: Posts, clickListener: OnItemClickListener) {
                tvBloom.text = item.texto
            btnEditar.setOnClickListener { clickListener.onItemEditar(adapterPosition, item) }
            btnBorrar.setOnClickListener { clickListener.onItemBorrar(adapterPosition) }
        }
    }

    interface OnItemClickListener {
        fun onItemEditar(position: Int, item: Posts)
        fun onItemBorrar(position: Int)
    }
}
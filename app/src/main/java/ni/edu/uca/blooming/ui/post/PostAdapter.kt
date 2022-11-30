package ni.edu.uca.blooming.ui.post

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ni.edu.uca.blooming.R

class PostAdapter(private val listaPosts: List<Posts>): RecyclerView.Adapter<PostViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PostViewHolder(layoutInflater.inflate(R.layout.item_listabloom, parent, false))
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val item = listaPosts[position]
        holder.renderizar(item)
    }

    override fun getItemCount(): Int {
        return listaPosts.size
    }

}
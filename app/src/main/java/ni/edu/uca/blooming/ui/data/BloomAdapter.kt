package ni.edu.uca.blooming.ui.data

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ni.edu.uca.blooming.Posts
import ni.edu.uca.blooming.R

class BloomAdapter(private val listaPosts: List<Posts>): RecyclerView.Adapter<PostViewHolder>() {


    /*private val BloomList :ArrayList<Bloom>()
    private val fullList : ArrayList<Bloom>()*/

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

    /*inner class BloomViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val bloom_layout = itemView.findViewById<CardView>()
    }*/
}
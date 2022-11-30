package ni.edu.uca.blooming.ui.post

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import ni.edu.uca.blooming.databinding.ItemListabloomBinding

class PostViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val binding = ItemListabloomBinding.bind(view)
    fun renderizar (posts: Posts) {
        binding.tvbloom.text = posts.texto.toString()
    }
}
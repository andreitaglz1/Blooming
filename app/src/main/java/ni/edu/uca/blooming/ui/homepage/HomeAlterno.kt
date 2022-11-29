package ni.edu.uca.blooming.ui.homepage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import ni.edu.uca.blooming.ListaPost
import ni.edu.uca.blooming.R
import ni.edu.uca.blooming.databinding.FragmentHomeAlternoBinding
import ni.edu.uca.blooming.databinding.FragmentHomePageBinding
import ni.edu.uca.blooming.ui.data.BloomAdapter
import ni.edu.uca.blooming.ui.post.PostAdapter

class HomeAlterno : Fragment() {

    private lateinit var binding: FragmentHomeAlternoBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeAlternoBinding.inflate(layoutInflater)
        initRecycler()
        binding.btnPost.setOnClickListener{
            Toast.makeText(activity, "Debe iniciar sesión para publicar", Toast.LENGTH_SHORT).show()

            Navigation.findNavController(binding.root).navigate(R.id.action_homeAlterno_to_loginFragment)
        }
        return  binding.root
    }

    fun initRecycler()
    {
        binding.blooms.layoutManager = LinearLayoutManager(activity)
        binding.blooms.adapter = PostAdapter(ListaPost.listaPost)
    }
}
package ni.edu.uca.blooming.ui.homepage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import ni.edu.uca.blooming.ListaPost
import ni.edu.uca.blooming.databinding.FragmentHomePageBinding
import ni.edu.uca.blooming.ui.data.BloomAdapter

class HomePageFragment : Fragment() {

        private lateinit var binding: FragmentHomePageBinding

        override fun onCreateView(

            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {
            binding = FragmentHomePageBinding.inflate(layoutInflater)
            initRecycler()
            return  binding.root



        }
    fun initRecycler()
    {
        binding.blooms.layoutManager = LinearLayoutManager(activity)
        binding.blooms.adapter = BloomAdapter(ListaPost.listaPost)

    }

    }

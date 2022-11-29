package ni.edu.uca.blooming.ui.post

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ni.edu.uca.blooming.R
import ni.edu.uca.blooming.databinding.FragmentPostBinding

class PostFragment : Fragment() {

    private lateinit var binding: FragmentPostBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPostBinding.inflate(layoutInflater)
        binding.btnPubBloom.setOnClickListener(){
            findNavController().navigate(R.id.homePageFragment)

        }

        return binding.root

    }
}
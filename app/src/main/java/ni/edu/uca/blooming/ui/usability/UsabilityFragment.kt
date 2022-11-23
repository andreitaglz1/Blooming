package ni.edu.uca.blooming.ui.usability

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ni.edu.uca.blooming.databinding.FragmentUsabilityBinding

class UsabilityFragment : Fragment() {

    private lateinit var  binding: FragmentUsabilityBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentUsabilityBinding.inflate(layoutInflater)

        return binding.root

    }


}
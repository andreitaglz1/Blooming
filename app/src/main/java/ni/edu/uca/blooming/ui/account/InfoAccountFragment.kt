package ni.edu.uca.blooming.ui.account

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ni.edu.uca.blooming.databinding.FragmentInfoAccountBinding

class InfoAccountFragment : Fragment() {

    private lateinit var binding : FragmentInfoAccountBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInfoAccountBinding.inflate(layoutInflater)

        return binding.root
    }

}
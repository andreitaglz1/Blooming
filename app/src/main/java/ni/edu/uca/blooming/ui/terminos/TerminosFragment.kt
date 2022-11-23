package ni.edu.uca.blooming.ui.terminos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ni.edu.uca.blooming.databinding.FragmentTerminosBinding


class TerminosFragment : Fragment() {
    private lateinit var binding: FragmentTerminosBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentTerminosBinding.inflate(layoutInflater)

        return binding.root

    }

}
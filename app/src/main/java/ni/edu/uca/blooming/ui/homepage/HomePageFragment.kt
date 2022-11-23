package ni.edu.uca.blooming.ui.homepage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ni.edu.uca.blooming.databinding.FragmentHomePageBinding

class HomePageFragment : Fragment() {

    class HelpFragment : Fragment() {

        private lateinit var binding: FragmentHomePageBinding

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {
            binding = FragmentHomePageBinding.inflate(layoutInflater)
            return  binding.root

        }

    }
}
package ni.edu.uca.blooming.ui.privacy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ni.edu.uca.blooming.databinding.FragmentPrivacyBinding

class PrivacyFragment : Fragment() {

    private var _binding: FragmentPrivacyBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPrivacyBinding.inflate(inflater, container, false)
        return  binding.root

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

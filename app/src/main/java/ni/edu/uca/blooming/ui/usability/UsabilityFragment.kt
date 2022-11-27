package ni.edu.uca.blooming.ui.usability

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.coroutines.Dispatchers.Main
import ni.edu.uca.blooming.databinding.FragmentUsabilityBinding

class UsabilityFragment : Fragment() {

    private lateinit var  binding: FragmentUsabilityBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        activity?.let { callingActivity -> startActivity(Intent(callingActivity, Main::class.java)) }

        return binding.root

    }


}
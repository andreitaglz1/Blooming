package ni.edu.uca.blooming.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import ni.edu.uca.blooming.R
import ni.edu.uca.blooming.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
    val user: String = "Baam"
    val password: String = "1234."

    private lateinit var binding: FragmentLoginBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(layoutInflater)

        return binding.root
    }

}

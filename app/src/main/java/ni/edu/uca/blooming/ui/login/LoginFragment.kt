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
    val user:String = "Baam"
    val password:String ="1234."

    private lateinit var binding: FragmentLoginBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(layoutInflater)
        Ingresar()

        return  binding.root
    }

    private fun  Ingresar(){
        try{
            binding.btnLogin.setOnClickListener {
                val userTemp = binding.etNombre.text.toString()
                val passwTemp:String = binding.etPassword.text.toString()

                if (userTemp == "Baam" && passwTemp=="1234."){
                    Navigation.findNavController(binding.root).navigate(R.id.homePageFragment)
                }else{
                    Toast.makeText(this.context, "Los datos que ingresó son incorrectos, Intent nuevamente!", Toast.LENGTH_SHORT).show()
                }
            }

        }catch (ex:Exception){

        }
    }
}
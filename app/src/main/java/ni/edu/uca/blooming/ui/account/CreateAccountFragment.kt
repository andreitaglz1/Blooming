package ni.edu.uca.blooming.ui.account

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import ni.edu.uca.blooming.R
import ni.edu.uca.blooming.databinding.FragmentCreateAccountBinding
import ni.edu.uca.blooming.data.UserViewModel
import ni.edu.uca.blooming.data.User


class CreateAccountFragment : Fragment() {

    private lateinit var mUserViewModel: UserViewModel
    private lateinit var binding: FragmentCreateAccountBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCreateAccountBinding.inflate(layoutInflater, container, false)

        mUserViewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        binding.btnSignUp.setOnClickListener {
            insertDataToDatabase()
        }

        return  binding.root

    }

    private fun insertDataToDatabase(){
        val userName = binding.etNombre.text.toString()
        val pwd = binding.etPassword.text.toString()

        if(inputCheck(userName, pwd)){
            val user = User(0, userName, pwd)
            //Añadir datos a la base de datos
            mUserViewModel.registrarUser(user)
            Toast.makeText(requireContext(), "Usuario añadido exitosamente", Toast.LENGTH_LONG).show()
            //Navegar de regreso
        }else{
            Toast.makeText(requireContext(), "No puede dejar los campos en blanco", Toast.LENGTH_LONG).show()
        }
    }
    private fun inputCheck(userName: String, pwd: String): Boolean{
        return !(TextUtils.isEmpty(userName) && TextUtils.isEmpty(pwd))
    }
}
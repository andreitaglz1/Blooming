package ni.edu.uca.blooming

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import ni.edu.uca.blooming.databinding.ActivityMainBinding

class MainActivity  : AppCompatActivity(){
    private lateinit var binding: ActivityMainBinding
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

            navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main)

            //for nav drawer
            toggle = ActionBarDrawerToggle(this, binding.root, R.string.open, R.string.close)
            binding.root.addDrawerListener(toggle)
            toggle.syncState()
            supportActionBar?.setDisplayHomeAsUpEnabled(true)


            //bottom navigation
            binding.bottomNav.setOnItemSelectedListener { it ->
                when (it.itemId) {
                    R.id.btnInicio -> {
                        navController.navigate(R.id.homeFragment)
                    }
                    R.id.btnUsuario -> {
                        navController.navigate(R.id.infoAccountFragment)
                    }
                }
                true

            }

        }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(toggle.onOptionsItemSelected(item))
            return true
        return super.onOptionsItemSelected(item)
    }
}
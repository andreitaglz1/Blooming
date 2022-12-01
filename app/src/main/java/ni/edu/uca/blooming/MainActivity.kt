package ni.edu.uca.blooming

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ni.edu.uca.blooming.databinding.ActivityMainBinding

class MainActivity  : AppCompatActivity(){
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main)


    }

}
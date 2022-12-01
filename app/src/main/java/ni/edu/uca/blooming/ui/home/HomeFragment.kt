package ni.edu.uca.blooming.ui.home


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import ni.edu.uca.blooming.ui.post.Posts
import ni.edu.uca.blooming.databinding.FragmentHomeBinding
import ni.edu.uca.blooming.ui.data.BloomAdapter

import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.navigation.NavController


class  HomeFragment : Fragment(), BloomAdapter.OnItemClickListener {
    private lateinit var binding: FragmentHomeBinding
    lateinit var toggle: ActionBarDrawerToggle
    private lateinit var navController: NavController


    var dataSet: MutableList<Posts> = arrayListOf()
    lateinit var mAdapter: BloomAdapter

    var isEditar = false
    var posicion = -1

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater)


        mAdapter = BloomAdapter(this)
        binding.blooms.layoutManager = LinearLayoutManager(activity)
        binding.blooms.adapter = mAdapter

        binding.btnPost.setOnClickListener {
            if (!isEditar) {
                dataSet.add(Posts(binding.etPost.text.toString().trim()))
                mAdapter.submitList(dataSet)
                mAdapter.notifyDataSetChanged()

                binding.etPost.setText("")
            } else {
                dataSet[posicion].texto = binding.etPost.text.toString()
                posicion = -1
                isEditar = false
                mAdapter.submitList(dataSet)
                mAdapter.notifyDataSetChanged()

                binding.etPost.setText("")
            }


        }

        return binding.root
    }
    override fun onItemEditar(position: Int, item: Posts) {
        isEditar = true
        posicion = position
        binding.etPost.setText(item.texto)
    }

    override fun onItemBorrar(position: Int) {
        dataSet.removeAt(position)
        mAdapter.submitList(dataSet)
        mAdapter.notifyDataSetChanged()
    }



}
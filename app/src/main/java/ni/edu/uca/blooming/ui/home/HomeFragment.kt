package ni.edu.uca.blooming.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import ni.edu.uca.blooming.Posts
import ni.edu.uca.blooming.R
import ni.edu.uca.blooming.databinding.FragmentHomeBinding
import ni.edu.uca.blooming.ui.data.BloomAdapter


class HomeFragment : Fragment(), BloomAdapter.OnItemClickListener {
    private lateinit var binding: FragmentHomeBinding

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

        binding.btnPost.setOnClickListener {
            findNavController().navigate(R.id.postFragment)
        }

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


package ni.edu.uca.blooming.ui.homepage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import ni.edu.uca.blooming.ListaPost
import ni.edu.uca.blooming.Posts
import ni.edu.uca.blooming.R
import ni.edu.uca.blooming.databinding.FragmentHomePageBinding
import ni.edu.uca.blooming.ui.data.BloomAdapter


class HomePageFragment : Fragment(), BloomAdapter.OnItemClickListener {

        private lateinit var binding: FragmentHomePageBinding

        var dataSet: MutableList<Posts> = arrayListOf()
        lateinit var mAdapter: BloomAdapter

        var isEditar = false
        var posicion = -1



        override fun onCreateView(

            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {
            binding = FragmentHomePageBinding.inflate(layoutInflater)
            //initRecycler()

            binding.btnPost.setOnClickListener {
                findNavController().navigate(R.id.postFragment)
            }

            mAdapter = BloomAdapter(this)
            binding.blooms.layoutManager = LinearLayoutManager(activity)
            binding.blooms.adapter = mAdapter

            binding.btnPost.setOnClickListener {
            if(!isEditar) {
                dataSet.add(Posts(binding.etGuardar.text.toString().trim()))
                mAdapter.submitList(dataSet)
                mAdapter.notifyDataSetChanged()

                binding.etGuardar.setText("")
            } else {
                dataSet[posicion].texto = binding.etGuardar.text.toString()
                posicion = -1
                isEditar = false
                mAdapter.submitList(dataSet)
                mAdapter.notifyDataSetChanged()

                binding.etGuardar.setText("")
            }

        }
            return  binding.root




        }
    /*fun initRecycler()
    {
        binding.blooms.layoutManager = LinearLayoutManager(activity)
        binding.blooms.adapter = BloomAdapter(ListaPost.listaPost)

    }*/


    override fun onItemEditar(position: Int, item: Posts) {
        isEditar = true
        posicion = position
        binding.etGuardar.setText(item.texto)
    }

    override fun onItemBorrar(position: Int) {
        dataSet.removeAt(position)
        mAdapter.submitList(dataSet)
        mAdapter.notifyDataSetChanged()
    }
    }

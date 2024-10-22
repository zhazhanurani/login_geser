package com.example.login_geser

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.login_geser.databinding.FragmentLoginBinding

class Login : Fragment() {
    ///jangan lupa ubah
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnLogin.setOnClickListener{
            val username = binding.username.text.toString()
            val password = binding.password.text.toString()

            //VALIDASI INPUT
            if (username.isEmpty() || password.isEmpty()){
                Toast.makeText(requireContext(), "Harap isi semua data ngb", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(activity, Homepage::class.java)
                intent.putExtra("username",username)
                intent.putExtra("password",password)
                startActivity(intent)
            }

        }
    }


}
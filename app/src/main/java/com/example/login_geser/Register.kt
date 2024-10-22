package com.example.login_geser

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.login_geser.databinding.FragmentRegisterBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Register.newInstance] factory method to
 * create an instance of this fragment.
 */
class Register : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentRegisterBinding? = null
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
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnRegister.setOnClickListener{
            val username = binding.username.text.toString()
            val email = binding.email.text.toString()
            val phone = binding.phone.text.toString()
            val password = binding.password.text.toString()

            //VALIDASI INPUT
            if (username.isEmpty() || email.isEmpty() || phone.isEmpty() || password.isEmpty()){
                Toast.makeText(requireContext(), "Harap isi semua data", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(activity, Homepage::class.java)
                intent.putExtra("username",username)
                intent.putExtra("email",email)
                intent.putExtra("phone",phone)
                intent.putExtra("password",password)
                startActivity(intent)
            }

        }

    }


}
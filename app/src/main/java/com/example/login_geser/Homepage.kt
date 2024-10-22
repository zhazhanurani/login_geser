package com.example.login_geser

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.login_geser.databinding.ActivityHomepageBinding

class Homepage : AppCompatActivity() {
    //mengaktifkan homepage binding
    private val binding by lazy{
        ActivityHomepageBinding.inflate(layoutInflater)}

    //content
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        // mengambil data dari intent
        val username = intent.getStringExtra("username")

        //mengganti data  pada id putUsername
        binding.putUsername.text = username

        binding.btnSad.setOnClickListener{Toast.makeText(this, "Do You Need Money?", Toast.LENGTH_SHORT).show()}
        binding.btnHappy.setOnClickListener{Toast.makeText(this, "UR MAI Sunsin", Toast.LENGTH_SHORT).show()}

    }
    //menampilkan menu options
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_options, menu)
        return true
    }

    //exit pada icon exit
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_exit -> {
                finish()
                Toast.makeText(this, "EXIT", Toast.LENGTH_SHORT).show()
                true
            }

            else -> super.onOptionsItemSelected(item)

        }
    }
}
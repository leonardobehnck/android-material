package br.com.messoretech

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.messoretech.databinding.ActivityMainBinding
import br.com.messoretech.databinding.ActivityTextFieldsBinding

class MainActivity : AppCompatActivity() {

  //private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }


  val botao = findViewById(R.id.cv_buttons)

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    insertListeners()
  }

  private fun insertListeners() {
    botao.setOnClickListener {
      Toast.makeText(this, "Botões", Toast.LENGTH_SHORT).show()
      startActivity(Intent(this, ButtonsActivity::class.java))
    }

//    binding.cvTextFields.setOnClickListener {
//      startActivity(TextFieldsActivity.createIntent(this))
//    }

  }


}

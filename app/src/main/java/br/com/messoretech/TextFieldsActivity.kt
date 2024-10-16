package br.com.messoretech

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import br.com.messoretech.databinding.ActivityTextFieldsBinding

class TextFieldsActivity : AppCompatActivity(){

  private val binding by lazy { ActivityTextFieldsBinding.inflate(layoutInflater) }

  override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
    super.onCreate(savedInstanceState, persistentState)
    setContentView(binding.root)

    binding.error.error = "Campo obrigatório"
  }

  companion object {
    fun createIntent(context: Context): Intent = Intent(context, TextFieldsActivity::class.java)
  }

}

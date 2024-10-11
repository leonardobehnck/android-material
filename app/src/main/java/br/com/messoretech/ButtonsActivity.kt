package br.com.messoretech

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import br.com.messoretech.databinding.ActivityButtonsBinding

class ButtonsActivity : AppCompatActivity() {

  private val binding by lazy { ActivityButtonsBinding.inflate(layoutInflater) }

  override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
    super.onCreate(savedInstanceState, persistentState)
    setContentView(R.layout.activity_buttons)
  }
}

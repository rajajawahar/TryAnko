package com.sample.tryanko

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.button
import kotlinx.android.synthetic.main.activity_main.coordinatorLayout
import kotlinx.android.synthetic.main.activity_main.longToast
import kotlinx.android.synthetic.main.activity_main.longsnackbar
import kotlinx.android.synthetic.main.activity_main.snackbar
import org.jetbrains.anko.design.longSnackbar
import org.jetbrains.anko.design.snackbar
import org.jetbrains.anko.longToast
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    button.setOnClickListener {
      toast("This is a toast")
    }
    longToast.setOnClickListener {
      longToast("This is a long toast")
    }
    snackbar.setOnClickListener {
      snackbar(coordinatorLayout, "Normal Snackbar")
    }
    longsnackbar.setOnClickListener {
      longSnackbar(coordinatorLayout, "Long Snackbar")
    }

  }
}

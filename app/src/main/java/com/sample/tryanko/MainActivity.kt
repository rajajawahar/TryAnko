package com.sample.tryanko

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.alert_dialogue
import kotlinx.android.synthetic.main.activity_main.button
import kotlinx.android.synthetic.main.activity_main.coordinatorLayout
import kotlinx.android.synthetic.main.activity_main.dialogue
import kotlinx.android.synthetic.main.activity_main.longToast
import kotlinx.android.synthetic.main.activity_main.longsnackbar
import kotlinx.android.synthetic.main.activity_main.progress_dialogue
import kotlinx.android.synthetic.main.activity_main.snackbar
import org.jetbrains.anko.alert
import org.jetbrains.anko.design.longSnackbar
import org.jetbrains.anko.design.snackbar
import org.jetbrains.anko.longToast
import org.jetbrains.anko.progressDialog
import org.jetbrains.anko.selector
import org.jetbrains.anko.toast

open class MainActivity : AppCompatActivity() {

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
    dialogue.setOnClickListener {
      val options = listOf("Option 1", "Option 2", "Option 4")
      selector("Select an option", options) { dialogInterface, i ->
        toast("You selected ${options[i]}")
      }
    }
    alert_dialogue.setOnClickListener {

      alert(message = "Are you want to exit the application", title = "LogOut") {
        positiveButton("Proceed") {
          toast("You clicked Proceed")
        }
        negativeButton("Cancel") {
          toast("You clicked Cancel")
        }
      }.show()
    }
    progress_dialogue.setOnClickListener {
      progressDialog(message = "Fetching Data", title = "Loading") {

      }.show()
    }

  }
}

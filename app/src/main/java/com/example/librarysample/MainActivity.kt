package com.example.librarysample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.servicelocator.ServiceLocator.getServiceInstance
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = getServiceInstance<User>()

        message.text = user.name

    }
}

package helloservice.fabiolindemberg.com.br.helloservice

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnStart).setOnClickListener {
            startService(Intent(this, HelloService::class.java))
        }

        findViewById<Button>(R.id.btnStop).setOnClickListener {
            stopService(Intent(this, HelloService::class.java))
        }
    }
}

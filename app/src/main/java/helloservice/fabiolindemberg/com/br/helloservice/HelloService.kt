package helloservice.fabiolindemberg.com.br.helloservice

import android.app.IntentService
import android.app.Notification
import android.content.Intent
import android.util.Log

class HelloService : IntentService("Livro Android"){

    private var count: Int = 0
    private var running: Boolean = false

    // Constantes
    private val MAX = 10
    private val TAG = "livro"

    override fun onHandleIntent(intent: Intent?) {
        Log.d(TAG, ">> HelloService.onHandleIntent()")
        running = true

        while(running && count < MAX){
            // Simula algum processamento
            Thread.sleep(1000)
            Log.d(TAG, "HelloService executando..." + count)
            count++
        }

        Log.d(TAG, "<<< HelloService.onHandleIntent()")
        val it = Intent(this, MainActivity::class.java)


        Util.show(this, 100, "Livro Android", "Fim do Serviço!", "", Intent(this, MainActivity::class.java))
    }

}
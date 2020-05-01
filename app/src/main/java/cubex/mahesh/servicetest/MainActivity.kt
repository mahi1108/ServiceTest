package cubex.mahesh.servicetest

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var i = Intent(this, MyService::class.java)
        start_btn.setOnClickListener {
                startService(i)
        }
        stop_btn.setOnClickListener {
                stopService(i)
        }
    }
}

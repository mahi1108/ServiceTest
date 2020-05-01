package cubex.mahesh.servicetest

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class MyService : Service() {
    var mPlayer:MediaPlayer? = null
    override fun onBind(intent: Intent?): IBinder? {
        return  null
    }

    override fun onCreate() {
        super.onCreate()
        mPlayer = MediaPlayer.create(
            this,
            R.raw.vakeel)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        mPlayer?.start()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        mPlayer?.stop()
    }
}
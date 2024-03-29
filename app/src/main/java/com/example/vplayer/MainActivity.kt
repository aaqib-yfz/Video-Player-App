package com.example.vplayer
import android.net.Uri.parse
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val videoView = findViewById<VideoView>(R.id.testView)


        // creating MediaController
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        //specifying location of media file

        val uri:Uri = parse(
            "android.resource://" + packageName
                    +   "/raw/uwu"
        )

        //setting mediaController
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }
}








package com.example.user.videoplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;
import android.widget.MediaController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView myvideoView = (VideoView) findViewById(R.id.myvideoView);

      myvideoView.setVideoPath("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4");

        //play pause stop

        MediaController mediaController = new MediaController (this);
        mediaController.setAnchorView(myvideoView);
        myvideoView.setMediaController(mediaController);


myvideoView.start();

    }
}

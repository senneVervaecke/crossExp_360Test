package com.example.sennevervaecke.crossexp_360test;

import android.os.AsyncTask;

import com.google.vr.sdk.widgets.video.VrVideoView;

import java.io.IOException;

/**
 * Created by sennevervaecke on 1/8/2018.
 */

public class VideoLoaderTask extends AsyncTask<VrVideoView, Void, Boolean> {

    @Override
    protected Boolean doInBackground(VrVideoView... videoViews) {
        try {
            VrVideoView.Options options = new VrVideoView.Options();
            options.inputType = VrVideoView.Options.TYPE_MONO;
            if(videoViews.length >= 1) {
                videoViews[0].loadVideoFromAsset("cave.mp4", options);
            }
        } catch( IOException e ) {
            //Handle exception
        }

        return true;
    }
}

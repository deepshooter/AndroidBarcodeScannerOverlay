package com.deepshooter.androidbarcodescanneroverlay;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private CameraPreview mPreview;
    private Camera mCamera;
    private Context myContext;
    private LinearLayout cameraPreview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        myContext = this;

        mCamera = Camera.open();
        mCamera.setDisplayOrientation(90);
        cameraPreview = findViewById(R.id.cPreview);
        mPreview = new CameraPreview(myContext, mCamera);
        cameraPreview.addView(mPreview);

    }
}

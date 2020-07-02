package com.example.lineargraph;

import android.app.Activity;
import android.opengl.GLSurfaceView;

import android.view.MotionEvent;

class Linear3DSurfaceView extends GLSurfaceView {
    private final Linear3DRenderer mRenderer;

    public Linear3DSurfaceView(Activity aActivity) {
        super(aActivity);

        // Create an OpenGL ES 2.0 context
        setEGLContextClientVersion(2);

        mRenderer = new Linear3DRenderer();
        setRenderer(mRenderer);
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        mRenderer.onTouchEvent(event);
        requestRender();
        return true;
    }
}



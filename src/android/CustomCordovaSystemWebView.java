package com.ssg.cordova;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

import org.apache.cordova.engine.SystemWebView;

public class CustomCordovaSystemWebView extends SystemWebView  {
    private View.OnKeyListener mCustomKeyListener;

    public CustomCordovaSystemWebView(Context context) {
        super(context);
    }

    public CustomCordovaSystemWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        return new BaseInputConnection(this, false); //this is needed for #dispatchKeyEvent() to be notified.
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        boolean dispatchFirst = super.dispatchKeyEvent(event);
        if (mCustomKeyListener != null){
            mCustomKeyListener.onKey(this, event.getKeyCode(), event);
        }
        return dispatchFirst;
    }

    public void setCustomOnKeyListener(OnKeyListener l){
        mCustomKeyListener = l;
    }
}

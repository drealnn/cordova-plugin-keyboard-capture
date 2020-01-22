package com.ssg.cordova;


import android.content.Context;

import org.apache.cordova.CordovaPreferences;
import org.apache.cordova.engine.SystemWebView;
import org.apache.cordova.engine.SystemWebViewEngine;

public class CustomCordovaWebviewEngine extends SystemWebViewEngine {
    public CustomCordovaWebviewEngine(Context context, CordovaPreferences preferences) {
        this(new CustomCordovaSystemWebView(context), preferences);
        //Log.e("TAG", "My custom webview engine");
    }

    public CustomCordovaWebviewEngine(SystemWebView webView) {
        super(webView);
    }

    public CustomCordovaWebviewEngine(SystemWebView webView, CordovaPreferences preferences) {
        super(webView, preferences);
        //Log.e("TAG", "Not a custom webview engine");
    }
}

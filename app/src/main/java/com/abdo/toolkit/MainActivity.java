package com.abdo.toolkit;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
public class MainActivity extends Activity {
  @Override protected void onCreate(Bundle s) {
    super.onCreate(s);
    WebView w = new WebView(this);
    setContentView(w);
    WebSettings ws = w.getSettings();
    ws.setJavaScriptEnabled(true);
    ws.setDomStorageEnabled(true);
    w.loadUrl("file:///android_asset/app.html");
  }
}

package com.haroldosales.portaleco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final WebView web= (WebView) findViewById(R.id.web);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                // Code for WebView goes here
                /*urldosite*/
                 web.loadUrl("https://www.portalecovida.com.br");


                WebSettings webSe = web.getSettings();
                webSe.setAllowContentAccess(true);

                webSe.setJavaScriptEnabled(true);
            }
        });




    }
}

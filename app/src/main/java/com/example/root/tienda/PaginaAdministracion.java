package com.example.root.tienda;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;


public class PaginaAdministracion extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_administracion);
        WebView myWebView = (WebView) this.findViewById(R.id.webView1);
        myWebView.loadUrl("https://tienda-cursojesusconde.rhcloud.com/wp-admin/");
        finish();

    }




}

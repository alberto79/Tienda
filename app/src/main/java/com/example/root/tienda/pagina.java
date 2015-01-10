package com.example.root.tienda;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

import java.net.URI;
import java.net.URISyntaxException;


public class pagina extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina);

        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.elarmarioderociorta.tk/"));
        startActivity(intent);

    }



}

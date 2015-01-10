package com.example.root.tienda;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;


public class MyActivity extends Activity {

    Button admin;
    Button pagina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        admin=(Button)findViewById(R.id.webView1);
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyActivity.this,PaginaAdministracion.class));
            }
        }

        );

        pagina=(Button)findViewById(R.id.pagina2);
        pagina.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         startActivity(new Intent(MyActivity.this,pagina.class));
                                     }
                                 }

        );


    }





}

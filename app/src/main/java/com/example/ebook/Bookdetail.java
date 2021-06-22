package com.example.ebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Bookdetail extends AppCompatActivity {
TextView t1 ;
Button b1,b2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookdetail);


        Bundle bundle = getIntent().getExtras();
        String s1 = bundle.getString("message");
        t1 = (TextView)findViewById(R.id.t1) ;

        t1.setText(s1);
        b1 =(Button) findViewById(R.id.openbook) ;
        b2 =(Button) findViewById(R.id.Listenbook) ;
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Bookdetail.this, Listenbook.class) ;
                startActivity(i1);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Bookdetail.this, Booktext.class) ;
                startActivity(i1);
            }
        });

    }
}
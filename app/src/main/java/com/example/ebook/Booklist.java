package com.example.ebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Booklist extends AppCompatActivity {

    LinearLayout book1 , book2, book3, book4 ;
String s1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booklist);

        book1 = (LinearLayout)findViewById(R.id.book1);
        book2 = (LinearLayout)findViewById(R.id.book2);
        book3 = (LinearLayout)findViewById(R.id.book3);
        book4 = (LinearLayout)findViewById(R.id.book4);
s1 = "Welcome to our app " ;

        book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openbookdertail("Harry Potter is a series of fantasy novels written by British author J. K. Rowling. The novels chronicle the lives of a young wizard, Harry Potter, and his friends Hermione Granger and Ron Weasley, all of whom are students at Hogwarts School of Witchcraft and Wizardry. The main story arc concerns Harry's struggle against Lord Voldemort, a dark wizard who intends to become immortal, overthrow the wizard governing body known as the Ministry of Magic and subjugate all wizards and Muggles (non-magical people). ") ;
            }
        });
        book2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openbookdertail("Harry Potter is a series of fantasy novels written by British author J. K. Rowling. The novels chronicle the lives of a young wizard, Harry Potter, and his friends Hermione Granger and Ron Weasley, all of whom are students at Hogwarts School of Witchcraft and Wizardry. The main story arc concerns Harry's struggle against Lord Voldemort, a dark wizard who intends to become immortal, overthrow the wizard governing body known as the Ministry of Magic and subjugate all wizards and Muggles (non-magical people). ") ;
            }
        });
        book3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openbookdertail("Harry Potter is a series of fantasy novels written by British author J. K. Rowling. The novels chronicle the lives of a young wizard, Harry Potter, and his friends Hermione Granger and Ron Weasley, all of whom are students at Hogwarts School of Witchcraft and Wizardry. The main story arc concerns Harry's struggle against Lord Voldemort, a dark wizard who intends to become immortal, overthrow the wizard governing body known as the Ministry of Magic and subjugate all wizards and Muggles (non-magical people). ") ;
            }
        });
        book4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openbookdertail("Harry Potter is a series of fantasy novels written by British author J. K. Rowling. The novels chronicle the lives of a young wizard, Harry Potter, and his friends Hermione Granger and Ron Weasley, all of whom are students at Hogwarts School of Witchcraft and Wizardry. The main story arc concerns Harry's struggle against Lord Voldemort, a dark wizard who intends to become immortal, overthrow the wizard governing body known as the Ministry of Magic and subjugate all wizards and Muggles (non-magical people). ") ;
            }
        });



    }

    void openbookdertail(String s1){

        Intent intent = new Intent(Booklist.this, Bookdetail.class);
        intent.putExtra("message", s1);
        startActivity(intent);


    }

}
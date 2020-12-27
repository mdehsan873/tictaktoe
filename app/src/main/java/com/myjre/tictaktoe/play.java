package com.myjre.tictaktoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class play extends AppCompatActivity {
    ImageView one,two,three,four,five,six,seven,eight,nine;
    TextView turndisplay;
    Button restart;
    int x=0,turn=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        turndisplay=findViewById(R.id.turndisplay);
        restart=findViewById(R.id.restart);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(turn==1) {
                    if(x==0) {
                        one.setImageResource(R.drawable.otictac);
                        turndisplay.setText("O Turn");
                        turn = 0;
                    }
                    else
                    {
                        one.setImageResource(R.drawable.xtictac);
                        x--;
                        turndisplay.setText("X Turn");
                    }
                }
                else
                {

                    turn=0;
                }


            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(turn==1) {
                    if(x==0) {
                        two.setImageResource(R.drawable.otictac);
                        turndisplay.setText("O Turn");
                        turn = 0;
                    }
                    else
                    {
                        two.setImageResource(R.drawable.xtictac);
                        x--;
                        turndisplay.setText("X Turn");
                    }
                }
                else
                {

                    turn=0;
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(turn==1) {
                    if(x==0) {
                        three.setImageResource(R.drawable.otictac);
                        turndisplay.setText("O Turn");
                        turn = 0;
                    }
                    else
                    {
                        three.setImageResource(R.drawable.xtictac);
                        x--;
                        turndisplay.setText("X Turn");
                    }
                }
                else
                {

                    turn=0;
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(turn==1) {
                    if(x==0) {
                        four.setImageResource(R.drawable.otictac);
                        turndisplay.setText("O Turn");
                        turn = 0;
                    }
                    else
                    {
                        four.setImageResource(R.drawable.xtictac);
                        x--;
                        turndisplay.setText("X Turn");
                    }
                }
                else
                {

                    turn=0;
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(turn==1) {
                    if(x==0) {
                        five.setImageResource(R.drawable.otictac);
                        turndisplay.setText("O Turn");
                        turn = 0;
                    }
                    else
                    {
                        five.setImageResource(R.drawable.xtictac);
                        x--;
                        turndisplay.setText("X Turn");
                    }
                }
                else
                {

                    turn=0;
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(turn==1) {
                    if(x==0) {
                       six.setImageResource(R.drawable.otictac);
                        turndisplay.setText("O Turn");
                        turn = 0;
                    }
                    else
                    {
                        six.setImageResource(R.drawable.xtictac);
                        x--;
                        turndisplay.setText("X Turn");
                    }
                }
                else
                {

                    turn=0;
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(turn==1) {
                    if(x==0) {
                        seven.setImageResource(R.drawable.otictac);
                        turndisplay.setText("O Turn");
                        turn = 0;
                    }
                    else
                    {
                      seven.setImageResource(R.drawable.xtictac);
                        x--;
                        turndisplay.setText("X Turn");
                    }
                }
                else
                {

                    turn=0;
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(turn==1) {
                    if(x==0) {
                        eight.setImageResource(R.drawable.otictac);
                        turndisplay.setText("O Turn");
                        turn = 0;
                    }
                    else
                    {
                        eight.setImageResource(R.drawable.xtictac);
                        x--;
                        turndisplay.setText("X Turn");
                    }
                }
                else
                {

                    turn=0;
                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(turn==1) {

                      nine.setImageResource(R.drawable.otictac);
                        turndisplay.setText("O Turn");
                        turn = 0;

                }
                else
                {

                    turn=0;
                    nine.setImageResource(R.drawable.xtictac);

                    turndisplay.setText("X Turn");
                }
            }
        });
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                finish();
                startActivity(intent);
            }
        });
    }
}
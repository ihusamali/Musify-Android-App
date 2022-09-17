package com.husamali.a1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button bt5;
    Button bt6;
    Button bt7;
    Button bt8;
    Button bt9;
    Button bt10;
    Button bt11;
    Button bt12;
    Button bt13;
    Button bt14;
    Button bt15;
    Button bt16;
    Button bt17;
    Button bt18;
    Button bt19;
    Button bt20;
    Button bt21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1=findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent1);
            }
        });

        bt2=findViewById(R.id.bt2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent1);
            }
        });

        bt3=findViewById(R.id.bt3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,MainActivity4.class);
                startActivity(intent1);
            }
        });

        bt4=findViewById(R.id.bt4);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,MainActivity5.class);
                startActivity(intent1);
            }
        });

        bt5=findViewById(R.id.bt5);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,MainActivity6.class);
                startActivity(intent1);
            }
        });

        bt6=findViewById(R.id.bt6);
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,MainActivity7.class);
                startActivity(intent1);
            }
        });

        bt7=findViewById(R.id.bt7);
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,MainActivity8.class);
                startActivity(intent1);
            }
        });

        bt8=findViewById(R.id.bt8);
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,MainActivity9.class);
                startActivity(intent1);
            }
        });

        bt9=findViewById(R.id.bt9);
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,MainActivity10.class);
                startActivity(intent1);
            }
        });

        bt10=findViewById(R.id.bt10);
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,MainActivity11.class);
                startActivity(intent1);
            }
        });

        bt11=findViewById(R.id.bt11);
        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,MainActivity12.class);
                startActivity(intent1);
            }
        });

        bt12=findViewById(R.id.bt12);
        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,MainActivity13.class);
                startActivity(intent1);
            }
        });

        bt13=findViewById(R.id.bt13);
        bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,MainActivity14.class);
                startActivity(intent1);
            }
        });

        bt14=findViewById(R.id.bt14);
        bt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,MainActivity15.class);
                startActivity(intent1);
            }
        });

        bt15=findViewById(R.id.bt15);
        bt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,MainActivity16.class);
                startActivity(intent1);
            }
        });

        bt16=findViewById(R.id.bt16);
        bt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,MainActivity17.class);
                startActivity(intent1);
            }
        });

        bt17=findViewById(R.id.bt17);
        bt17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,MainActivity18.class);
                startActivity(intent1);
            }
        });

        bt18=findViewById(R.id.bt18);
        bt18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,MainActivity19.class);
                startActivity(intent1);
            }
        });

        bt19=findViewById(R.id.bt19);
        bt19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,MainActivity20.class);
                startActivity(intent1);
            }
        });

        bt20=findViewById(R.id.bt20);
        bt20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,MainActivity21.class);
                startActivity(intent1);
            }
        });

        bt21=findViewById(R.id.bt21);
        bt21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,MainActivity22.class);
                startActivity(intent1);
            }
        });
    }
}
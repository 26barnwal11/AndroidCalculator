package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button0,button1,button2,button3,button4,button5,button6,
            button7,button8,button9,buttonadd,buttonsub,buttonmul,
            buttondiv,buttondot,buttonequal,buttonC;
    EditText txt;
    float mValueOne, mValuetwo;
    boolean Add,Sub,Mul,Div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0=(Button)findViewById(R.id.button0);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
        button9=(Button)findViewById(R.id.button9);
        buttondot=(Button)findViewById(R.id.buttondot);
        buttonequal=(Button)findViewById(R.id.buttonequal);
        buttonadd=(Button)findViewById(R.id.buttonadd);
        buttonsub=(Button)findViewById(R.id.buttonsub);
        buttonmul=(Button)findViewById(R.id.buttonmul);
        buttondiv=(Button)findViewById(R.id.buttondiv);
        buttonC=(Button)findViewById(R.id.buttonC);
        txt=(EditText)findViewById(R.id.Output);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+"9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+"0");
            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt==null){
                    txt.setText("");
                }
                else{
                    mValueOne=Float.parseFloat(txt.getText()+"");
                    Add=true;
                    txt.setText(null);
                }
            }
        });
        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne=Float.parseFloat(txt.getText()+"");
                Sub=true;
                txt.setText(null);
            }
        });
        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne=Float.parseFloat(txt.getText()+"");
                Mul=true;
                txt.setText(null);
            }
        });
        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne=Float.parseFloat(txt.getText()+"");
                Div=true;
                txt.setText(null);
            }
        });
        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValuetwo=Float.parseFloat(txt.getText()+"");
                if(Add==true){
                    float f=mValueOne+mValuetwo;
                    txt.setText(f+"");
                    Add=false;
                }
                if(Sub==true){
                    float f=mValueOne-mValuetwo;
                    txt.setText(f+"");
                    Sub=false;
                }
                if(Mul==true){
                    float f=mValueOne*mValuetwo;
                    txt.setText(f+"");
                    Mul=false;
                }
                if(Div==true){
                    float f=mValueOne/mValuetwo;
                    txt.setText(f+"");
                    Div=false;
                }
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText("");
            }
        });
        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(txt.getText()+".");
            }
        });
    }
}

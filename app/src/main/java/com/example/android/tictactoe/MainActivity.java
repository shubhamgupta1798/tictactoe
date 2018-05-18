package com.example.android.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public int a=0;
public int c=0;
int[] ch={0,0,0,0,0,0,0,0,0};
int [] marked={0,0,0,0,0,0,0,0,0};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void s1(View view)
    {
        if(marked[0]==0)
        {  marked[0]=1;
        try {
            c = f1();
        }catch (Exception e)
        {
            Toast.makeText(this,""+e,Toast.LENGTH_SHORT).show();
        }
        ImageButton b=(ImageButton)findViewById(R.id.button1);
        try {
            if (c == 0)
                try {
                    b.setBackgroundResource(R.drawable.cross);
                    ch[0]=-1;
                }catch (Exception e)
                {
                    Toast.makeText(this,""+e,Toast.LENGTH_SHORT).show();
                }
            else{
                b.setBackgroundResource(R.drawable.cir);
                ch[0]=1;
            }
        }catch (Exception e)
        {
            Toast.makeText(this,""+e,Toast.LENGTH_SHORT).show();
        }
            check1();
        }
        else
            return;

    }
    public void s2(View view)
    {
        if(marked[1]==0)
        {  marked[1]=1;
            c = f1();
            ImageButton b = (ImageButton) findViewById(R.id.button11);
            if (c == 0){
                b.setBackgroundResource(R.drawable.cross);
            ch[1]=-1;
            }
            else {
                b.setBackgroundResource(R.drawable.cir);
                ch[1]=1;
            }
            check1();
        }

        else
            return;
    }
    public void s3(View view)
    {
        if(marked[2]==0)
        {  marked[2]=1;
            c = f1();
            ImageButton b = (ImageButton) findViewById(R.id.button12);
            if (c == 0){
                b.setBackgroundResource(R.drawable.cross);
                ch[2]=-1;
            }
            else {
                b.setBackgroundResource(R.drawable.cir);
                ch[2]=1;
            }
            check1();
        }

        else
            return;
    }
    public void s4(View view)
    {if(marked[3]==0)
    {  marked[3]=1;
        c = f1();
        ImageButton b = (ImageButton) findViewById(R.id.button13);
        if (c == 0){
            b.setBackgroundResource(R.drawable.cross);
            ch[3]=-1;
        }
        else {
            b.setBackgroundResource(R.drawable.cir);
            ch[3]=1;
        }
        check1();
    }

    else
        return;
    }
    public void s5(View view)
    {
        if(marked[4]==0)
        {  marked[4]=1;
            c = f1();
            ImageButton b = (ImageButton) findViewById(R.id.button14);
            if (c == 0){
                b.setBackgroundResource(R.drawable.cross);
                ch[4]=-1;
            }
            else {
                b.setBackgroundResource(R.drawable.cir);
                ch[4]=1;
            }
            check1();}

        else
            return;

    }
    public void s6(View view)
    {if(marked[5]==0)
    {  marked[5]=1;
        c = f1();
        ImageButton b = (ImageButton) findViewById(R.id.button15);
        if (c == 0){
            b.setBackgroundResource(R.drawable.cross);
            ch[5]=-1;
        }
        else {
            b.setBackgroundResource(R.drawable.cir);
            ch[5]=1;
        }
        check1();}

    else
        return;

    }
    public void s7(View view)
    {if(marked[6]==0)
    {  marked[6]=1;
        c=f1();
        ImageButton b=(ImageButton)findViewById(R.id.button16);
        if (c == 0){
            b.setBackgroundResource(R.drawable.cross);
            ch[6]=-1;
        }
        else {
            b.setBackgroundResource(R.drawable.cir);
            ch[6]=1;
        }
        check1();
    }else
        return;

    }
    public void s8(View view)
    {if(marked[7]==0)
    {  marked[7]=1;
        c=f1();
        ImageButton b=(ImageButton)findViewById(R.id.button17);
        if (c == 0){
            b.setBackgroundResource(R.drawable.cross);
            ch[7]=-1;
        }
        else {
            b.setBackgroundResource(R.drawable.cir);
            ch[7]=1;
        }
        check1();

    }
    else
            return;

}
    public void s9(View view)
    {if(marked[8]==0)
    {  marked[8]=1;
        c=f1();
        ImageButton b=(ImageButton)findViewById(R.id.button18);
        if (c == 0){
            b.setBackgroundResource(R.drawable.cross);
            ch[8]=-1;
        }
        else {
            b.setBackgroundResource(R.drawable.cir);
            ch[8]=1;
        }
        check1();

    }
    else
            return;

            }
            public void clear(View view)
            {
                a=0;
                ImageButton b=(ImageButton)findViewById(R.id.button1);
                b.setBackgroundColor(getResources().getColor(R.color.grey));
                 b=(ImageButton)findViewById(R.id.button11);
                b.setBackgroundColor(getResources().getColor(R.color.grey));
                b=(ImageButton)findViewById(R.id.button12);
                b.setBackgroundColor(getResources().getColor(R.color.grey));
                b=(ImageButton)findViewById(R.id.button13);
                b.setBackgroundColor(getResources().getColor(R.color.grey));
               b=(ImageButton)findViewById(R.id.button14);
                b.setBackgroundColor(getResources().getColor(R.color.grey));
                 b=(ImageButton)findViewById(R.id.button15);
                b.setBackgroundColor(getResources().getColor(R.color.grey));
               b=(ImageButton)findViewById(R.id.button16);
                b.setBackgroundColor(getResources().getColor(R.color.grey));
              b=(ImageButton)findViewById(R.id.button17);
                b.setBackgroundColor(getResources().getColor(R.color.grey));
               b=(ImageButton)findViewById(R.id.button18);
                b.setBackgroundColor(getResources().getColor(R.color.grey));
                for(int i=0;i<9;i++)
                {marked[i]=0;
                ch[i]=0;
            }}
            public void set1()
            {
                Toast.makeText(this,"PLAYER 1 WINS",Toast.LENGTH_SHORT).show();
                for(int i=0;i<9;i++) {
                    marked[i] = 1;

                }
            }

    public void set2()
    {
        Toast.makeText(this,"PLAYER 2 WINS",Toast.LENGTH_SHORT).show();
        for(int i=0;i<9;i++)
            marked[i]=1;
    }

    public void dr()
    {
        Toast.makeText(this,"DRAW",Toast.LENGTH_SHORT).show();
    }
            public void check1()
            {

                int a1=ch[0]+ch[1]+ch[2];
                int a2=ch[3]+ch[4]+ch[5];
                int a3=ch[6]+ch[7]+ch[8];
                if(a1==3||a2==3||a3==3)
                {
                    set1();
                    return;
                }
                else if(a1==-3||a2==-3||a3==-3)
                {
                    set2();
                    return;
                }
                else
                {
                    a1=ch[0]+ch[4]+ch[8];
                    a2=ch[2]+ch[4]+ch[6];
                    if(a1==3||a2==3)
                        set1();
                    else if(a1==-3||a2==-3)
                        set2();
                    else
                    {
                        a1=ch[0]+ch[3]+ch[6];
                        a2=ch[1]+ch[4]+ch[7];
                        a3=ch[2]+ch[5]+ch[8];
                        if(a1==3||a2==3||a3==3)
                        {
                            set1();
                            return;
                        }
                        else if(a1==-3||a2==-3||a3==-3)
                        {
                            set2();
                            return;
                        }
                        else
                        {
                            if(a==9)
                                dr();
                            else
                                return;
                        }

                    }
                }
            }
    public int f1()
    {
        a++;
        if(a%2==0)
        {
            return 0;
        }
        else
            return 1;
    }


}

package adefault.mart29;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    TextView txt1;
    TextView txt2;
    TextView txt3;

    SeekBar blue;
    SeekBar green;
    SeekBar red;


    int r=0;
    int g= 0;
    int bb= 0;

            LinearLayout ly2;


    @Override
    protected void onResume() {
        super.onResume();
         r= ((Renk)this.getApplication()).getred();
         g= ((Renk)this.getApplication()).getgreen();
         bb= ((Renk)this.getApplication()).getblue();
        ly2.setBackgroundColor(Color.rgb(r,g,bb));



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ly2=(LinearLayout) findViewById(R.id.boyanacak2);

        r= ((Renk)this.getApplication()).getred();
        g= ((Renk)this.getApplication()).getgreen();
        bb= ((Renk)this.getApplication()).getblue();




        ly2.setBackgroundColor(Color.rgb(r,g,bb));

        red=(SeekBar) findViewById(R.id.red);
        green=(SeekBar) findViewById(R.id.green);
        blue=(SeekBar) findViewById(R.id.blue);

 red.setProgress(r);
        green.setProgress(g);
        blue.setProgress(bb);



        red.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
               ((Renk)Main2Activity.this.getApplication()).setred(i);
                r = i;
                ly2.setBackgroundColor(Color.rgb(r,g,bb));


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        green.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                ((Renk)Main2Activity.this.getApplication()).setgreen(i);
                g = i;
                ly2.setBackgroundColor(Color.rgb(r,g,bb));


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        blue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                ((Renk)Main2Activity.this.getApplication()).setblue(i);
                bb = i;
                ly2.setBackgroundColor(Color.rgb(r,g,bb));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });








//
//        String Deger="";
//        Deger=((MyappOrtakHavuz)this.getApplication()).GetHerhangiBirDegisken();
//

//
//        txt1=(TextView) findViewById(R.id.textView);
//        txt2=(TextView) findViewById(R.id.textView2);
//        txt3=(TextView) findViewById(R.id.textView3);
//
//
//        Intent mySecreenIntent1=getIntent();
//        Bundle b=mySecreenIntent1.getExtras();
//
//        Intent mySecreenIntent2=getIntent();
//        Bundle f=mySecreenIntent2.getExtras();
//
//        Intent mySecreenIntent3=getIntent();
//        Bundle g=mySecreenIntent3.getExtras();



//        if (b!=null)
//        {
//            String j=(String) b.get("kullanici");
//
//            txt1.setText(j);
//
//           // Toast.makeText(this,j,Toast.LENGTH_SHORT).show();
//        }
//
//
//        if (f!=null)
//        {
//            String k=(String) f.get("kullanici2");
//
//            txt2.setText(k);
//
//            // Toast.makeText(this,j,Toast.LENGTH_SHORT).show();
//        }
//
//        if (g!=null)
//        {
//            String m=(String) g.get("kullanici3");
//
//            txt3.setText(m);
//
//            // Toast.makeText(this,j,Toast.LENGTH_SHORT).show();
//        }

    }
}

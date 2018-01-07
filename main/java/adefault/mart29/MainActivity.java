package adefault.mart29;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button btn;
//    EditText edt1;
//    EditText edt2;
//    EditText edt3;
    LinearLayout ly1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn =(Button) findViewById(R.id.button2);
//        edt1=(EditText) findViewById(R.id.editText);
//        edt2=(EditText) findViewById(R.id.editText2);
//        edt3=(EditText) findViewById(R.id.editText3);


        ly1=(LinearLayout) findViewById(R.id.boyanacak);

       int r= ((Renk)this.getApplication()).getred();
        int g= ((Renk)this.getApplication()).getgreen();
        int b= ((Renk)this.getApplication()).getblue();
        ly1.setBackgroundColor(Color.rgb(r,g,b));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




             //   ((MyappOrtakHavuz)MainActivity.this.getApplication()).SetHerhangiBirDegisken();
                //onClick içinde olduğumuz için MainActivity yazdık yoksa direk this yeterdi.

               Intent myikinciEkranIntent = new Intent(getApplicationContext(),Main2Activity.class);
//
//
//                myikinciEkranIntent.putExtra("kullanici",edt1.getText().toString());
//                // kullanici key ,diğeri value .2.ekranda key değeri ile okuma yaplıacak.
//
//                myikinciEkranIntent.putExtra("kullanici2",edt2.getText().toString());
//
//                myikinciEkranIntent.putExtra("kullanici3",edt3.getText().toString());
//
//
               startActivity(myikinciEkranIntent);
            }
        });





    }

    @Override
    protected void onResume() {
        super.onResume();
        int r= ((Renk)this.getApplication()).getred();
        int g= ((Renk)this.getApplication()).getgreen();
        int b= ((Renk)this.getApplication()).getblue();
        ly1.setBackgroundColor(Color.rgb(r,g,b));
    }
}

/*
Sms Yollama:
Intent smsIntent =new Intent(Intent.ACTION_VIEW);
smsIntent.setType("vnd.android-dir/mms-sms");
smsIntent.putExtra("address","05315165196");
smsIntent.putExtra("sms_body","SELAM..");
startActivity(smsIntent);
*/
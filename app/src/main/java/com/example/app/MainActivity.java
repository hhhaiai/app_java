package com.example.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.fuzhu8.aaf.GetMainActivity;

import java.util.UUID;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        Log.i("wupan","onCreate-->superBefore");
        super.onCreate(savedInstanceState);
//        Log.i("wupan","onCreate");
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btn);

//
//        Log.i("Test", "wp1:"+String.valueOf(UUID.randomUUID()));
//        Log.i("Test", "wp2:"+String.valueOf(UUID.randomUUID()));


//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                TestUtil.test();
//
////                Intent intent = new Intent();
////                intent.setAction("com.wooyun.test");
////                intent.setPackage("com.analysys.demo");
////                MainActivity.this.startService(intent);
//
//                Intent intent = new Intent();
//                intent.setClass(MainActivity.this,TestActivity.class);
//               MainActivity.this.startActivity(intent);
//
//            }
//        });

//        Intent intent = new Intent();
//        intent.setClass(MainActivity.this,TestActivity.class);
//        MainActivity.this.startActivity(intent);

//        Log.i("wupan","onCreate-->superAfter");

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    GetMainActivity.main(new String[]{MainActivity.this.getPackageName()});
                }

            }
        }).start();


        btn.setOnClickListener(v->
                {
//                    Toast.makeText(MainActivity.this,"Test",Toast.LENGTH_LONG).show();
//                    System.out.println("Test");
//                    GetMainActivity.main(new String[]{MainActivity.this.getPackageName()});

                }
                );
    }

    @Override
    protected void onStart() {
//        Log.i("wupan","onStrat-->before");
        super.onStart();
//        Log.i("wupan","onStart");

//        Log.i("wupan","onStart-->after");
    }
}
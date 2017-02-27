package com.example.hopjs.fragmentlifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
/*目的：了解以fragment控件加载fragment时，fragment和activity生命周期之间的关系
* 操作：打开activity，关闭activity
* 结果;
* 02-27 20:56:08.086 24126-24126/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: FragmentOne:onAttach,ThreadId:24126
02-27 20:56:08.086 24126-24126/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: FragmentOne:onCreate,ThreadId:24126
02-27 20:56:08.086 24126-24126/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: FragmentOne:onCreateView,ThreadId:24126
02-27 20:56:08.087 24126-24126/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: FragmentOne:onViewCreated,ThreadId:24126
02-27 20:56:08.088 24126-24126/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: MainActivity:onCreate,ThreadId:24126
02-27 20:56:08.090 24126-24126/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: FragmentOne:onActivityCreated,ThreadId:24126
02-27 20:56:08.090 24126-24126/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: FragmentOne:onViewStateRestored,ThreadId:24126
02-27 20:56:08.090 24126-24126/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: FragmentOne:onStart,ThreadId:24126
02-27 20:56:08.090 24126-24126/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: MainActivity:onStart,ThreadId:24126
02-27 20:56:08.091 24126-24126/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: MainActivity:onResume,ThreadId:24126
02-27 20:56:08.091 24126-24126/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: FragmentOne:onResume,ThreadId:24126
02-27 20:56:33.995 24126-24126/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: FragmentOne:onPause,ThreadId:24126
02-27 20:56:33.995 24126-24126/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: MainActivity:onPause,ThreadId:24126
02-27 20:56:34.320 24126-24126/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: FragmentOne:onStop,ThreadId:24126
02-27 20:56:34.320 24126-24126/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: MainActivity:onStop,ThreadId:24126
02-27 20:56:34.321 24126-24126/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: FragmentOne:onDestroy,ThreadId:24126
02-27 20:56:34.321 24126-24126/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: FragmentOne:onDetach,ThreadId:24126
02-27 20:56:34.321 24126-24126/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: MainActivity:onDestroy,ThreadId:24126
* 目的：了解在oncreate中动态创建fragment时，fragment与activity的生命周期关系
* 操作：开启activity，关闭activity
* 结果：
* 02-27 21:08:34.061 29360-29360/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: MainActivity222:onCreate,ThreadId:29360
02-27 21:08:34.092 29360-29360/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: FragmentOne:onAttach,ThreadId:29360
02-27 21:08:34.092 29360-29360/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: FragmentOne:onCreate,ThreadId:29360
02-27 21:08:34.092 29360-29360/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: FragmentOne:onCreateView,ThreadId:29360
02-27 21:08:34.094 29360-29360/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: FragmentOne:onViewCreated,ThreadId:29360
02-27 21:08:34.094 29360-29360/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: FragmentOne:onActivityCreated,ThreadId:29360
02-27 21:08:34.094 29360-29360/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: FragmentOne:onViewStateRestored,ThreadId:29360
02-27 21:08:34.094 29360-29360/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: FragmentOne:onStart,ThreadId:29360
02-27 21:08:34.094 29360-29360/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: MainActivity222:onStart,ThreadId:29360
02-27 21:08:34.094 29360-29360/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: MainActivity222:onResume,ThreadId:29360
02-27 21:08:34.094 29360-29360/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: FragmentOne:onResume,ThreadId:29360
02-27 21:09:34.847 29360-29360/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: FragmentOne:onPause,ThreadId:29360
02-27 21:09:34.847 29360-29360/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: MainActivity222:onPause,ThreadId:29360
02-27 21:09:35.187 29360-29360/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: FragmentOne:onStop,ThreadId:29360
02-27 21:09:35.187 29360-29360/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: MainActivity222:onStop,ThreadId:29360
02-27 21:09:35.189 29360-29360/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: FragmentOne:onDestroy,ThreadId:29360
02-27 21:09:35.190 29360-29360/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: FragmentOne:onDetach,ThreadId:29360
02-27 21:09:35.190 29360-29360/com.example.hopjs.fragmentlifecycle I/MainActivityTTTT: MainActivity222:onDestroy,ThreadId:29360*/
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showMessage("onCreate");
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        showMessage("onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        showMessage("onRestoreInstanceState");
    }

    @Override
    protected void onStart() {
        super.onStart();
        showMessage("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showMessage("onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showMessage("onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showMessage("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showMessage("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showMessage("onDestroy");
    }

    private void showMessage(String msg){
        Log.i("MainActivityTTTT","MainActivity:"+msg+",ThreadId:"+android.os.Process.myTid());
    }

}

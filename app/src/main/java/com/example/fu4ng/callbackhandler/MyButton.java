package com.example.fu4ng.callbackhandler;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;


public class MyButton extends android.support.v7.widget.AppCompatButton{
    Context ctx;
    public MyButton(Context context , AttributeSet set){
        super(context , set);
        ctx=context;
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        super.onKeyDown(keyCode , event);
        Log.d("com.sise" , "the onKeyDown in MyButton");
        Toast.makeText(ctx,"the onKeyDown in MyButton",Toast.LENGTH_LONG).show();
        //返回true，表明该事件不会向外扩散
        return true;
    }
}
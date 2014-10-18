package com.example.onkeydemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView tv;
    CheckBox cb;
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView) findViewById(R.id.textView1);
        cb=(CheckBox) findViewById(R.id.checkBox1);
        et=(EditText) findViewById(R.id.editText1);
        et.setOnKeyListener(new OnKeyListener() {
			
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				int metaState = event.getMetaState();
		        int unicodeChar = event.getUnicodeChar();
		        String msg="";
		        msg +="按键动作:" + String.valueOf(event.getAction())+"\n";
		        msg +="按键代码:" + String.valueOf(keyCode)+"\n";
		        msg +="按键字符:" + (char)unicodeChar+"\n";
		        msg +="UNICODE:" + String.valueOf(unicodeChar)+"\n";
		        msg +="重复次数:" + String.valueOf(event.getRepeatCount())+"\n";
		        msg +="功能键状态:" + String.valueOf(metaState)+"\n";
		        msg +="硬件编码:" + String.valueOf(event.getScanCode())+"\n";
		        msg +="按键标志:" + String.valueOf(event.getFlags())+"\n";
		        tv.setText(msg);
		        if (cb.isChecked()){return true;}else{

				return false;}
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

package com.example.nayantiwari.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        TextView textView1 = (TextView) findViewById(R.id.menu_item_1);
        String menuItem1 = textView1.getText().toString();
        Log.v("MainActivity", menuItem1);

        TextView textView2 = (TextView) findViewById(R.id.menu_item_2);
        String menuItem2 = textView2.getText().toString();
        Log.v("MainActivity", menuItem2);

        TextView textView3 = (TextView) findViewById(R.id.menu_item_3);
        String menuItem3 = textView3.getText().toString();
        Log.v("MainActivity", menuItem3);

    }
}
package com.example.jmush.android_session9_assignment_91;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= (TextView) findViewById(R.id.textview);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.red:
                textView.setTextColor(getResources().getColor(R.color.red));
                break;
            case R.id.green:
                textView.setTextColor(getResources().getColor(R.color.green));
                break;
            case R.id.blue:
                textView.setTextColor(getResources().getColor(R.color.blue));
                break;
            default:
                return super.onOptionsItemSelected(item);

        }
        return true;
    }
}

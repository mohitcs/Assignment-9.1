package com.example.mohit.assignment_91;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    TextView lblshow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar();
        lblshow= (TextView)findViewById(R.id.lblshow);
        lblshow.setTextColor(Color.BLUE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater M=getMenuInflater();
        M.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        Context context = this;

        if (id == R.id.btnblue) {


            lblshow.setTextColor(Color.BLUE);
            return true;

        }else if (id == R.id.btngreen) {

            lblshow.setTextColor(Color.GREEN);
            return true;

        }else if (id == R.id.btnred) {

            lblshow.setTextColor(Color.RED);
            return true;
        }

       // return super.onOptionsItemSelected(item);

return true;
    }
}

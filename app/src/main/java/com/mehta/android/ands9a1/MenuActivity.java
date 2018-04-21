package com.mehta.android.ands9a1;

import android.content.ClipData;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    TextView txtColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        txtColor = findViewById(R.id.txtColor);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.stringRedColor) {
            Toast.makeText(this, "Red", Toast.LENGTH_SHORT).show();
            txtColor.setTextColor(Color.RED);
            return true;
        }
        else if(id == R.id.stringBlueColor) {
            Toast.makeText(this, "Blue", Toast.LENGTH_SHORT).show();
            txtColor.setTextColor(Color.BLUE);
            return true;
        }
        else if (id == R.id.stringGreenColor){
            Toast.makeText(this, "Green", Toast.LENGTH_SHORT).show();
            txtColor.setTextColor(Color.GREEN);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

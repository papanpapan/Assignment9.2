package com.example.amit.assignment92;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int Computer=0;
    public static final int Gamepad=1;
    public static final int Camera=2;
    public static final int Vedio=3;
    public static final int Email=4;
    public static final int Phone=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(menu.NONE,Computer,menu.NONE,"Computer");
        menu.add(menu.NONE,Gamepad,menu.NONE,"Gamepad");
        menu.add(menu.NONE,Camera,menu.NONE,"Camera");
        menu.add(menu.NONE,Vedio,menu.NONE,"Vedio");
        menu.add(menu.NONE,Email,menu.NONE,"Email");
        MenuItem item=menu.add(menu.NONE,Phone,menu.NONE,"Phone");
        item.setIcon(R.drawable.ic_stay_current_portrait_black_24dp);
        item.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==Computer) {
            Toast.makeText(this, "Click On Computer", Toast.LENGTH_SHORT).show();
        } else if(id==Gamepad) {
            Toast.makeText(this, "Click On Gamepad", Toast.LENGTH_SHORT).show();
        }else if(id==Camera) {
            Toast.makeText(this, "Click On Camera", Toast.LENGTH_SHORT).show();
        }else if(id==Vedio) {
            Toast.makeText(this, "Click On Vedio", Toast.LENGTH_SHORT).show();
        }else if(id==Email) {
            Toast.makeText(this, "Click On Email", Toast.LENGTH_SHORT).show();
        }else if(id==Phone){
            Toast.makeText(this, "Click On Phone", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}

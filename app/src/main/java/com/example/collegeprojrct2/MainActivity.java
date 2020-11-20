package com.example.collegeprojrct2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.collegeprojrct2.R;
import com.example.collegeprojrct2.fragments.firstfragment;
import com.example.collegeprojrct2.fragments.stack;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;
    Toolbar toolbar;
    //for fragment
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar= findViewById(R.id.toolbarr);
        navigationView=findViewById(R.id.navigationview);
        drawerLayout = findViewById(R.id.drawer);
        linearLayout=findViewById(R.id.liearlay);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Data Structures");
        navigationView.setNavigationItemSelectedListener(this);


        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.setDrawerIndicatorEnabled(true);
        toggle.syncState();

    }




    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawerLayout.closeDrawer(GravityCompat.START);
        switch(item.getItemId()){
            case R.id.bise :
                Toast.makeText(this,"clicked bineary search",Toast.LENGTH_LONG).show();
                firstfragment firstfragment=new firstfragment();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.liearlay,firstfragment);
                transaction.commit();

                break;
            
            case R.id.buso:
                Toast.makeText(this,"clicked bubble sort",Toast.LENGTH_LONG).show();


                bubble_sort_fragment bubbleSortFragment=new bubble_sort_fragment();
                FragmentTransaction transactionn=getSupportFragmentManager().beginTransaction();
                transactionn.replace(R.id.liearlay,bubbleSortFragment);
                transactionn.commit();
                break;

            case R.id.crst:
                Toast.makeText(this,"creating stack",Toast.LENGTH_LONG).show();
                stack stack=new stack();
                FragmentTransaction transactionnn=getSupportFragmentManager().beginTransaction();
                transactionnn.replace(R.id.liearlay,stack);
                transactionnn.commit();
                break;
            default:
                Toast.makeText(this,"notmached",Toast.LENGTH_LONG).show();

        }
        return false;
    }
}
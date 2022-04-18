package com.foysaldev.androidgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    int [] districticon;
    String [] districtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        districtName = getResources().getStringArray(R.array.mymensingh_district);
        gridView = findViewById(R.id.gridViewId);

        districticon = new int[]{R.drawable.bhaluka, R.drawable.trishal, R.drawable.haluaghat,
                R.drawable.muktagacha, R.drawable.dhobaura, R.drawable.fulbaria, R.drawable.gaffargaon, R.drawable.gauripur,
                R.drawable.ishwarganj, R.drawable.mymensingh_sadar, R.drawable.nandail, R.drawable.
                phulpur, R.drawable.tarakhanda};

        CustomAdapter adapter = new CustomAdapter(this,districtName,districticon);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String value = districtName[i];
                Toast.makeText(MainActivity.this, ""+value, Toast.LENGTH_SHORT).show();

            }
        });

    }
}
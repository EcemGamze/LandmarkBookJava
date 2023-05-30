package com.ecemgamzecuhadar.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.ecemgamzecuhadar.landmarkbookjava.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    ArrayList<Landmark> landmarksArrayList;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        landmarksArrayList = new ArrayList<>();

        //Data
        Landmark pisa = new Landmark("Pisa", "Italy", R.drawable.pisa);
        Landmark trevi = new Landmark("Trevi", "Italy", R.drawable.trevi);
        Landmark duomo = new Landmark("Duomo", "Italy", R.drawable.duomo);
        Landmark colosseum = new Landmark("Colosseum", "Italy", R.drawable.colosseum);

        landmarksArrayList.add(pisa);
        landmarksArrayList.add(trevi);
        landmarksArrayList.add(duomo);
        landmarksArrayList.add(colosseum);

        //Not Efficeient
         //Bitmap


        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarksArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);

        /*
        //Adapter
        //ListView

        //mapping

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                landmarksArrayList.stream().map(landmark -> landmark.name).collect(Collectors.toList())
        );
        binding.listView.setAdapter(arrayAdapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this,landmarksArrayList.get(position).name,Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,DetalisActivity.class);
                intent.putExtra("landmark",landmarksArrayList.get(position));
                startActivity(intent);
            }
        });

         */
    }

}
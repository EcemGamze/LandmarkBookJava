package com.ecemgamzecuhadar.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ecemgamzecuhadar.landmarkbookjava.databinding.ActivityDetalisBinding;

public class DetalisActivity extends AppCompatActivity {
    private ActivityDetalisBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetalisBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //Intent intent = getIntent();
        //Casting
        //Landmark selectedLandmark = (Landmark) intent.getSerializableExtra("landmark");

        Singleton singleton = Singleton.getInstance();
        Landmark selectedLandmark = singleton.getSentLandmark();


        binding.nameText.setText(selectedLandmark.name);
        binding.countryText.setText(selectedLandmark.country);
        binding.imageView.setImageResource(selectedLandmark.image);
    }
}
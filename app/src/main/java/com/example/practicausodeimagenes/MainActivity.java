package com.example.practicausodeimagenes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.databinding.tool.reflection.ModelClass;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btnSitioWeb;
    RecyclerView recyclerView;
    List<ModelClass> list;
    ImageSlider imageSlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageSlider = findViewById(R.id.image_slider);
        recyclerView = findViewById(R.id.recyclerview_Id);

        ArrayList<SlideModel> arrayList = new ArrayList<>();

        arrayList.add(new SlideModel(R.drawable.img01, ScaleTypes.CENTER_INSIDE));
        arrayList.add(new SlideModel(R.drawable.img02, ScaleTypes.CENTER_INSIDE));
        arrayList.add(new SlideModel(R.drawable.img03, ScaleTypes.CENTER_INSIDE));
        arrayList.add(new SlideModel(R.drawable.img04, ScaleTypes.CENTER_INSIDE));
        arrayList.add(new SlideModel(R.drawable.img05, ScaleTypes.CENTER_INSIDE));
        arrayList.add(new SlideModel(R.drawable.img06, ScaleTypes.CENTER_INSIDE));

        imageSlider.setImageList(arrayList);

        btnSitioWeb = (Button) findViewById(R.id.btnSitioWeb);

        btnSitioWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.hbo.com/the-last-of-us");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}
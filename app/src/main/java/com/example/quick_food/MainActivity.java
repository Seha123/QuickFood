package com.example.quick_food;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView mRecycleView;
    List<FoodData> myFoodList;
    FoodData mFoodData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecycleView = (RecyclerView)findViewById(R.id.recycleView);


        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this,1);
        mRecycleView.setLayoutManager(gridLayoutManager);

        myFoodList = new ArrayList<>();

        mFoodData = new FoodData( "Chicken Noodles", "Noodles isisisisisis shshshshshsh huhhdhduuhsus dbhbeuwfyewufvyewufyv", "Rs.150",R.drawable.image1 );
        myFoodList.add(mFoodData);

        mFoodData = new FoodData( "Fryed Rice", "Fryed rice xoxoxoxoxo dwdowdhwoidhoiqwdhqwddwdx", "Rs.200",R.drawable.image2 );
        myFoodList.add(mFoodData);

        mFoodData = new FoodData( "Chicken Koththu", "Koththu PPPpssjsjsjsjjsjsjsjsjsjsjsjsjsjsjs", "Rs.200",R.drawable.image3 );
        myFoodList.add(mFoodData);

        mFoodData = new FoodData( "Chicken bunns", "Bunns xoxoxoxoxox", "Rs.100",R.drawable.image4 );

        myFoodList.add(mFoodData);


        MyAdapter myAdapter = new MyAdapter(MainActivity.this,myFoodList);
        mRecycleView.setAdapter(myAdapter);



    }



}

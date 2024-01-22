package com.example.mygallery.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mygallery.AdaptadorGallery;
import com.example.mygallery.ItemGallery;
import com.example.mygallery.R;

import java.util.ArrayList;
import java.util.List;


public class nav_gallery extends Fragment {

    private RecyclerView gRecyclerView;
    private AdaptadorGallery gAdapter;


    public nav_gallery() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RecyclerView recyclerView = gRecyclerView.findViewById(R.id.recyclerViewGallery);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        String accept = "Accept";
        String cancel = "Cancel";
        ItemGallery ig = new ItemGallery( R.drawable.image1, "Card 1", accept, cancel);
        ItemGallery ig2 = new ItemGallery( R.drawable.image2, "Card 2", accept, cancel);
        ItemGallery ig3 = new ItemGallery( R.drawable.image3, "Card 3", accept, cancel);
        ItemGallery ig4 = new ItemGallery( R.drawable.image4, "Card 4", accept, cancel);
        ItemGallery ig5 = new ItemGallery( R.drawable.image5, "Card 5", accept, cancel);
        ItemGallery ig6 = new ItemGallery( R.drawable.image6, "Card 6", accept, cancel);
        ItemGallery ig7 = new ItemGallery( R.drawable.image7, "Card 7", accept, cancel);
        ItemGallery ig8 = new ItemGallery( R.drawable.image8, "Card 8", accept, cancel);
        ItemGallery ig9 = new ItemGallery( R.drawable.image9, "Card 9", accept, cancel);

        List<ItemGallery> datosGallery = new ArrayList<>();
        datosGallery.add(ig);
        datosGallery.add(ig2);
        datosGallery.add(ig3);
        datosGallery.add(ig4);
        datosGallery.add(ig5);
        datosGallery.add(ig6);
        datosGallery.add(ig7);
        datosGallery.add(ig8);
        datosGallery.add(ig9);

        AdaptadorGallery adapter = new AdaptadorGallery(datosGallery);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_nav_gallery, container, false);
    }
}
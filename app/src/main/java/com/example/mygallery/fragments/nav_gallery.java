package com.example.mygallery.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.mygallery.AdaptadorGallery;
import com.example.mygallery.ItemGallery;
import com.example.mygallery.R;

import java.util.ArrayList;
import java.util.List;


public class nav_gallery extends Fragment {

    private RecyclerView gRecyclerView;
    private AdaptadorGallery gAdapter;
    private ImageView imageView;
    private List<ItemGallery> datosGallery = new ArrayList<ItemGallery>(){
        {
            add(new ItemGallery(R.drawable.image1, "Card 1", "Accept", "Cancel"));
            add(new ItemGallery(R.drawable.image2, "Card 2", "Accept", "Cancel"));
            add(new ItemGallery(R.drawable.image3, "Card 3", "Accept", "Cancel"));
            add(new ItemGallery(R.drawable.image4, "Card 4", "Accept", "Cancel"));
            add(new ItemGallery(R.drawable.image5, "Card 5", "Accept", "Cancel"));
            add(new ItemGallery(R.drawable.image6, "Card 6", "Accept", "Cancel"));
            add(new ItemGallery(R.drawable.image7, "Card 7", "Accept", "Cancel"));
            add(new ItemGallery(R.drawable.image8, "Card 8", "Accept", "Cancel"));
            add(new ItemGallery(R.drawable.image9, "Card 9", "Accept", "Cancel"));
        }
    };

    public nav_gallery() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    // Método llamado cuando se selecciona un elemento del menú contextual

   /* public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
        return true;
    }
    @Override
    public boolean onContextItemSelected(ItemGallery item) {
        String itemId = item.getCardNum();
        if (itemId == R.id.action_share) {
            // Lógica para compartir
            return true;
        } else if (itemId == R.id.action_delete) {
            // Lógica para eliminar
            return true;
        } else {
            return super.onContextItemSelected(item);
        }
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_nav_gallery, container, false);

        gRecyclerView = view.findViewById(R.id.recyclerViewGallery);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        gRecyclerView.setLayoutManager(layoutManager);

       /* AdaptadorGallery adapter = new AdaptadorGallery(datosGallery);
        gRecyclerView.setAdapter(adapter);*/


        //Definir el menu que inflamos para la imagen
        /*imageView.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {
            @Override
            public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
                getMenuInflater().inflate(R.menu.context_menu, menu);
            }
        });
        // Agregar un clic para abrir el menú contextual
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openContextMenu(v);
            }
        });*/
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        gRecyclerView =  requireView().findViewById(R.id.recyclerViewGallery);
        gRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        gAdapter = new AdaptadorGallery(datosGallery);

        gRecyclerView.setAdapter(gAdapter);
    }
}
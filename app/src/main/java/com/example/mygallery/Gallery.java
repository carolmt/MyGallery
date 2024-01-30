package com.example.mygallery;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Gallery extends AppCompatActivity {

    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery_item);
        imageView = findViewById(R.id.galleryImg);
        //Definir el menu que inflamos para la imagen
        imageView.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {
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
        });
    }
    // Método llamado cuando se selecciona un elemento del menú contextual
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.action_share) {
            // Lógica para compartir
            return true;
        } else if (itemId == R.id.action_delete) {
            // Lógica para eliminar
            return true;
        } else if (itemId == R.id.action_edit) {
            // Lógica para editar
            return true;
        }

        else {
            return super.onContextItemSelected(item);
        }
    }



}

package com.example.parcial_3_java.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parcial_3_java.Adaptor.CategoryAdaptor;
import com.example.parcial_3_java.Adaptor.PopularAdaptor;
import com.example.parcial_3_java.Domain.CategoryDomain;
import com.example.parcial_3_java.Domain.FoodDomain;
import com.example.parcial_3_java.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class
MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapter, adapter2;
    private RecyclerView recyclerViewCategoryList,recyclerViewPopularList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCategory();
        recyclerViewPopular();
        BottomNavigation();
    }

    private void BottomNavigation() {
        FloatingActionButton floatingActionButton = findViewById(R.id.cartBtn);
        //LinearLayout homeBtn = findViewById(R.id.home_Btn);
        LinearLayout profileBtn = findViewById(R.id.Profile_Btn);
        ImageView image_usuario =  findViewById(R.id.imageView_usuario);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CartListActivity.class));
            }
        });

        image_usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginIntroActivity.class));
            }
        });
        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginIntroActivity.class));
            }
        });
    }
    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategoryList = findViewById(R.id.recyclerView);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> category=new ArrayList<>();
        category.add((new CategoryDomain("Constucción","cat_1")));
        category.add((new CategoryDomain("Ferretería", "cat_2")));
        category.add((new CategoryDomain("Electricidad", "cat_3")));
        category.add((new CategoryDomain("Herramientas", "cat_4")));
        category.add((new CategoryDomain("Pinturas y complementos", "cat_5")));

        adapter = new CategoryAdaptor(category);
        recyclerViewCategoryList.setAdapter(adapter);
    }
    private void recyclerViewPopular(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewPopularList=findViewById(R.id.recyclerView2);
        recyclerViewPopularList.setLayoutManager(linearLayoutManager);

        ArrayList<FoodDomain> foodList = new ArrayList<>();

        foodList.add(new FoodDomain("Cemento Holcim 42.5k", "cemento_holcim_42_5k", "Contiene 42.5kges un cemento para trabajos de albañilería; es recomendado para repellos, afinados, pegamento de ladrillos, bloques, tubos o cerámica. además, puede ser utilizado para construcción de aceras y cunetas", 9.76));
        foodList.add(new FoodDomain("Cinta métrica magnético 5 m x 19 mm (3/4\")", "cinta_metrica5m_x19m", "Cinta métrica magnético 5 m x 19 mm (3/4\").\n" +
                "-Fabricado en resina de ABS con protección de caucho\n" +
                "-Cinta amarilla impresa por ambos lados\n" +
                "-Impresión con tres escalas: centímetros, pulgadas y pies\n" +
                "-1 freno de seguro\n" +
                "-Gancho doble de acero inoxidable\n", 8.79));
        foodList.add(new FoodDomain("Cable usb-c 1mt  argom", "cable_usb_c_1mt", "Cable usb-c 1mt negro argom. Cable usb c de 1mt para traferencia de datos, carga, color negro, argom", 3.4));

        adapter2 = new PopularAdaptor(foodList);
        recyclerViewPopularList.setAdapter(adapter2);

    }
}
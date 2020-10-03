package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        POKEMON Charizard = new POKEMON("Charizard",R.drawable.charizard,84,78,534);
        POKEMON sqirtle = new POKEMON("sqirtle",R.drawable.squirtle,48,65,314);
        POKEMON blastoise = new POKEMON("blastoise",R.drawable.blastoise,83,100,530);

        ArrayList<POKEMON> POKEBALL = new ArrayList<>();

       POKEBALL.add(Charizard);
        POKEBALL.add(sqirtle);
        POKEBALL.add(blastoise);











    }
}
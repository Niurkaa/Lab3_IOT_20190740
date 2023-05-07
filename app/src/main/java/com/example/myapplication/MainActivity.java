package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.myapplication.clases.Registrar;
import com.example.myapplication.databinding.ActivityMainBinding;
import com.example.myapplication.viewmodel.Mascotaviewmodel;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding Binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(Binding.getRoot());
        getSupportActionBar().setTitle("Ambulacias Mascotín");
        Registrar mascota= new Registrar();
        Mascotaviewmodel mascotaviewmodel= new ViewModelProvider(this).get(Mascotaviewmodel.class);
        mascotaviewmodel.getGuardarRegistro().setValue(mascota);

    }
}
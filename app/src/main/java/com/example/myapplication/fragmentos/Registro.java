package com.example.myapplication.fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.clases.Registrar;
import com.example.myapplication.databinding.FragmentRegistroBinding;
import com.example.myapplication.viewmodel.Mascotaviewmodel;

public class Registro extends Fragment {


    FragmentRegistroBinding Binding;

    public Registro() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Binding= FragmentRegistroBinding.inflate(inflater,container,false);
        Mascotaviewmodel mascotaviewmodel = new ViewModelProvider(requireActivity()).get(Mascotaviewmodel.class);
        NavController navController= NavHostFragment.findNavController(Registro.this);
        Binding.Registrar.setOnClickListener(view-> {
            Registrar mascota = mascotaviewmodel.getGuardarRegistro().getValue();
            mascota.setNombreMascota(Binding.nombredeMascota.getText().toString());
            mascota.setGenero(Binding.genero.getSelectedItem().toString());
            mascota.setDni(Binding.dni.getText().toString());
            mascota.setNombreDueno(Binding.NombreDueno.getText().toString());
            mascota.setDescripcion(Binding.descripcion.getText().toString());
            mascotaviewmodel.getGuardarRegistro().postValue(mascota);

            navController.navigate(R.id.action_registro_to_main);
        });

        return Binding.getRoot();
    }
}
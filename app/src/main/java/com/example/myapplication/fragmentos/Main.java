package com.example.myapplication.fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.clases.Registrar;
import com.example.myapplication.databinding.FragmentMainBinding;
import com.example.myapplication.viewmodel.Mascotaviewmodel;

public class Main extends Fragment {

    FragmentMainBinding Binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Binding=FragmentMainBinding.inflate(inflater,container,false);
        NavController navController= NavHostFragment.findNavController(Main.this);
        Binding.Registro.setOnClickListener(view-> {
            navController.navigate(R.id.action_main_to_registro);
        });
        Binding.Emergencia.setOnClickListener(view-> {
            navController.navigate(R.id.action_main_to_emergencia);
        });
        Binding.Historial.setOnClickListener(view-> {
            navController.navigate(R.id.action_main_to_historial);
        });
        Mascotaviewmodel mascotaviewmodel = new ViewModelProvider(requireActivity()).get(Mascotaviewmodel.class);
        mascotaviewmodel.getGuardarRegistro().observe(getViewLifecycleOwner(), new Observer<Registrar>() {
            @Override
            public void onChanged(Registrar registrar) {
                Log.d("mascotacreada",""+registrar.getNombreMascota());
            }
        });
        return Binding.getRoot();

    }


}
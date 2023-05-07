package com.example.myapplication.fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.Adaptador.Adaptador;
import com.example.myapplication.R;
import com.example.myapplication.clases.HistorialDTO;
import com.example.myapplication.clases.Registrar;
import com.example.myapplication.databinding.FragmentHistorialBinding;
import com.example.myapplication.databinding.FragmentRegistroBinding;

import java.util.ArrayList;
import java.util.List;

public class Historial extends Fragment {
    FragmentHistorialBinding Binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Binding= FragmentHistorialBinding.inflate(inflater,container,false);
        List<HistorialDTO> hist = new ArrayList<>();
        HistorialDTO historialDTO = new HistorialDTO();
        Registrar registrar = new Registrar();
        registrar.setNombreMascota("Peluche");
        registrar.setGenero("masculino");
        registrar.setNombreDueno("Alonso");
        registrar.setDni("25865489");
        registrar.setDescripcion("intoxicación");
        historialDTO.setRuta("Lince-Lince");
        historialDTO.setMascotas(registrar);


        HistorialDTO historial1 = new HistorialDTO();
        Registrar registro1 = new Registrar();
        registro1.setNombreMascota("Maria Antonieta");
        registro1.setGenero("femenino");
        registro1.setNombreDueno("Maria");
        registro1.setDni("08104081");
        registro1.setDescripcion("parto");
        historial1.setRuta("Jesús María -Lince");
        historial1.setMascotas(registro1);

        HistorialDTO historial2 = new HistorialDTO();
        Registrar registro2 = new Registrar();
        registro2.setNombreMascota("Candy");
        registro2.setGenero("femenino");
        registro2.setNombreDueno("Aracelli");
        registro2.setDni("46285087");
        registro2.setDescripcion("Dolor cadera");
        historial2.setRuta("San Isidro -Lince");
        historial2.setMascotas(registro1);

        HistorialDTO historial3 = new HistorialDTO();
        Registrar registro3 = new Registrar();
        registro3.setNombreMascota("Maria Antonieta");
        registro3.setGenero("femenino");
        registro3.setNombreDueno("Maria");
        registro3.setDni("08104081");
        registro3.setDescripcion("parto");
        historial3.setRuta("Jesús María -Lince");
        historial3.setMascotas(registro1);

        hist.add(historialDTO);
        hist.add(historial1);
        hist.add(historial2);
        hist.add(historial3);

        Adaptador adaptador = new Adaptador();
        adaptador.setContext(getContext());
        adaptador.setLista(hist);
        Binding.historial.setAdapter(adaptador);
        Binding.historial.setLayoutManager(new LinearLayoutManager(getContext()));



        return Binding.getRoot();

    }
}
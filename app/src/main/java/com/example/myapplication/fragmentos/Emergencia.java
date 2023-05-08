package com.example.myapplication.fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentEmergenciaBinding;

import java.util.HashSet;


public class Emergencia extends Fragment {

    FragmentEmergenciaBinding binding;
    private CountDownTimer contador;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentEmergenciaBinding.inflate(inflater, container, false);

        binding.textView9.setVisibility(View.INVISIBLE);
        binding.min.setVisibility(View.INVISIBLE);
        binding.calcular.setOnClickListener(view -> {
            binding.textView9.setVisibility(View.VISIBLE);
            binding.min.setVisibility(View.VISIBLE);
            String origen = binding.origenSelect.getSelectedItem().toString();
            int minutos = 0;
            if(origen.equals("Lince")){
                minutos = 10;
            } else if (origen.equals("San Isidro") ){
                minutos = 15;
            }else if(origen.equals("Jesús María")) {
                minutos= 25;
            } else if (origen.equals("Magdalena")) {
                minutos= 20;
            }
            contador = new CountDownTimer(minutos*60000, 1000) {
                @Override
                public void onTick(long l) {
                    long seconds = l/1000;
                    long minutes = seconds/60;
                    String time = String.format("%02d:%02d",minutes, seconds%60);
                    binding.min.setText(time);
                }

                @Override
                public void onFinish() {
                    binding.min.setText("00:00");
                }
            };
            contador.start();
        });



        return binding.getRoot();
    }
}
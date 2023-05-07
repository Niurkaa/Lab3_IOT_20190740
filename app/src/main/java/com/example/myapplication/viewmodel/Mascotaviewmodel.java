package com.example.myapplication.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication.clases.Registrar;

public class Mascotaviewmodel extends ViewModel {
    private MutableLiveData<Registrar> guardarRegistro = new MutableLiveData<>();

    public MutableLiveData<Registrar> getGuardarRegistro() {
        return guardarRegistro;
    }
}

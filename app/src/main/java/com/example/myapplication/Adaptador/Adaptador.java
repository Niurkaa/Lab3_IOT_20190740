package com.example.myapplication.Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.clases.HistorialDTO;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.HistorialVH>{

    private List<HistorialDTO>  lista;
    private Context context;

    @NonNull
    @Override
    public HistorialVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.miniview,parent,false);
        return new HistorialVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HistorialVH holder, int position) {
        HistorialDTO histo= lista.get(position);
        holder.historialDTO=histo;
        TextView nombreMascota=holder.itemView.findViewById(R.id.mascota);
        TextView genero =holder.itemView.findViewById(R.id.genero);
        TextView dueno = holder.itemView.findViewById(R.id.dueno);
        TextView dni =holder.itemView.findViewById(R.id.dni);
        TextView descripcion =holder.itemView.findViewById(R.id.descripcion);
        TextView ruta =holder.itemView.findViewById(R.id.ruta);
        nombreMascota.setText(histo.getMascotas().getNombreMascota());
        genero.setText(histo.getMascotas().getGenero());
        dueno.setText(histo.getMascotas().getNombreDueno());
        dni.setText(histo.getMascotas().getDni());
        descripcion.setText(histo.getMascotas().getDescripcion());
        ruta.setText(histo.getRuta());
    }

    @Override
    public int getItemCount() {

        return lista.size();
    }

    public class HistorialVH extends RecyclerView.ViewHolder {
        HistorialDTO historialDTO;
        public HistorialVH(@NonNull View itemView) {
            super(itemView);
        }
    }


    public List<HistorialDTO> getLista() {
        return lista;
    }

    public void setLista(List<HistorialDTO> lista) {
        this.lista = lista;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}

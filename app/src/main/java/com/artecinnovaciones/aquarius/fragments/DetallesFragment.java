package com.artecinnovaciones.aquarius.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.artecinnovaciones.aquarius.R;
import com.artecinnovaciones.aquarius.adapters.DetallesAdapter;
import com.artecinnovaciones.aquarius.objetos.DetallesItem;
import com.artecinnovaciones.aquarius.utilidades.CustomItemClickListener;
import com.artecinnovaciones.aquarius.utilidades.ViewUtil;

import java.util.ArrayList;

/**
 * Created by LAP-NIDIA on 16/06/2016.
 */
public class DetallesFragment extends Fragment {

    RecyclerView rv;
    ArrayList<DetallesItem> listD;
    String tipo;

    public DetallesFragment(String tipo){ this.tipo=tipo;}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detalles, container, false);
        metodo(view);
        return view;
    }

    public void metodo(View view){
        listD = new ArrayList<DetallesItem>();
        if (tipo.equals("salada")){
            salada();
        }else {
            dulce();
        }

        rv = ViewUtil.findViewById(view, R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        initializeAdapter();
    }

    private void dulce(){
        listD.add(new DetallesItem("Peces de agua dulce", "Existe una gran variedad de peces de agua dulce para elegir cuando estás construyendo y habitando un acuario; dependiendo del tamaño y del equipamiento que instale algunos peces se adaptarán mejores que otros."));
        listD.add(new DetallesItem("Cuidados", "A la hora de montar un acuario es posible que únicamente desee tener especies de peces de agua dulce en él, sin embargo, no todos viven bajo las mismas condiciones, ya que existen peces de agua fría así como peces de agua caliente"));
        listD.add(new DetallesItem("Enfermedades", "El mejor método de prevención es el control metódico y periódico de las condiciones del agua. Dedique tiempo a la observación de su acuario. Observe detenidamente a todos los peces y su comportamiento. Verifique que la piel, escamas y aletas estén sanas. Si hay peleas constantes entre algunos de los peces, pida asesoramiento, quizás sean incompatibles para compartir el hábitat."));
    }

    private void salada(){
        listD.add(new DetallesItem("Peces de agua salada","Los peces de agua salada son una excelente opción para aquellas personas que no tienen mucho tiempo para dedicar a sus mascotas pero quieren disfrutar de la belleza de los peces."));
        listD.add(new DetallesItem("Cuidados", "Los peces de agua salada, también conocidos como peces marinos, precisan de un cuidado diferente al que reciben los peces de agua dulce"));
        listD.add(new DetallesItem("Enfermedades", "El mejor método de prevención es el control metódico y periódico de las condiciones del agua. Dedique tiempo a la observación de su acuario. Observe detenidamente a todos los peces y su comportamiento. Verifique que la piel, escamas y aletas estén sanas. Si hay peleas constantes entre algunos de los peces, pida asesoramiento, quizás sean incompatibles para compartir el hábitat."));
    }

    private void initializeAdapter() {
        DetallesAdapter adapter = new DetallesAdapter(listD, new CustomItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {

            }
        });
        rv.setAdapter(adapter);
    }
}
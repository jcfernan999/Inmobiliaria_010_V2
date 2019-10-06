package com.example.inmobiliaria_010.ui.propiedades;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.example.inmobiliaria_010.R;

public class Detalle_Propiedades extends Fragment {
    public Detalle_Propiedades() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_detalle_propiedades, container, false);
        TextView tvpropiedad = view.findViewById(R.id.tvContrato);
        tvpropiedad.setText(getArguments().getString("item"));

        Button btnAceptar = view.findViewById(R.id.btnAceptar);
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });

        return view;
    }
}


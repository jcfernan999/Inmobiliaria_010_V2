package com.example.inmobiliaria_010.ui.propiedades;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.inmobiliaria_010.R;

import java.util.ArrayList;

public class PropiedadesFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_propiedades, container, false);

        final ListView lvProdiedad = view.findViewById(R.id.lvPropiedad);

        lvProdiedad.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Bundle bundle  = new Bundle();
                String mipropiedad;
                mipropiedad = lvProdiedad.getItemAtPosition(position).toString();
                bundle.putString("item",mipropiedad);

                Navigation.findNavController(view).navigate(R.id.nav_detalle_propiedades, bundle);



            }
        });


        return view;

}}

package com.example.inmobiliaria_010.ui.contrato;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import androidx.navigation.Navigation;

import com.example.inmobiliaria_010.R;

public class ContratoFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_contrato, container, false);

        final ListView lvProdiedad = view.findViewById(R.id.lvPropiedad);

        lvProdiedad.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Bundle bundle  = new Bundle();
                String mipropiedad;
                mipropiedad = lvProdiedad.getItemAtPosition(position).toString();
                bundle.putString("item",mipropiedad);

                Navigation.findNavController(view).navigate(R.id.nav_detalle_contrato, bundle);




            }
        });


        return view;

    }
}
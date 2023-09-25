package com.patriciasoft.recuperatorio.ui.estrenos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.patriciasoft.recuperatorio.databinding.FragmentDetalleEstrenosBinding;


public class DetalleEstrenos extends Fragment {
    private FragmentDetalleEstrenosBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentDetalleEstrenosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Bundle bundle = getArguments();
        Estrenos estrenos = (Estrenos) bundle.getSerializable("estrenos");
        binding.tvDuracion.setText("Duración: " + estrenos.getDuracion());
        binding.tvAnio.setText("Año: " + estrenos.getAnio());

        return root;
    }
}
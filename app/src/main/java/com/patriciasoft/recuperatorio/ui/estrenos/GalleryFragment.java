package com.patriciasoft.recuperatorio.ui.estrenos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.patriciasoft.recuperatorio.databinding.FragmentGalleryBinding;

import java.util.ArrayList;
import java.util.List;

public class GalleryFragment extends Fragment {
    private GalleryViewModel vm;

    private FragmentGalleryBinding binding;

    private EstrenosAdapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        vm = new ViewModelProvider(this).get(GalleryViewModel.class);
        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        RecyclerView rv = binding.rvEstrenos;
        GridLayoutManager glm = new GridLayoutManager(requireContext(), 1, GridLayoutManager.VERTICAL, false);
        rv.setLayoutManager(glm);
        adapter = new EstrenosAdapter(new ArrayList<>(), requireContext(), getLayoutInflater());
        rv.setAdapter(adapter);


        vm.getMEstrenos().observe(getViewLifecycleOwner(), new Observer<List<Estrenos>>() {
            @Override
            public void onChanged(List<Estrenos> estrenos) {
                adapter.setEstrenos(estrenos);
            }
        });


        vm.armarLista();



        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
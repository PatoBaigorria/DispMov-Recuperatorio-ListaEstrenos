package com.patriciasoft.recuperatorio.ui.estrenos;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;


import com.patriciasoft.recuperatorio.R;

import java.io.Serializable;


import java.util.List;

public class EstrenosAdapter extends RecyclerView.Adapter<EstrenosAdapter.ViewHolder> {
private List<Estrenos> estrenos;

private Context context;

private LayoutInflater li;

    public EstrenosAdapter(List<Estrenos> estrenos, Context context, LayoutInflater li) {
        this.estrenos = estrenos;
        this.context = context;
        this.li = li;
    }

    public void setEstrenos(List<Estrenos> estrenos) {
        this.estrenos = estrenos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = li.inflate(R.layout.item_estrenos,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Estrenos est = estrenos.get(position);
        if (est !=null){
            holder.titulo.setText(estrenos.get(position).getTitulo());
            holder.director.setText(estrenos.get(position).getDirector());
        }

    }

    @Override
    public int getItemCount() {
        return estrenos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView titulo, director;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.tvTitulo);
            director = itemView.findViewById(R.id.tvDirector);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("estrenos", estrenos.get(getAdapterPosition()));

                    Navigation.findNavController(view).navigate(R.id.nav_detalleEstrenos, bundle);


                }
            });

        }
    }
}

package com.patriciasoft.recuperatorio.ui.estrenos;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class GalleryViewModel extends AndroidViewModel {

    private Context context;

    private MutableLiveData<List<Estrenos>> mEstrenos;

    public GalleryViewModel(@NonNull Application application) {
        super(application);
        this.context = application.getApplicationContext();
    }

    public LiveData<List<Estrenos>> getMEstrenos(){
        if(mEstrenos==null){
            mEstrenos = new MutableLiveData<>();
        }
        return mEstrenos;
    }

    public void armarLista(){
        List<Estrenos> lista=new ArrayList<>();
        lista.add(new Estrenos("Película: Harry Potter", "152 minutos", "Director:  Chris Columbus", "2001"));
        lista.add(new Estrenos("Película: Titanic", "195 minutos", "Director: James Cameron", "1997"));
        lista.add(new Estrenos("Película: El Señor de los Anillos", "178 minutos", "Director: Peter Jackson", "2001"));
        lista.add(new Estrenos("Película: Forrest Gump", "142 minutos", "Director: Robert Zemeckis", "1994"));
        lista.add(new Estrenos("Película: Crepúsculo", "122 minutos", "Director: Catherine Hardwicke", "2008"));
        lista.add(new Estrenos("Película: Joker", "118minutos", "Director: Todd Phillips", " 2019"));
        lista.add(new Estrenos("Película: Jurassic Park", "127 minutos", "Director: Steven Spielberg ", "1993"));
        lista.add(new Estrenos("Película: Nueve Reinas", " 114 minutos", "Director: Fabián Bielinsky", "2000"));



        mEstrenos.setValue(lista);
    }
}
package com.iesam.nissanSL.data;

import com.iesam.nissanSL.domain.models.Chasis;

import java.util.TreeMap;

public class ChasisDataStore {

    private static ChasisDataStore instance =null;

    private TreeMap<String, Chasis> dataStore = new TreeMap<>();

    public void guardar (Chasis chasis){
        dataStore.put(chasis.getCodigoBastidor(),chasis);
    }

    public static ChasisDataStore getInstance(){
        if (instance==null){
            instance=new ChasisDataStore();
        }
    return instance;
    }


}

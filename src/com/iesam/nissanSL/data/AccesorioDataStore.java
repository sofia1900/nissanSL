package com.iesam.nissanSL.data;
import com.iesam.nissanSL.domain.models.Accesorio;

import java.util.TreeMap;

public class AccesorioDataStore {
    private static AccesorioDataStore instance = null;

    private TreeMap<String, Accesorio> dataStore = new TreeMap<>();

    public void guardar(Accesorio accesorio) {
        dataStore.put(accesorio.getCodigo(), accesorio);
    }

    public Accesorio buscarByCode (String codigo) {
        return dataStore.get(codigo);
    }

    public void modificar(Accesorio accesorio) {
        dataStore.replace(accesorio.getCodigo(), accesorio);
    }

    public static AccesorioDataStore getInstance() {
        if (instance == null) {
            instance = new AccesorioDataStore();
        }
        return instance;
    }
}

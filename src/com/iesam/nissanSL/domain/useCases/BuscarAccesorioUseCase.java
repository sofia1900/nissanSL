package com.iesam.nissanSL.domain.useCases;

import com.iesam.nissanSL.data.AccesorioDataStore;
import com.iesam.nissanSL.domain.models.Accesorio;

public class BuscarAccesorioUseCase {
    private AccesorioDataStore dataStore = AccesorioDataStore.getInstance();

    public Accesorio execute(String codigo) {
        return dataStore.buscarByCode(codigo);
    }
}

package com.iesam.nissanSL.domain.useCases;

import com.iesam.nissanSL.data.AccesorioDataStore;
import com.iesam.nissanSL.domain.models.Accesorio;

public class ModificarAccesorioUseCase {
    private AccesorioDataStore dataStore = AccesorioDataStore.getInstance();

    public void execute(Accesorio accesorio) {
        dataStore.modificar(accesorio);
    }
}

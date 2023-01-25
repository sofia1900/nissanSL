package com.iesam.nissanSL.domain.useCases;

import com.iesam.nissanSL.data.ChasisDataStore;
import com.iesam.nissanSL.domain.models.Chasis;

public class BuscarChasisUseCase {

    private ChasisDataStore dataStore =ChasisDataStore.getInstance();

    public Chasis execute (String codigo){
        return dataStore.buscarBycode(codigo);
    }
}

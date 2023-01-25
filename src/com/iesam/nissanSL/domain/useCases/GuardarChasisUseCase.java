package com.iesam.nissanSL.domain.useCases;

import com.iesam.nissanSL.data.ChasisDataStore;
import com.iesam.nissanSL.domain.models.Chasis;

public class GuardarChasisUseCase {
    private ChasisDataStore dataStore = ChasisDataStore.getInstance();

    public void execute(Chasis chasis){
        dataStore.guardar(chasis);
    }

}

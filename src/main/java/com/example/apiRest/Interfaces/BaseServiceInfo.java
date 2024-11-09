package com.example.apiRest.Interfaces;

import com.example.apiRest.Models.DestinoInfo;

import java.util.List;


public interface BaseServiceInfo {

        //Create
        DestinoInfo create(DestinoInfo destinoInfo);

        List<DestinoInfo> searchName (String destino1, String destino2);

}

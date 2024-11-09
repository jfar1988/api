package com.example.apiRest.Repositories;

import com.example.apiRest.Models.DestinoInfo;
import com.example.apiRest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface destinoInfoRespository extends CrudRepository<DestinoInfo, Integer> {

    //Create DestinoInfo
    DestinoInfo saveAndFlush(DestinoInfo destinoInfo);

    //FindbyName
    @Query(
            nativeQuery = true,
            value = "SELECT * FROM destino_info WHERE nombre_destino LIKE %:destino1% OR nombre_destino LIKE %:destino2%"
    )
    List<DestinoInfo> searchName(String destino1, String destino2);


}

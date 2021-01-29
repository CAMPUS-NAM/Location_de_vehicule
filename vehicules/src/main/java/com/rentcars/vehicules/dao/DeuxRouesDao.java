package com.rentcars.vehicules.dao;

import com.rentcars.vehicules.model.DeuxRoues;
import com.rentcars.vehicules.model.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DeuxRouesDao extends JpaRepository<DeuxRoues, String> {
    List<DeuxRoues> findAll();

    DeuxRoues findById(int id_immatriculation);

//    DeuxRoues save(DeuxRoues deuxRoues);

//    void update(int id_immatriculation);

//    void delete(int id_immatriculation);



}

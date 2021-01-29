package com.rentcars.vehicules.dao;

import com.rentcars.vehicules.model.DeuxRoues;
import com.rentcars.vehicules.model.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoitureDao extends JpaRepository <Voiture, String>{

    List<Voiture> findAll();

    Voiture findById(int id_immatriculation);
//
//    Voiture save(Voiture voiture);

//    void update(Voiture voiture, int id_immatriculation);

//    void delete(int id_immatriculation);

}

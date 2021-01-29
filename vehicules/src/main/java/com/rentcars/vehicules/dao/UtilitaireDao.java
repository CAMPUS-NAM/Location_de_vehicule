package com.rentcars.vehicules.dao;

import com.rentcars.vehicules.model.DeuxRoues;
import com.rentcars.vehicules.model.Utilitaire;
import com.rentcars.vehicules.model.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtilitaireDao extends JpaRepository<Utilitaire, String> {

    List<Utilitaire> findAll();

    Utilitaire findById(int id_immatriculation);

//    Utilitaire save(Utilitaire utilitaire);

//    void update(Utilitaire utilitaire, int id_immatriculation);

//    void delete(int id_immatriculation);

}

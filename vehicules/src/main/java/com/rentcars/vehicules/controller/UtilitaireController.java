package com.rentcars.vehicules.controller;


import com.rentcars.vehicules.dao.UtilitaireDao;
import com.rentcars.vehicules.dao.VoitureDao;
import com.rentcars.vehicules.model.Utilitaire;
import com.rentcars.vehicules.model.Utilitaire;
import com.rentcars.vehicules.model.Voiture;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api(description = "API pour les opérations CRUD sur utilitaires.")
@RestController
public class UtilitaireController {


    @Autowired
    private UtilitaireDao utilitaireDao;


    // deux roues
    @ApiOperation(value = "Affiche tous les utilitaires présents dans la liste")
    @GetMapping(value = "/utilitaire")


    public Iterable<Utilitaire> getAllutilitaire() {
        return utilitaireDao.findAll();
    }


    //deux roues par id
    @ApiOperation(value = "Affiche les caractéristiques d'un utilitaire à partir de son immatriculation à condition qu'elle existe")
    @GetMapping(value = "/utilitaire/{id}")
    public Utilitaire findById(@PathVariable int id) {

        return utilitaireDao.findById(id);
    }

    @ApiOperation(value = "Permet de créer une nouvel utilitaire")
    @PostMapping(path = "/utilitaire")
    public Utilitaire addutilitaire(@RequestBody Utilitaire utilitaire) {

        utilitaireDao.save(utilitaire);
        return utilitaire;


    }

    @ApiOperation(value = "Supprime l'utilitaire dont on a entré l'immatriculation")
    @DeleteMapping("/utilitaire/{id}")
    public void delete(@PathVariable int id) {
        Utilitaire utilitaire = utilitaireDao.findById(id);
        utilitaireDao.delete(utilitaire);
    }

    //    //
    @ApiOperation(value = "Modifie un utilitaire")
    @PutMapping(path = "/utilitaire")
    public void changeUtil( @RequestBody Utilitaire utilitaire) {


        utilitaireDao.save(utilitaire);



    }
}

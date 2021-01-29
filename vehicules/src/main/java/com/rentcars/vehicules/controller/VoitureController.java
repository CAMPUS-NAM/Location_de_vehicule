package com.rentcars.vehicules.controller;


import com.rentcars.vehicules.dao.VoitureDao;

import com.rentcars.vehicules.model.Voiture;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Api(description = "API pour les opérations CRUD sur les voitures.")
@RestController
public class VoitureController {


    @Autowired
    private VoitureDao voitureDao;


    // deux roues
    @ApiOperation(value = "Affiche toutes les voitures présentes dans la liste")
    @GetMapping(value = "/voiture")


    public Iterable<Voiture> getAllvoiture() {
        return voitureDao.findAll();
    }


    //deux roues par id
    @ApiOperation(value = "Affiche les caractéristiques d'une voiture à partir de son immatriculation à condition qu'elle existe")
    @GetMapping(value = "/voiture/{id}")
    public Voiture findById(@PathVariable int id) {

        return voitureDao.findById(id);
    }

    @ApiOperation(value = "Permet de créer une nouvelle voiture")
    @PostMapping(path = "/voiture")
    public Voiture addvoiture(@RequestBody Voiture voiture) {

        voitureDao.save(voiture);
        return voiture;


    }

    @ApiOperation(value = "Supprime la voiture dont on a entré l'immatriculation")
    @DeleteMapping("/voiture/{id}")
    public void delete(@PathVariable int id) {
        Voiture voiture = voitureDao.findById(id);
        voitureDao.delete(voiture);
    }

    //    //
    @ApiOperation(value = "Modifie une voiture")
    @PutMapping(path = "/voiture")
    public void changeUtil( @RequestBody Voiture voiture) {


        voitureDao.save(voiture);



    }
}


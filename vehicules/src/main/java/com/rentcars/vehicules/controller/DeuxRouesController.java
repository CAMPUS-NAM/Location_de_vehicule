package com.rentcars.vehicules.controller;

import com.rentcars.vehicules.dao.DeuxRouesDao;
import com.rentcars.vehicules.dao.VoitureDao;
import com.rentcars.vehicules.model.DeuxRoues;
import com.rentcars.vehicules.model.Voiture;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(description = "API pour les opérations CRUD sur les deux roues.")
@RestController
public class DeuxRouesController {


    @Autowired
    private DeuxRouesDao deuxRouesDao;


    // deux roues
    @ApiOperation(value = "Affiche tous les deux roues présents dans la liste")
    @GetMapping(value = "/deuxroues")
    public List<DeuxRoues> getAllDeuxRoues() { return deuxRouesDao.findAll();
    }


    //deux roues par id
    @ApiOperation(value = "Affiche les caractéristiques d'un deux roues à partir de son immatriculation à condition qu'elle existe")
    @GetMapping(value = "/deuxroues/{id}")
    public DeuxRoues findById(@PathVariable int id) {

    return deuxRouesDao.findById(id);
    }

    @ApiOperation(value = "Permet de créer un deux roues")
    @PostMapping(path = "/deuxroues")
    public DeuxRoues addDeuxRoues(@RequestBody DeuxRoues deuxRoues) {

    deuxRouesDao.save(deuxRoues);
    return deuxRoues;


    }

    @ApiOperation(value = "Supprime le deux roues dont on a entré l'immatriculation")
    @DeleteMapping("/deuxroues/{id}")
    public void delete(@PathVariable int id) {
    DeuxRoues deuxRoues = deuxRouesDao.findById(id);
    deuxRouesDao.delete(deuxRoues);
    }

//    //
    @ApiOperation(value = "Modifie un deux roues")
    @PutMapping(path = "/deuxroues")
    public void changeDeuxRoues( @RequestBody DeuxRoues deuxRoues) {


        deuxRouesDao.save(deuxRoues);



    }
}


package com.rental.controller;

import com.rental.dao.RentalDao;
import com.rental.model.Rental;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api("API pour les opérations CRUD sur la Location de véhicule.")
@RestController
public class RentalController {

    @Autowired
    private RentalDao rentalDao;

    @ApiOperation(value = "Récupère une Location")
    @GetMapping(value = "/Rental/{id}")
    public Rental displayAnRental(@PathVariable int id) {
        return rentalDao.findById(id);
    }

    @ApiOperation(value = "Ajoute une Location")
    @PostMapping(value = "/Rental")
    public void addRental(@RequestBody Rental rental) {
        rentalDao.save(rental);
    }

    @ApiOperation(value = "Mets à jour une Location")
    @PutMapping(value = "/Rental")
    public void updateRental(@RequestBody Rental rental) {
        rentalDao.save(rental); // fonctionne pas avec l'id 0
    }

    @ApiOperation(value = "Supprime une Location")
    @DeleteMapping(value = "/Rental/{id}")
    public void deleteRental(@PathVariable int id) {
        Rental rental = rentalDao.findById(id);
        rentalDao.delete(rental);
    }

}
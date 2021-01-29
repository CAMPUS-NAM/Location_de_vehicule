package com.rentcar.client.controller;

import com.rentcar.client.artifact.Client;
import com.rentcar.client.dao.ClientDao;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api("client CRUD API")
@RestController
public class ClientController {
    @Autowired
    private ClientDao clientDao;

    @ApiOperation(value = "retourne infos client. remplir URL tel que /Client/{id}")
    @GetMapping(value = "/Client/{id}")
    public Client clientbyId(@PathVariable int id){
        return clientDao.findById(id);
    }
    @ApiOperation(value = "retourne ts les clients. remplir URL tel que /Client")
    @GetMapping(value = "/Client")
    public List<Client> clientGetAll(){
        return clientDao.findAll();
    }
    @ApiOperation(value = "ajoute un client. remplir URL tel que /Client")
    @PostMapping(value = "/Client")
    public Client addClient(@RequestBody Client client){
        return  clientDao.save(client);
    }
    @ApiOperation(value = "supprime client. remplir URL tel que /Client/{id}")
    @DeleteMapping(value = "/Client/{id}")
    public void deleteClient (@PathVariable int id){
        Client client = clientDao.findById(id);
        clientDao.delete(client);
    }
    @ApiOperation(value = "met à jour un client. remplir URL tel que /Client")
    @PutMapping(value ="/Client" )
    public void updateClient(@RequestBody Client client){

        clientDao.save(client);
    }


}

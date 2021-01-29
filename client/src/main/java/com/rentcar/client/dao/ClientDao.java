package com.rentcar.client.dao;

import com.rentcar.client.artifact.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDao extends JpaRepository<Client, Integer> {
    public Client findById(int id);
//    public Client save(Client Client);
//    public void update(Client Client, int id);
//    public void delete(int id);
}

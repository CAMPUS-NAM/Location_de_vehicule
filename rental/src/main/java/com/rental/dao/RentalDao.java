package com.rental.dao;

import com.rental.model.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalDao extends JpaRepository<Rental, Integer> {
    public Rental findById(int id);
}
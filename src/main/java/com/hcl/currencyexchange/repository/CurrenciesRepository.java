package com.hcl.currencyexchange.repository;

import com.hcl.currencyexchange.entity.Currencies;
import com.hcl.currencyexchange.entity.Exchanges;
//import org.springframework.data.jpa.repository.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CurrenciesRepository extends JpaRepository<Currencies, Integer> {

    @Query("select c from Currencies c")
    List<Currencies> getAll();

    //Return a list of the available records based on the abbreviation
    @Query("select c from Currencies c where abbreviation = ?1")
    Currencies getByAbb(String abbreviation);

}
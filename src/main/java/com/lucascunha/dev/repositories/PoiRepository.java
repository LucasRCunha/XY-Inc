package com.lucascunha.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucascunha.dev.domain.Poi;

@Repository
public interface PoiRepository extends JpaRepository <Poi, Integer>{

}

package com.example.xana.demo.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsumosRepository extends JpaRepository<Insumos,Long>{

    
}

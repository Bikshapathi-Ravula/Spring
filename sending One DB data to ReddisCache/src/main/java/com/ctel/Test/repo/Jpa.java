package com.ctel.Test.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ctel.Test.model.Shopping;

@Repository
public interface Jpa extends JpaRepository<Shopping, Integer> {

}

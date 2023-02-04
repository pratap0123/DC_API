package com.pd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pd.entity.IncomeDetails;

public interface IncomeRepo extends JpaRepository<IncomeDetails, Integer>{

}

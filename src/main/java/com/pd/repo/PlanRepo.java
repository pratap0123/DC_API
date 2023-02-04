package com.pd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pd.entity.PlanName;

public interface PlanRepo extends JpaRepository<PlanName, Integer>{

}

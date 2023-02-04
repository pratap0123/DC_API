package com.pd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pd.entity.EducationDetails;

public interface EducationRepo extends JpaRepository<EducationDetails, Integer>{

}

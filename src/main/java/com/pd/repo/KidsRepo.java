package com.pd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pd.entity.KidsDetails;

public interface KidsRepo extends JpaRepository<KidsDetails, Integer>{

}

package com.csv_to_rdbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csv_to_rdbms.entity.DataEntity;

@Repository
public interface DataRepository extends JpaRepository<DataEntity, Long> {
}

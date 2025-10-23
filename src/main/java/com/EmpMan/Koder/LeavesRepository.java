package com.EmpMan.Koder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LeavesRepository extends JpaRepository<LeavesModel, Long>{

}

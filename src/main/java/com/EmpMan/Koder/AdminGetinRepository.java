package com.EmpMan.Koder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AdminGetinRepository extends JpaRepository<EmployeeCheckin, Long>{

}

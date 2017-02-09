package com.mars.qalog.repo;

import com.mars.qalog.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by yangyuchi on 10/02/2017.
 */
@RepositoryRestResource
public interface EmployeeRepository extends CrudRepository<Employee, Long> {}
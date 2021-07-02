package com.company.repository.intf;

import org.springframework.data.repository.CrudRepository;
import com.company.entity.Company;

public interface CompanyRepository extends CrudRepository<Company, Long> {
	
	
}

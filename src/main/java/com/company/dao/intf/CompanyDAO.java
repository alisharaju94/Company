package com.company.dao.intf;

import com.company.entity.Company;
import com.company.model.CompanyResponse;

public interface CompanyDAO {

	CompanyResponse save(Company company);
	
	
}

package com.company.repo.intf;

import com.company.entity.Company;
import com.company.model.CompanyResponse;

public interface CompanySPActionsRepository {

	CompanyResponse insertCompany(Company company);
}

package com.company.service.intf;

import com.company.model.CompanyList;
import com.company.model.CompanyReqBean;
import com.company.model.CompanyResponse;

public interface CompanyService {

	CompanyResponse addCompany(CompanyReqBean company);

	CompanyList getAll();

	void delete(String companyCode);

	CompanyResponse getInfo(String companyCode);
}

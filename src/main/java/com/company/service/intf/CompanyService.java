package com.company.service.intf;

import com.company.model.CompanyReqBean;
import com.company.model.CompanyResponse;

public interface CompanyService {

	CompanyResponse addCompany(CompanyReqBean company);
}

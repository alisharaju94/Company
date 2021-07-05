package com.company.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.intf.CompanyDAO;
import com.company.entity.Company;
import com.company.model.CompanyReqBean;
import com.company.model.CompanyResponse;
import com.company.service.intf.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	CompanyDAO companyDao;

	@Override
	public CompanyResponse addCompany(CompanyReqBean companyReqBean) {
		Company company = new Company();
		BeanUtils.copyProperties(companyReqBean, company);
		CompanyResponse res = companyDao.save(company);
		return res;
	}
}

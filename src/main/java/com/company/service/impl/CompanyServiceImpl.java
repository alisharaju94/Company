package com.company.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.entity.Company;
import com.company.model.CompanyReqBean;
import com.company.model.CompanyResponse;
import com.company.repo.intf.CompanySPActionsRepository;
import com.company.service.intf.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	CompanySPActionsRepository companySPActionsRepo;

	@Override
	public CompanyResponse addCompany(CompanyReqBean companyReqBean) {
		Company company = new Company();
		company.setName(companyReqBean.getCompanyName());
		company.setCeo(companyReqBean.getCompanyCEO());
		company.setTurnOver(companyReqBean.getCompanyTurnOver());
		company.setCurrencyCode(companyReqBean.getCurrencyCode());
		company.setUrl(companyReqBean.getCompanyUrl());
		company.setStockExchange(companyReqBean.getStockExchange());
		return companySPActionsRepo.insertCompany(company);
	}
}

package com.company.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.entity.Company;
import com.company.model.CompanyList;
import com.company.model.CompanyReqBean;
import com.company.model.CompanyResponse;
import com.company.repo.intf.CompanyRepository;
import com.company.repo.intf.CompanySPActionsRepository;
import com.company.service.intf.CompanyService;
import com.google.common.collect.Lists;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	CompanySPActionsRepository companySPActionsRepo;

	@Autowired
	private CompanyRepository companyCommonActionsRepo;

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

	@Override
	public CompanyList getAll() {
		List<Company> companyEntities = companyCommonActionsRepo.findAll();
		CompanyList companies = new CompanyList();
		List<CompanyResponse> companyList = Lists.newArrayList();
		companyEntities.forEach(entity -> {
			CompanyResponse comResponse = new CompanyResponse();
			comResponse.setComCode(entity.getComCode());
			comResponse.setName(entity.getName());
			comResponse.setCeo(entity.getCeo());
			comResponse.setTurnOver(entity.getTurnOver());
			comResponse.setCurrencyCode(entity.getCurrencyCode());
			comResponse.setUrl(entity.getUrl());
			comResponse.setStockExchange(entity.getStockExchange());
			companyList.add(comResponse);
		});
		companies.setCompanies(companyList);
		return companies;
	}

	@Override
	public void delete(String companyCode) {
		companyCommonActionsRepo.deleteById(companyCode);
	}

	@Override
	public CompanyResponse getInfo(String companyCode) {
		Optional<Company> result = companyCommonActionsRepo.findById(companyCode);
		if (result.isPresent()) {
			Company company = result.get();
			CompanyResponse response = new CompanyResponse();
			BeanUtils.copyProperties(company, response);
			return response;
		}
		return null;
	}
}

package com.company.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.entity.Company;
import com.company.model.CompanyReqBean;
import com.company.repository.intf.CompanyRepository;
import com.company.service.intf.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	CompanyRepository companyRepo;

	public void addCompany(CompanyReqBean companyReqBean) {
		Company company = new Company();
		BeanUtils.copyProperties(companyReqBean, company);
		System.out.println(company.toString());
		companyRepo.save(company);
	}
}

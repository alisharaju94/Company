package com.company.repo.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.entity.Company;
import com.company.mapper.DataMapper;
import com.company.model.CompanyResponse;
import com.company.repo.intf.CompanySPActionsRepository;

@Repository
public class CompanySPActionsRepoImpl implements CompanySPActionsRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private DataMapper mapper;

	@Transactional
	@Override
	public CompanyResponse insertCompany(Company company) {
		mapper.setComCode(company);
 		StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("Company.insertCompanyQuery");
 		query.setParameter("c_code", company.getComCode());
		query.setParameter("c_name", company.getName());
		query.setParameter("c_CEO", company.getCeo());
		query.setParameter("c_turn_over", company.getTurnOver());
		query.setParameter("c_currency", company.getCurrencyCode());
		query.setParameter("c_url", company.getUrl());
		query.setParameter("c_stock_exchange", company.getStockExchange());
		query.execute();
		Company result = (Company) query.getSingleResult();
		return mapper.mapResultToCompanyRes(result);
	}

}

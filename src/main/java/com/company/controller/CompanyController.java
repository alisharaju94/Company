package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.model.CompanyReqBean;
import com.company.model.CompanyResponse;
import com.company.service.intf.CompanyService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	CompanyService companyService;

	@PostMapping(value = "/add")
	@ApiOperation(value = "Register a company", notes = "Endpoint to register a company", response = CompanyResponse.class)
	public CompanyResponse addCompany(@ApiParam(value = "stockMarketRequest", required = true) @RequestBody CompanyReqBean company){
		return companyService.addCompany(company);
	}
	
}

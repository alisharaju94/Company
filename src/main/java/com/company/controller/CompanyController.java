package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.model.CompanyList;
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
	public CompanyResponse addCompany(@ApiParam(value = "companyRequest", required = true) @RequestBody CompanyReqBean company){
		return companyService.addCompany(company);
	}
	
	@GetMapping(value = "/getAll")
	public CompanyList getAllCompany() {
		return companyService.getAll();
	}
	
	@GetMapping(value = "/info/{companyCode}")
	public CompanyResponse getInfo(@PathVariable String companyCode) {
		return companyService.getInfo(companyCode);
	}
	
	@DeleteMapping(value ="/{companyCode}")
	public ResponseEntity deleteCompany(@PathVariable String companyCode) {
		 companyService.delete(companyCode);
		 return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}

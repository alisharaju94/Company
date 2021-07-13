package com.company.model;

import java.util.List;

import lombok.Data;

@Data
public class CompanyList {
	private List<CompanyResponse> companies;
}

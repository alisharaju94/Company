package com.company.model;

import java.io.Serializable;
import java.math.BigInteger;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel
@Data
public class CompanyReqBean implements Serializable {

	private static final long serialVersionUID = 8027252568089995952L;
	
	@ApiModelProperty(notes = "The company code", example = "1")
	private String companyCode;

	@ApiModelProperty(notes = "The company name", example = "XYZ")
	private String companyName;

	@ApiModelProperty(notes = "Company CEO name", example = "Marc Alderson")
	private String companyCEO;

	@ApiModelProperty(notes = "The company trun over. Minimum value should be 10 Cr.", example = "100000000")
	private BigInteger companyTurnOver;

	@ApiModelProperty(notes = "Currency code. This should be a 3 letter code.", example = "INR")
	private String currencyCode;

	@ApiModelProperty(notes = "The company url", example = "www.xyz.com")
	private String companyUrl;

	@ApiModelProperty(notes = "The stock exchange in which the company is listed in", example = "NSE")
	private String stockExchange;

}

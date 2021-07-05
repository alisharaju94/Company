package com.company.model;

import java.io.Serializable;
import java.math.BigInteger;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class CompanyReqBean implements Serializable {

	private static final long serialVersionUID = 8027252568089995952L;

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

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the companyCEO
	 */
	public String getCompanyCEO() {
		return companyCEO;
	}

	/**
	 * @param companyCEO the companyCEO to set
	 */
	public void setCompanyCEO(String companyCEO) {
		this.companyCEO = companyCEO;
	}

	/**
	 * @return the companyUrl
	 */
	public String getCompanyUrl() {
		return companyUrl;
	}

	/**
	 * @return the companyTurnOver
	 */
	public BigInteger getCompanyTurnOver() {
		return companyTurnOver;
	}

	/**
	 * @param companyTurnOver the companyTurnOver to set
	 */
	public void setCompanyTurnOver(BigInteger companyTurnOver) {
		this.companyTurnOver = companyTurnOver;
	}

	/**
	 * @return the currencyCode
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * @param currencyCode the currencyCode to set
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * @param companyUrl the companyUrl to set
	 */
	public void setCompanyUrl(String companyUrl) {
		this.companyUrl = companyUrl;
	}

	/**
	 * @return the stockExchange
	 */
	public String getStockExchange() {
		return stockExchange;
	}

	/**
	 * @param stockExchange the stockExchange to set
	 */
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

}

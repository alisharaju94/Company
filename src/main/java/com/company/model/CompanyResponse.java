/**
 * 
 */
package com.company.model;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * @author Alisha Raju
 *
 */
public class CompanyResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	private String companyCode;
	private String companyName;
	private String companyCEO;
	private BigInteger companyTurnOver;
	private String currencyCode;
	private String companyUrl;
	private String stockExchange;

	/**
	 * @return the comapnyCode
	 */
	public String getCompanyCode() {
		return companyCode;
	}

	/**
	 * @param comapnyCode the comapnyCode to set
	 */
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

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

/**
 * 
 */
package com.company.model;

import java.math.BigInteger;

import lombok.Data;

/**
 * @author Alisha Raju
 *
 */
@Data
public class CompanyResponse{
	private String comCode;
	private String name;
	private String ceo;
	private BigInteger turnOver;
	private String currencyCode;
	private String url;
	private String stockExchange;

}

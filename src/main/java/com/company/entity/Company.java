package com.company.entity;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import springfox.documentation.spring.web.json.Json;

/**
 * @author Alisha
 *
 */
@Entity(name = "Company")
@Table(name = "company")
@NamedStoredProcedureQuery(
		name = "Company.insertCompanyQuery", procedureName = "insert_company", resultClasses = {Company.class},
		parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "c_name"),
		@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "c_CEO"),
		@StoredProcedureParameter(mode = ParameterMode.IN, type = BigInteger.class, name = "c_turn_over"),
		@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "c_currency"),
		@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "c_url"),
		@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "c_stock_exchange") })
public class Company implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "code", nullable = false)
	private long code;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "CEO", nullable = false)
	private String ceo;

	@Column(name = "turn_over", nullable = false)
	private BigInteger turnOver;

	@Column(name = "currency_code", nullable = false)
	private String currencyCode;

	@Column(name = "url", nullable = false)
	private String url;

	@Column(name = "stock_exchange", nullable = false)
	private String stockExchange;

	/**
	 * @return the code
	 */
	public long getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(long code) {
		this.code = code;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the ceo
	 */
	public String getCeo() {
		return ceo;
	}

	/**
	 * @param ceo the ceo to set
	 */
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	/**
	 * @return the turnOver
	 */
	public BigInteger getTurnOver() {
		return turnOver;
	}

	/**
	 * @param turnOver the turnOver to set
	 */
	public void setTurnOver(BigInteger turnOver) {
		this.turnOver = turnOver;
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
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
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

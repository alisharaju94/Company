package com.company.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import lombok.Data;
import springfox.documentation.spring.web.json.Json;

/**
 * @author Alisha
 *
 */
@Data
@Entity(name = "Company")
@Table(name = "company")
@NamedStoredProcedureQuery(name = "Company.insertCompanyQuery", procedureName = "insert_company", resultClasses = {
		Company.class }, parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "c_code"),
				@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "c_name"),
				@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "c_CEO"),
				@StoredProcedureParameter(mode = ParameterMode.IN, type = BigInteger.class, name = "c_turn_over"),
				@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "c_currency"),
				@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "c_url"),
				@StoredProcedureParameter(mode = ParameterMode.IN, type = String.class, name = "c_stock_exchange") })
public class Company implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "com_code", nullable = false)
	private String comCode;

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
	
	@Column(name = "create_date")
	private Timestamp createDate;

	@Column(name = "stock_exchange", nullable = false)
	private String stockExchange;

}

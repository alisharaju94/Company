/**
 * 
 */
package com.company.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.company.entity.Company;
import com.company.model.CompanyResponse;

/**
 * @author ALISH
 *
 */
@Component
public class DataMapper {

	public CompanyResponse mapResultToCompanyRes(Company result) {
		if (result != null) {
			CompanyResponse companyResponse = new CompanyResponse();
			BeanUtils.copyProperties(result, companyResponse);
			return companyResponse;
		}
		return null;
	}

}

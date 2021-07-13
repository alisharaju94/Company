/**
 * 
 */
package com.company.mapper;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

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

	public void setComCode(Company entity) {
		try {
			String comCode = getRandomID(entity.getName().hashCode());
			entity.setComCode(comCode);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			throw new IllegalStateException();
		}
	}

	private static String getRandomID(int seed) throws NoSuchAlgorithmException {
		Random random = SecureRandom.getInstanceStrong();
		random.setSeed(seed);
		int randomNum = random.nextInt(999999);
		return new StringBuilder().append("C_").append(String.format("%06d", randomNum)).toString();
	}

}

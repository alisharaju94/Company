package com.company.repo.intf;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, BigInteger> {

}

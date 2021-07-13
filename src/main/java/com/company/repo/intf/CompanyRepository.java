package com.company.repo.intf;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, String> {

}

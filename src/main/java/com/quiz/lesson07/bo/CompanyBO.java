package com.quiz.lesson07.bo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.lesson07.entity.CompanyEntity;
import com.quiz.lesson07.repository.CompanyRepository;

@Service
public class CompanyBO {
	
	@Autowired
	private CompanyRepository companyRepository;
	
	// input : parameter 4개
	// output : CompanyEntity
	public CompanyEntity addCompany(String name, String business,
			String scale, int headcount) {
		CompanyEntity company = CompanyEntity.builder()
				.name(name)
				.business(business)
				.scale(scale)
				.headcount(headcount)
				.createdAt(LocalDateTime.now())
				.build();
		
		return companyRepository.save(company);
	}
}

package com.baanyan.admin_resume.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baanyan.admin_resume.dao.CompanyDao;
import com.baanyan.admin_resume.dto.CompanyRequest;
import com.baanyan.admin_resume.dto.CompanyResponse;
import com.baanyan.admin_resume.model.Address;
import com.baanyan.admin_resume.model.Company;
import com.baanyan.common.service.BaseGenericServiceImpl;

/**
 * Created by Bowen Yao 3/7/2016
 */

@Service
@Transactional
public class CompanyServiceImpl extends BaseGenericServiceImpl<Company, String> implements CompanyService {
	
	@Autowired
	private CompanyDao companyDao;

	public CompanyResponse createCompany(CompanyRequest request) {
		// TODO Auto-generated method stub
		Company company = new Company();
		company.setCompanyName(request.getCompanyName());
		company.setAddress(request.getAddress());
		companyDao.save(company);
		return new CompanyResponse(company);
	}

	public void deleteCompany(String companyID) {
		// TODO Auto-generated method stub
		companyDao.delete(companyDao.get(companyID));
	}

	public CompanyResponse updateCompany(String companyID, CompanyRequest request) {
		// TODO Auto-generated method stub
		Company company = companyDao.get(companyID);
		company.setCompanyName(request.getCompanyName());
		Address address = company.getAddress();
		address.setCity(request.getAddress().getCity());
		address.setState(request.getAddress().getState());;
		companyDao.update(company);
		return new CompanyResponse(company);
	}

	public CompanyResponse getCompanybyID(String companyID) {
		// TODO Auto-generated method stub
		return new CompanyResponse(companyDao.get(companyID));
	}

	public List<CompanyResponse> getAllCompanies() {
		// TODO Auto-generated method stub
		List<Company> allCompanies = companyDao.loadAll();
		List<CompanyResponse> allCompaniesResponse = new ArrayList<CompanyResponse>();
		for(Company company : allCompanies) {
			allCompaniesResponse.add(new CompanyResponse(company));
		}
		return allCompaniesResponse;
	}

	@Override
	public void delete(Company entity) {
		// TODO Auto-generated method stub
		companyDao.delete(entity);
	}

	@Override
	public Company get(String id) {
		// TODO Auto-generated method stub
		return companyDao.get(id);
	}

	@Override
	public Company load(String id) {
		// TODO Auto-generated method stub
		return companyDao.load(id);
	}

	@Override
	public List<Company> loadAll() {
		// TODO Auto-generated method stub
		return companyDao.loadAll();
	}

	@Override
	public void save(Company entity) {
		// TODO Auto-generated method stub
		companyDao.save(entity);
	}

	@Override
	public void saveOrUpdate(Company entity) {
		// TODO Auto-generated method stub
		companyDao.saveOrUpdate(entity);
	}

	@Override
	public void update(Company entity) {
		// TODO Auto-generated method stub
		companyDao.update(entity);
	}
	
}

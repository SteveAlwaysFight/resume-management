package com.baanyan.admin_resume.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baanyan.admin_resume.dao.CategoryDao;
import com.baanyan.admin_resume.dao.ResponsibilityDao;
import com.baanyan.admin_resume.dto.ResponsibilityRequest;
import com.baanyan.admin_resume.dto.ResponsibilityResponse;
import com.baanyan.admin_resume.model.Category;
import com.baanyan.admin_resume.model.Keyword;
import com.baanyan.admin_resume.model.Responsibility;
import com.baanyan.common.service.BaseGenericServiceImpl;

@Service
@Transactional
public class ResponsibilityServiceImpl extends BaseGenericServiceImpl<Responsibility, String> implements ResponsibilityService {

	@Autowired
	ResponsibilityDao responsibilityDao;
	
	@Autowired
	CategoryDao categoryDao;
	
	public ResponsibilityResponse createResponsibility(String categoryName, ResponsibilityRequest request) {
		// TODO Auto-generated method stub
		Responsibility responsibility = new Responsibility();
		responsibility.setContent(request.getContent());
		Set<Keyword> keywords = new HashSet<Keyword>();
		for(Keyword keyword : request.getKeywords()) {
			keyword.setCategory(categoryDao.getbyParam("categoryName", categoryName));
			keyword.setKeywordName(keyword.getKeywordName());
			keywords.add(keyword);
		}
		responsibility.setKeywords(keywords);
		responsibilityDao.save(responsibility);
		return new ResponsibilityResponse(responsibility);
	}

	public void deleteResponsibility(String responsibilityID) {
		// TODO Auto-generated method stub
		responsibilityDao.delete(responsibilityDao.get(responsibilityID));

	}

	public ResponsibilityResponse updateResponsibility(String categoryName, String responsibilityID, ResponsibilityRequest request) {
		// TODO Auto-generated method stub
		Responsibility responsibility = responsibilityDao.get(responsibilityID);
		Category category = categoryDao.getbyParam("categoryName", categoryName);
		responsibility.setContent(request.getContent());
		/*
		 * Need to Check if this logic can be improved
		 */
		Set<Keyword> oldKeywords = responsibility.getKeywords();
		Set<Keyword> newKeywords = request.getKeywords();
		Set<Keyword> keywordsWithSameCategory = category.getKeywords();
		for(Keyword newKeyword : newKeywords) {
			newKeyword.setCategory(category);
			if(!oldKeywords.contains(newKeyword)) {
				boolean added = false;
				for(Keyword keywordWithSameCategory : keywordsWithSameCategory) {
					if(newKeyword.equals(keywordWithSameCategory)) {
						oldKeywords.add(keywordWithSameCategory);
						added = true;
						break;
					}
				}
				if(!added) {
					oldKeywords.add(newKeyword);
				}
			}
		}
		Iterator<Keyword> oldKeywordIterator = oldKeywords.iterator();
		while(oldKeywordIterator.hasNext()) {
			Keyword oldKeyword = oldKeywordIterator.next();
			boolean oldExistedInNew = false;
			for(Keyword newKeyword : newKeywords) {
				if(newKeyword.equals(oldKeyword)) {
					oldExistedInNew = true;
					break;
				} else {
					oldExistedInNew = false;
				}
				
			}
			if(!oldExistedInNew) {
				oldKeywordIterator.remove();
			}
		}
		System.out.println(oldKeywords.size());
		responsibilityDao.update(responsibility);
		return new ResponsibilityResponse(responsibility);
	}

	public ResponsibilityResponse getResponsibilitybyID(String responsibilityID) {
		// TODO Auto-generated method stub
		Responsibility responsibility = responsibilityDao.get(responsibilityID);
		ResponsibilityResponse responsibilityResoponse = new ResponsibilityResponse(responsibility);
		Set<Keyword> keywords = responsibility.getKeywords();
		for(Keyword keyword : keywords) {
			keyword.setId(keyword.getId());
		}
		responsibilityResoponse.setKeywords(keywords);
		return responsibilityResoponse;
	}

	public List<ResponsibilityResponse> getAllResponsibilities() {
		// TODO Auto-generated method stub
		List<Responsibility> allresponsibilities = responsibilityDao.loadAll();
		List<ResponsibilityResponse> allResponsibilityResponses = new ArrayList<ResponsibilityResponse>();
		for(Responsibility responsibility : allresponsibilities) {
			ResponsibilityResponse responsibilityResoponse = new ResponsibilityResponse(responsibility);
			Set<Keyword> keywords = responsibility.getKeywords();
			for(Keyword keyword : keywords) {
				keyword.setId(keyword.getId());
			}
			allResponsibilityResponses.add(responsibilityResoponse);
		}
		return allResponsibilityResponses;
	}

}

package com.pd.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.pd.binding.EducationForm;
import com.pd.binding.IncomeForm;
import com.pd.binding.KidsForm;
import com.pd.binding.PlanSelectionForm;
import com.pd.entity.EducationDetails;
import com.pd.entity.IncomeDetails;
import com.pd.entity.KidsDetails;
import com.pd.entity.PlanName;
import com.pd.entity.PlanSelection;
import com.pd.repo.EducationRepo;
import com.pd.repo.IncomeRepo;
import com.pd.repo.KidsRepo;
import com.pd.repo.PlanRepo;
import com.pd.repo.PlanSelectionRepo;

@Service
public class DataCollectionServiceImpl implements DataCollectionService {

	@Autowired
	private WebClient webClient;
	@Autowired
	private PlanRepo planRepo;
	@Autowired
	private PlanSelectionRepo psRepo;

	@Autowired
	private IncomeRepo incomeRepo;

	@Autowired
	private EducationRepo educationRepo;

	@Autowired
	private KidsRepo kidsRepo;

	@Override
	public String createCase(Long appId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlanName> getPlans() {
		List<PlanName> plans = planRepo.findAll();
		return plans;
	}

	@Override
	public String craetePlan(PlanSelectionForm planSelectionForm) {

		PlanSelection planSelection = new PlanSelection();
		BeanUtils.copyProperties(planSelectionForm, planSelection);
		PlanSelection save = psRepo.save(planSelection);
		if (save != null) {
			return "plan is craeted";
		}
		return "plan is not craeted";

	}

	@Override
	public String createIncome(IncomeForm incomeForm) {
		IncomeDetails income = new IncomeDetails();
		BeanUtils.copyProperties(incomeForm, income);
		IncomeDetails save = incomeRepo.save(income);
		if (save != null) {
			return "Incomne Data saved successfully";
		}
		return "Incomne Data not saved successfully";
	}

	@Override
	public String createEducation(EducationForm educationForm) {
		EducationDetails edu = new EducationDetails();
		BeanUtils.copyProperties(educationForm, edu);
		EducationDetails save = educationRepo.save(edu);
		if (save != null) {
			return "Eduaction Data saved successfully";
		}
		return "Eduaction Data not saved successfully";

	}

	@Override
	public String createKids(List<KidsForm> kidsForms) {
		List<KidsDetails> kids = new ArrayList<>();
		for (KidsForm kid : kidsForms) {
			KidsDetails k = new KidsDetails();
			BeanUtils.copyProperties(kid, k);
			kids.add(k);
		}
		List<KidsDetails> saveAll = kidsRepo.saveAll(kids);
		if (saveAll != null) {
			return "Kids Data saved successfully";
		}
		return "Kids Data not saved successfully";

	}

	@Override
	public IncomeDetails getIncomeData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EducationDetails getIEduData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<KidsDetails> getKidsData() {
		// TODO Auto-generated method stub
		return null;
	}

}

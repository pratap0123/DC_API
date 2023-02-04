package com.pd.service;

import java.util.List;

import com.pd.binding.EducationForm;
import com.pd.binding.IncomeForm;
import com.pd.binding.KidsForm;
import com.pd.binding.PlanSelectionForm;
import com.pd.entity.EducationDetails;
import com.pd.entity.IncomeDetails;
import com.pd.entity.KidsDetails;
import com.pd.entity.PlanName;

public interface DataCollectionService {

	public String createCase(Long appId);

	public List<PlanName> getPlans();

	public String craetePlan(PlanSelectionForm planSelectionForm);

	public String createIncome(IncomeForm incomeForm);

	public String createEducation(EducationForm educationForm);

	public String createKids(List<KidsForm> kidsForm);

	public IncomeDetails getIncomeData();

	public EducationDetails getIEduData();

	public List<KidsDetails> getKidsData();

}

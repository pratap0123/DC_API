package com.pd.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "PLAN_SELECTION")
@Data
public class PlanSelection {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long caseNo;
	private String planName;

	@OneToOne(targetEntity = IncomeDetails.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "caseNo", referencedColumnName = "caseNo")
	private IncomeDetails incomeDetails;

	@OneToOne(targetEntity = EducationDetails.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "caseNo", referencedColumnName = "caseNo")
	private EducationDetails educationDetails;

	@OneToMany(targetEntity = KidsDetails.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "caseNo", referencedColumnName = "caseNo")
	private List<KidsDetails> kidsDetails;
}

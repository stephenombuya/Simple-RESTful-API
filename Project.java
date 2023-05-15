package com.Springpro.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "projects")
@AllArgsConstructor
@NoArgsConstructor
	       public class Project {
		    	     @Id
		    	     @Column(name="ID")
		    	     @GeneratedValue(strategy = GenerationType.IDENTITY)
		    	     private int id;

		    	     @JsonProperty("project_name")
		    	     @Column(name="PROJECT_NAME")
		    	     private String project_name;

		    	     @JsonProperty("ministry")
		    	     @Column(name="MINISTRY")
		    	     private String ministry;
		    	     
		    	     @JsonProperty("")
		    	     @Column(name="DISTRICT")
		    	     private String district;
		    	     
		    	     @JsonProperty("county")
		    	     @Column(name="COUNTY")
		    	     private String county;
		    	     
		    	     @JsonProperty("sub_county")
		    	     @Column(name="SUB_COUNTY")
		    	     private String subCounty;
		    	     
		    	     @JsonProperty("parish")
		    	     @Column(name="PARISH")
		    	     private String parish;
		    	     
		    	     @JsonProperty("village")
		    	     @Column(name="VILLAGE")
		    	     private String village;
		    	     
		    	     @JsonProperty("scheduled_completion_date")
		    	     @Column(name="SCHEDULED_COMPLETION_DATE")
		    	     private String scheduledCompletionDate;
		    	     
		    	     @JsonProperty("project_completion_date")
		    	     @Column(name="PROJECT_COMPLETION_DATE")
		    	     private String projectCompletionDate;
		    	     
		    	     @JsonProperty("project_total_budget")
		    	     @Column(name="PROJECT_TOTAL_BUDGET")
		    	     private int projectTotalBudget;
		    	     
		    	     @JsonProperty("sponsor_name")
		    	     @Column(name="SPONSOR_NAME")
		    	     private String sponsorName;
		    	     
		    	     @JsonProperty("sponsor_contribution")
		    	     @Column(name="SPONSOR_CONTRIBUTION")
		    	     private int sponsorContribution;
		    	     
		    	     @JsonProperty("project_milestone_title")
		    	     @Column(name="PROJECT_MILESTONE_TITLE") 
		    	     private String projectMilestoneTitle;
		    	     
		    	     @JsonProperty("project_milestone_completion_date")
		    	     @Column(name="PROJECT_MILESTONE_COMPLETION_DATE")
		    	     private String projectMilestoneCompletionDate;
		    	     
		    	     @JsonProperty("project_milestone_percentage")
		    	     @Column(name="PROJECT_MILESTONE_PERCENTAGE")
		    	     private String projectMilestonePercentage;
		    	     
		    	     @JsonProperty("scheduled_planning_deadline")
		    	     @Column(name="SCHEDULED_PLANNING_DEADLINE")
		    	     private String scheduledPlanningDeadline;
		 
		    	     @JsonProperty("project_planning_deadline")
		    	     @Column(name="PROJECT_PLANNING_DEADLINE") 
		    	     private String projectPlanningDeadline;
		    	     
		    	     @JsonProperty("scheduled_design_deadline")
		    	     @Column(name="SCHEDULED_DESIGN_DEADLINE")
		    	     private String scheduledDesignDeadline;
		    	     
		    	     @JsonProperty("project_design_deadline")
		    	     @Column(name="PROJECT_DESIGN_DEADLINE")
		    	     private String projectDesignDeadline;
		    	     
		    	     @JsonProperty("scheduled_implementation_deadline")
		    	     @Column(name="SCHEDULED_IMPLEMENTATION_DEADLINE")
		    	     private String scheduledImplementationDeadline;

		    	     @JsonProperty("project_implementation_deadline")
		    	     @Column(name="PROJECT_IMPLEMENTATION_DEADLINE")
		    	     private String projectImplementationDeadline;
		    	     
		    	     @JsonProperty("scheduled_testing_deadline")
		    	     @Column(name="SCHEDULED_TESTING_DEADLINE")
		    	     private String scheduledTestingDeadline;
		    	     
		    	     @JsonProperty("project_testing_deadline")
		    	     @Column(name="PROJECT_TESTING_DEADLINE")
		    	     private String projectTestingDeadline;
		    	     
		    	     @JsonProperty("scheduled_monitoring_deadline")
		    	     @Column(name="SCHEDULED_MONITORING_DEADLINE")
		    	     private String scheduledMonitoringDeadline;

		    	     @JsonProperty("project_monitoring_deadline")
		    	     @Column(name="PROJECT_MONITORING_DEADLINE")
		    	     private String projectMonitoringDeadline;
		  
		    	 }

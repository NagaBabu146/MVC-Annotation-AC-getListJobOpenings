package com.nt.bo;
//Data
public class JobsInfoBO {
	
	private Integer jobId;
	private String company;
	private String salaryRange;
	private Integer openings;
	private String role;
	private String location;
	public JobsInfoBO() {
		super();
		System.out.println("JobsInfoBO.JobsInfoBO()");
	}
	public Integer getJobId() {
		return jobId;
	}
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getSalaryRange() {
		return salaryRange;
	}
	public void setSalaryRange(String salaryRange) {
		this.salaryRange = salaryRange;
	}
	public Integer getOpenings() {
		return openings;
	}
	public void setOpenings(Integer openings) {
		this.openings = openings;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "JobsInfoBO [jobId=" + jobId + ", company=" + company + ", salaryRange=" + salaryRange + ", openings="
				+ openings + ", role=" + role + ", location=" + location + "]";
	}
	
	
	
	

}

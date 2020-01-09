package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.dto.JobsInfoDTO;
import com.nt.service.ListOpeningsService;

@Controller
public class JobOpeningsController {

	@Autowired
	private ListOpeningsService service;

	public JobOpeningsController() {
		System.out.println("JobOpeningsController.JobOpeningsController()");
	}

	@RequestMapping("/home.htm")
	public String homePage() {

		return "welcome";
	}

	@RequestMapping("/jobs.htm")
	public String displayOpenings(Map<String, Object> map) {
		List<JobsInfoDTO> listDTO = null;
		//use service
		listDTO = service.fetchAllOpenings();
		map.put("result", listDTO);
		return "list_jobs";

	}
}

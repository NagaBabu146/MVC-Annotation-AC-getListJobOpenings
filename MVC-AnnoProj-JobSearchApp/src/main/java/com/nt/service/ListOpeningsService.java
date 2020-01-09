package com.nt.service;

import java.util.List;

import com.nt.dto.JobsInfoDTO;

public interface ListOpeningsService {

	public List<JobsInfoDTO> fetchAllOpenings();
}

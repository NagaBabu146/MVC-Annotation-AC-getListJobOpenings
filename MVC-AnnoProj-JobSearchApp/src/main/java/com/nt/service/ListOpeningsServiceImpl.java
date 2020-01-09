package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.JobsInfoBO;
import com.nt.dao.ListJobsDetailsDAO;
import com.nt.dto.JobsInfoDTO;
@Service("jobService")
public class ListOpeningsServiceImpl implements ListOpeningsService {
	
	@Autowired
	private ListJobsDetailsDAO dao;
    public ListOpeningsServiceImpl() {
    System.out.println("ListOpeningsServiceImpl.ListOpeningsServiceImpl()");	
}
	@Override
	public List<JobsInfoDTO> fetchAllOpenings() {
		List<JobsInfoBO> listBO = null;
		List<JobsInfoDTO> listDTO = null;
		JobsInfoDTO dto = null;
		
		//use dao
		listBO = dao.getAllJobsDetails();

		//convert listbo to listdto

		listDTO = new ArrayList();

		for (JobsInfoBO bo : listBO) {
			dto = new JobsInfoDTO();
			BeanUtils.copyProperties(bo, dto);
			listDTO.add(dto);
		}
		return listDTO;
	}

}

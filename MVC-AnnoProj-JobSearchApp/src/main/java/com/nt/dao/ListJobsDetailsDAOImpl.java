package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.nt.bo.JobsInfoBO;

@Repository("jobDAO")
public class ListJobsDetailsDAOImpl implements ListJobsDetailsDAO {

	private static final String GET_ALL_JOBSINFO = "SELECT JOBID,COMPANY,SALARYRANGE,OPENINGS,ROLE,LOCATION FROM JOBS_INFO";

	@Autowired
	private JdbcTemplate jt;

	public ListJobsDetailsDAOImpl() {
		System.out.println("ListJobsDetailsDAOImpl.ListJobsDetailsDAOImpl()");
	}

	@Override
	public List<JobsInfoBO> getAllJobsDetails() {
		List<JobsInfoBO> listBO = null;
		//use jt 
		listBO = (List<JobsInfoBO>) jt.query(GET_ALL_JOBSINFO,
				new RowMapperResultSetExtractor(new BeanPropertyRowMapper(JobsInfoBO.class)));
		return listBO;

		/*listBO=jt.query(GET_ALL_JOBSINFO, new ResultSetExtractor<List<JobsInfoBO>>() {
		
			@Override
			public List<JobsInfoBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<JobsInfoBO> list =new ArrayList();
				while(rs.next()) {
					JobsInfoBO bo = new JobsInfoBO(rs.getInt(1),rs.getString(2),rs.getString(3),
							                       rs.getInt(4), rs.getString(5),rs.getString(6));                     
				list.add(bo);
				}//while
				return list;
			}//extractData(-)	
		}//anymous inner class*/

	}

}

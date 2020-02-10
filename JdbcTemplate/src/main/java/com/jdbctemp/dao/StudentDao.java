package com.jdbctemp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jdbctemp.model.Student;

@Repository("studentDao") 
public class StudentDao {
	    
    JdbcTemplate template;
	
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	 
    public List<Student>  getAllStudents() {   	
   	   List<Student> stidents=template.query("select * from Student",new RowMapper()){
   		      public Object  mapRow(ResultSet rs,int rowNum)throws SQLException{
   		    	  Student std=new Student();
   		    	  std.setSid((rs.getInt("sid")));
   		    	  std.setAge((rs.getString("age")));
   		    	  std.setName(rs.getInt("name"));
   		    	  std.setNumber((rs.getInt()))
   		    	  
   		      }
   	   }
    	
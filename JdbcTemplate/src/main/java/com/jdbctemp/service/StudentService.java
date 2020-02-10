package com.jdbctemp.service;

import com.jdbctemp.dao.StudentDao;

@Service
public class StudentService {
 @Autowired
  StudentDao studentdao;
  
  public List<Students> getAllStudents(){
	  return studentdao.getAllStudents();
  }
 
}

package com.endPointTech.springJDBC;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void saveStudent(Student st) {
		String query="insert into students values("+st.getId()
						+",'"+st.getName()+"','"+st.getDepartment()+"')";
		jdbcTemplate.update(query);
	}
	public void deleteStudent(int id) {
		String query = "delete from students where id = "+id;
		jdbcTemplate.update(query);
	}
}

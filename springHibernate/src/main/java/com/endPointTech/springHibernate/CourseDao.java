package com.endPointTech.springHibernate;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class CourseDao {
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public void saveCourse(Course c) {
		hibernateTemplate.save(c);
	}
	public void deleteCourse(Course c) {
		hibernateTemplate.delete(c);
	}
	public void updateCourse(Course c) {
		hibernateTemplate.update(c);
	}
	
}

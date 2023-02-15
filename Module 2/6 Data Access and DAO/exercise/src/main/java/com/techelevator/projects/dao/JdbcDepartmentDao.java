package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;

public class JdbcDepartmentDao implements DepartmentDao {
	
	private final JdbcTemplate jdbcTemplate;

	public JdbcDepartmentDao(DataSource dataSource) {

		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Department getDepartment(int id) {
		Department department = null;
		String sql =
				"SELECT department_id, name FROM department " +
						"WHERE department_id = ?;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);

		if (results.next()) {
			department = mapRowToDepartment(results);
			return department;
		}
		return null;
	}

	@Override
	public List<Department> getAllDepartments() {
		List<Department> department = new ArrayList<>();
		String sql = "SELECT department_id, name FROM department;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			department.add(mapRowToDepartment(results));
		}
		return department;
	}

	@Override
	public void updateDepartment(Department updatedDepartment) {
		String updateDepartmentSql = "UPDATE department SET name = ? " +
				"WHERE department_id = ?;";
		int numberOfRowsUpdated =
				jdbcTemplate.update(updateDepartmentSql, updatedDepartment.getName(), updatedDepartment.getId());
	}

	private Department mapRowToDepartment(SqlRowSet results) {
		Department department = new Department();
		department.setId(results.getInt("department_id"));
		department.setName(results.getString("name"));
		return department;
	}

}

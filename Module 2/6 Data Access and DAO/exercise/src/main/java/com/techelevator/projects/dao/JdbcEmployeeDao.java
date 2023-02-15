package com.techelevator.projects.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.Project;
import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcEmployeeDao implements EmployeeDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcEmployeeDao(DataSource dataSource) {

		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employee = new ArrayList<>();
		String sql = "SELECT employee_id, department_id, first_name, last_name, birth_date, hire_date FROM employee;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			employee.add(mapRowToEmployee(results));
		}
		return employee;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		List<Employee> searchByName = new ArrayList<>();
		String sql = "";
		System.out.println(firstNameSearch + " " + lastNameSearch);

		if (firstNameSearch.length() == 0) {
			System.out.println(1);
			sql = "SELECT * FROM employee " +
					"WHERE last_name ILIKE '%" + lastNameSearch + "%';";
		}

		else if (lastNameSearch.length() == 0) {
			System.out.println(2);
			sql = "SELECT * FROM employee " +
					"WHERE first_name ILIKE '%" + firstNameSearch + "%';";
		}

		else {
			System.out.println(3);
			sql = "SELECT * FROM employee " +
					"WHERE first_name ILIKE '%" + firstNameSearch + "%' " +
					"AND last_name ILIKE '%" + lastNameSearch + "%';";
		}

		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

		while (results.next()) {
			searchByName.add(mapRowToEmployee(results));
		}
		return searchByName;
	}

	@Override
	public List<Employee> getEmployeesByProjectId(int projectId) {
		List<Employee> employee = new ArrayList<>();
		String sql = "SELECT * FROM employee " +
				"JOIN project_employee ON project_employee.employee_id = employee.employee_id " +
				"WHERE project_id = ?;";

		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, projectId);
		while (results.next()) {
			employee.add(mapRowToEmployee(results));
		}
		return employee;
	}

	@Override
	public void addEmployeeToProject(int projectId, int employeeId) {
		String sql = "INSERT INTO project_employee (project_id, employee_id) " +
			"VALUES (?, ?)";
		int numberOfRowsUpdated = jdbcTemplate.update(sql, projectId, employeeId);
	}

	@Override
	public void removeEmployeeFromProject(int projectId, int employeeId) {
		// Delete project foreign key references to projectID
		String deleteReferences = "DELETE FROM project_employee WHERE employee_id = ? AND project_id = ?;";
		jdbcTemplate.update(deleteReferences, employeeId, projectId);
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		List<Employee> employee = new ArrayList<>();
		String sql = "SELECT * FROM employee " +
				"WHERE employee_id NOT IN (SELECT employee_id FROM project_employee);";

		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

		while (results.next()) {
			employee.add(mapRowToEmployee(results));
		}
		return employee;
	}

	private Employee mapRowToEmployee(SqlRowSet results) {
		Employee employee = new Employee();
		employee.setId(results.getInt("employee_id"));
		employee.setFirstName(results.getString("first_name"));
		employee.setLastName(results.getString("last_name"));

		LocalDate BirthDate = null;
		if (results.getDate("birth_date") != null) {
			employee.setBirthDate(results.getDate("birth_date").toLocalDate());
		}

		LocalDate HireDate = null;
		if (results.getDate("hire_date") != null) {
			employee.setHireDate(results.getDate("hire_date").toLocalDate());
		}

		employee.setDepartmentId(results.getInt("department_id"));

		return employee;
	}

}

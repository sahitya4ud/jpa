package com.example.jpa.insertintojdbc;

import com.example.jpa.dto.Employee;
import com.example.jpa.dto.Project;

import java.sql.*;
import java.util.List;

public class JDBCParentChildInsertService {




        public int getMaxId(String query) {
            int max = 0;
            Connection connection = null;
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonar", "root", "root");
                preparedStatement = connection.prepareStatement(query);
                resultSet = preparedStatement.executeQuery();

                if (resultSet != null && resultSet.next()) {
                    max = resultSet.getInt(1) + 1;
                } else {
                    max = 1;
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (resultSet != null) resultSet.close();
                    if (preparedStatement != null) preparedStatement.close();
                    if (connection != null) connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            return max;
        }

        public void insertEmp(Employee employee) {
            Connection connection = null;
            PreparedStatement preparedStatement = null;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonar", "root", "root");

                preparedStatement = connection.prepareStatement(
                        "INSERT INTO employee_latest(id, name, salary, dept, pid) VALUES(?,?,?,?,?)"
                );

                preparedStatement.setInt(1, employee.getId());
                preparedStatement.setString(2, employee.getName());
                preparedStatement.setDouble(3, employee.getSalary());
                preparedStatement.setString(4, employee.getDept());
                preparedStatement.setInt(5, employee.getPid());

                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Insert is successful...");
                } else {
                    System.out.println("Insert failed.");
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (preparedStatement != null) preparedStatement.close();
                    if (connection != null) connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        public void insertProject(Project project) {
            Connection connection = null;
            PreparedStatement preparedStatement = null;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonar", "root", "root");

                preparedStatement = connection.prepareStatement(
                        "INSERT INTO project_latest(id, startdate, enddate, pname) VALUES(?,?,?,?)"
                );

                preparedStatement.setInt(1, project.getId());
                preparedStatement.setDate(2, new Date(project.getStartdate().getTime()));
                preparedStatement.setDate(3, new Date(project.getEnddate().getTime()));
                preparedStatement.setString(4, project.getPname());

                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Insert Project is successful...");
                } else {
                    System.out.println("Insert Project is failed");
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (preparedStatement != null) preparedStatement.close();
                    if (connection != null) connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        public void saveProjectEmp(List<Project> listofprojects) {
            for (Project project : listofprojects) {
                int maxIdOfProjectId = getMaxId("SELECT MAX(id) FROM project_latest");
                project.setId(maxIdOfProjectId);

                insertProject(project);

                project.getEmployeeList().forEach(emp -> {
                    int maxIdOfEmpId = getMaxId("SELECT MAX(id) FROM employee_latest");
                    emp.setId(maxIdOfEmpId);
                    emp.setPid(project.getId());
                    insertEmp(emp);
                });
 }
}
    }


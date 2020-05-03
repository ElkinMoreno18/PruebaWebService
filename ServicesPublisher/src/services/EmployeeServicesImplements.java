package services;

import controller.Connect;
import model.Employee;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class EmployeeServicesImplements {

    public EmployeeServicesImplements() {
    }

    public String save(Employee employee) {
        String message = null;
        try {
            Connect c = new Connect();
            Connection connection = c.createConnection();
            String query = "insert into employees (identify, name,last_name,birthday,phone,email,address) values(?,?,?,?,?,?,?)";
            PreparedStatement exe = connection.prepareStatement(query);
            exe.setInt(1, (int) employee.getDocument());
            exe.setString(2, employee.getName());
            exe.setString(3, employee.getLastName());
            ////////////////////////////////////////////////////////////
            java.util.Date newDate = employee.getBirthday();
            java.sql.Date sDate = convertUtilToSql(newDate);
            new SimpleDateFormat("dd/MM/YYYY").format(sDate);
            /////////////////////////////////////////////////////////////
            exe.setDate(4, sDate);
            exe.setBigDecimal(5, employee.getPhone());
            exe.setString(6, employee.getEmail());
            exe.setString(7, employee.getAddress());
            exe.executeUpdate();
            exe.close();
            message = "El empleado ha sido creado";
        } catch (SQLException | ClassNotFoundException e) {
            message = "Error";
            e.printStackTrace();
        }
        return message;
    }


    private static java.sql.Date convertUtilToSql(java.util.Date uDate) {
        return new Date(uDate.getTime());
    }

    public List<Employee> findAll() {
        List<Employee> employeeList = new ArrayList<Employee>();
        try {
            Connect c = new Connect();
            Connection connection = c.createConnection();
            String query = "select * from employees";
            PreparedStatement exe = connection.prepareStatement(query);
            ResultSet result = exe.executeQuery();
            while (result.next()) {
                Employee employee = new Employee();
                employee.setDocument(result.getInt(2));
                employee.setName(result.getString(3));
                employee.setLastName(result.getString(4));
                employee.setBirthday(result.getDate(5));
                employee.setPhone(result.getBigDecimal(6));
                employee.setEmail(result.getString(7));
                employee.setAddress(result.getString(8));
                employeeList.add(employee);
            }
            exe.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return employeeList;
    }
}

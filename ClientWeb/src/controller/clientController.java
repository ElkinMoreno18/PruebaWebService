package controller;

import com.google.gson.Gson;
import services.Employee;
import services.EmployeeWebService;
import services.EmployeeWebService_Service;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

@WebServlet(name = "clientController", urlPatterns = "/client.do")
public class clientController extends HttpServlet {

    EmployeeWebService service = new EmployeeWebService_Service().getPort(EmployeeWebService.class);

    // crear empleado //
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Employee employee = new Employee();
        employee.setDocument(Long.parseLong(request.getParameter("identify")));
        employee.setName(request.getParameter("name"));
        employee.setLastName(request.getParameter("lastName"));
        employee.setPhone(new BigDecimal(request.getParameter("phone")));
        employee.setAddress(request.getParameter("address"));
        employee.setEmail(request.getParameter("email"));
        employee.setBirthday(Date.valueOf(request.getParameter(("birthday"))));
        service.create(employee);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Gson gson = new Gson();
        List<Employee> list = service.list();
        String data = gson.toJson(list);
        response.setContentType("application/json");
        response.getWriter().write(data);
    }



}

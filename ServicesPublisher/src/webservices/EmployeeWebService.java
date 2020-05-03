package webservices;

import model.Employee;
import services.EmployeeServicesImplements;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.List;

@WebService(serviceName = "EmployeeWebService")
public class EmployeeWebService {

    EmployeeServicesImplements employeeServicesImplements = new EmployeeServicesImplements();

    @WebMethod(operationName = "create")
    public String create(@WebParam(name = "employee") Employee employee) {
        return employeeServicesImplements.save(employee);
    }

    @WebMethod(operationName = "list")
    public List<Employee> list() {
        return employeeServicesImplements.findAll();
    }

    @WebMethod(operationName = "sumar")
    public int sumar(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        return num1 + num2;
    }

//    public static void main(String[] argv) {
//        Object implementor = new EmployeeWebService();
//        String address = "http://localhost:8090/ServicesPublisher/EmployeeWebService";
//        Endpoint.publish(address, implementor);
//    }
}

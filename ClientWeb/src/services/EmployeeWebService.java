
package services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EmployeeWebService", targetNamespace = "http://webservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EmployeeWebService {


    /**
     * 
     * @param employee
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "create", targetNamespace = "http://webservices/", className = "services.Create")
    @ResponseWrapper(localName = "createResponse", targetNamespace = "http://webservices/", className = "services.CreateResponse")
    @Action(input = "http://webservices/EmployeeWebService/createRequest", output = "http://webservices/EmployeeWebService/createResponse")
    public String create(
        @WebParam(name = "employee", targetNamespace = "")
        Employee employee);

    /**
     * 
     * @return
     *     returns java.util.List<services.Employee>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "list", targetNamespace = "http://webservices/", className = "services.List")
    @ResponseWrapper(localName = "listResponse", targetNamespace = "http://webservices/", className = "services.ListResponse")
    @Action(input = "http://webservices/EmployeeWebService/listRequest", output = "http://webservices/EmployeeWebService/listResponse")
    public List<Employee> list();

    /**
     * 
     * @param num1
     * @param num2
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sumar", targetNamespace = "http://webservices/", className = "services.Sumar")
    @ResponseWrapper(localName = "sumarResponse", targetNamespace = "http://webservices/", className = "services.SumarResponse")
    @Action(input = "http://webservices/EmployeeWebService/sumarRequest", output = "http://webservices/EmployeeWebService/sumarResponse")
    public int sumar(
        @WebParam(name = "num1", targetNamespace = "")
        int num1,
        @WebParam(name = "num2", targetNamespace = "")
        int num2);

}

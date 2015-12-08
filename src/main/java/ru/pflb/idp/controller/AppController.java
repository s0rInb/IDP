package ru.pflb.idp.controller;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

import javax.jws.WebParam;
import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

//import ru.pflb.idp.model.Employee;
import ru.pflb.idp.model.User;
//import ru.pflb.idp.service.EmployeeService;
import ru.pflb.idp.service.UserService;

@Controller
//@RequestMapping("/")
public class AppController {
    final Logger logger = LoggerFactory.getLogger(AppController.class);

	@Autowired
	UserService userService;

//	@Autowired
//	EmployeeService service;
//
//	@Autowired
//	MessageSource messageSource;


//	@RequestMapping(method = RequestMethod.GET, value = "/users", produces = "application/json")
//	public String listUsers(ModelMap model){
//        List<User> users = userService.findAllUsers();
//        model.addAttribute("users", users);
//		return "allusers";
//	}

    @RequestMapping(method = RequestMethod.GET, value = "/usersAll", produces = "application/json")
    @ResponseBody
    public Response getUsers(HttpServletRequest request)
//                             @RequestParam(value = "start", required = false) int start,
//                             @RequestParam(value = "length", required = false) int rows,
//                             @RequestParam(value = "order[0][column]", required = false) int orderColNum,
//                             @RequestParam(value = "order[0][dir]", required = false) String order)
            throws IOException{
//        int page = start / rows;

//        String sortBy = request.getParameter("columns[" + orderColNum + "][data]");
//        logger.info("Listing users for grid with page: {}, rows: {}", page + 1, rows);
//        logger.info("Listing users for grid with sort: {}, order: {}", sortBy, order);
//        Sort sort = null;
//        if (order != null) {
//            if (order.equals("desc")) {
//                sort = new Sort(Sort.Direction.DESC, sortBy);
//            } else
//                sort = new Sort(Sort.Direction.ASC, sortBy);
//        }
//        PageRequest pageRequest;
//        if (sort != null) {
//            pageRequest = new PageRequest(page, rows, sort);
//        } else {
//            pageRequest = new PageRequest(page, rows);
//        }
//        Page<User> result = null;
//        result = userService.findAllByPage(pageRequest);
        Response response = new Response();
        response.setData(userService.findList());
//        response.setDraw(Integer.parseInt(request.getParameter("draw")));
//        response.setRecordsFiltered((int) result.getTotalElements());
//        response.setRecordsTotal(result.getTotalElements());
//        response.setData(result.getContent());
        return response;
    }

//	/*
//	 * This method will list all existing employees.
//	 */
//	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
//	public String listEmployees(ModelMap model) {
//
//		List<Employee> employees = service.findAllEmployees();
//		model.addAttribute("employees", employees);
//		return "allemployees";
//	}
//
//	/*
//	 * This method will provide the medium to add a new employee.
//	 */
//	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
//	public String newEmployee(ModelMap model) {
//		Employee employee = new Employee();
//		model.addAttribute("employee", employee);
//		model.addAttribute("edit", false);
//		return "registration";
//	}
//
//	/*
//	 * This method will be called on form submission, handling POST request for
//	 * saving employee in database. It also validates the user input
//	 */
//	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
//	public String saveEmployee(@Valid Employee employee, BindingResult result,
//			ModelMap model) {
//
//		if (result.hasErrors()) {
//			return "registration";
//		}
//
//		/*
//		 * Preferred way to achieve uniqueness of field [ssn] should be implementing custom @Unique annotation
//		 * and applying it on field [ssn] of Model class [Employee].
//		 *
//		 * Below mentioned peace of code [if block] is to demonstrate that you can fill custom errors outside the validation
//		 * framework as well while still using internationalized messages.
//		 *
//		 */
//		if(!service.isEmployeeSsnUnique(employee.getId(), employee.getSsn())){
//			FieldError ssnError =new FieldError("employee","ssn",messageSource.getMessage("non.unique.ssn", new String[]{employee.getSsn()}, Locale.getDefault()));
//		    result.addError(ssnError);
//			return "registration";
//		}
//
//		service.saveEmployee(employee);
//
//		model.addAttribute("success", "Employee " + employee.getName() + " registered successfully");
//		return "success";
//	}
//
//
//	/*
//	 * This method will provide the medium to update an existing employee.
//	 */
//	@RequestMapping(value = { "/edit-{ssn}-employee" }, method = RequestMethod.GET)
//	public String editEmployee(@PathVariable String ssn, ModelMap model) {
//		Employee employee = service.findEmployeeBySsn(ssn);
//		model.addAttribute("employee", employee);
//		model.addAttribute("edit", true);
//		return "registration";
//	}
//
//	/*
//	 * This method will be called on form submission, handling POST request for
//	 * updating employee in database. It also validates the user input
//	 */
//	@RequestMapping(value = { "/edit-{ssn}-employee" }, method = RequestMethod.POST)
//	public String updateEmployee(@Valid Employee employee, BindingResult result,
//			ModelMap model, @PathVariable String ssn) {
//
//		if (result.hasErrors()) {
//			return "registration";
//		}
//
//		if(!service.isEmployeeSsnUnique(employee.getId(), employee.getSsn())){
//			FieldError ssnError =new FieldError("employee","ssn",messageSource.getMessage("non.unique.ssn", new String[]{employee.getSsn()}, Locale.getDefault()));
//		    result.addError(ssnError);
//			return "registration";
//		}
//
//		service.updateEmployee(employee);
//
//		model.addAttribute("success", "Employee " + employee.getName()	+ " updated successfully");
//		return "success";
//	}
//
//
//	/*
//	 * This method will delete an employee by it's SSN value.
//	 */
//	@RequestMapping(value = { "/delete-{ssn}-employee" }, method = RequestMethod.GET)
//	public String deleteEmployee(@PathVariable String ssn) {
//		service.deleteEmployeeBySsn(ssn);
//		return "redirect:/list";
//	}

}

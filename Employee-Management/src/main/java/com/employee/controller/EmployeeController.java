package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employee.entity.Department;
import com.employee.entity.Employee;
import com.employee.sercive.DepartmentService;
import com.employee.sercive.EmployeeService;

import org.springframework.ui.Model;
@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
		@Autowired
		private DepartmentService departmentService;
		
		
	@GetMapping("/add")
	public String addForm(Model model) {
	System.out.println("addform called");
	model.addAttribute("employee",new Employee());//Creates empty object → used in form
	List<Department>deptList=departmentService.getAllDepartments();
	model.addAttribute("departments",deptList);//controller to view
	return "add";
	}
	
	
	@PostMapping("/save")
	public String save(@ModelAttribute Employee emp,Model model) {
		
		
		 boolean hasError = false;

		    if (emp.getName() == null || emp.getName().trim().isEmpty()) {
		        model.addAttribute("nameError", "Name is required !");
		        hasError = true;
		    }

		    if (emp.getEmail() == null || emp.getEmail().trim().isEmpty()) {
		        model.addAttribute("emailError", "Email is required !");
		        hasError = true;
		    }

		    if (emp.getSalary() == null||emp.getSalary() == 0) {
		        model.addAttribute("salaryError", "Salary is required !");
		        hasError = true;
		    }

		    if (emp.getDepartment() == null || emp.getDepartment().getId() == null) {
		        model.addAttribute("deptError", "Select department !");
		        hasError = true;
		    }

		    if (hasError) {
		        
		        return "add";
		    }
		employeeService.saveEmployee(emp);
		System.out.println("save form called");
		return "redirect:/employee/view";
	}
	
	
	
	
	
	@GetMapping("/view")
	public String view(Model model) {
		model.addAttribute("employees",employeeService.getAllEmployees())	;
	return "view";
		
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id) {// @PathVariable Extracts 5 from URL
		System.out.println("delete form called");
		employeeService.deleteEmployee(id);

		return "redirect:/employee/view";
	}
	
	
	@GetMapping("/edit/{id}")//Fetch data
	public String edit(@PathVariable int id,Model model) {
		model.addAttribute("employee",employeeService.getEmployeeById(id));
        List<Department> deptList = departmentService.getAllDepartments();

		model.addAttribute("departments",deptList);
		System.out.println("edit form called");
		
		return "edit";
		
		
		
	}
	@PostMapping("/update")//Submit form
    public String update(@ModelAttribute Employee emp) {
		 employeeService.updateEmployee(emp);
        return "redirect:/employee/view";
    }
}

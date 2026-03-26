package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employee.entity.Department;
import com.employee.sercive.DepartmentService;

@Controller
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
    private DepartmentService departmentService;
	
	
	 @GetMapping("/add")
	    public String addForm(Model model) {
		 System.out.println("dept add callse");
		 model.addAttribute("department", new Department());
		 List<Department> list = departmentService.getAllDepartments();
		    model.addAttribute("departments", list);
		    System.out.println(list);
	        return "add-dept";
	    }
	    // 💾 Save
	    @PostMapping("/save")
	    public String save(@ModelAttribute Department dept,Model model) {
	    	System.out.println("dept save callse");
	    	boolean hasError = false;

	        if (dept.getName() == null || dept.getName().trim().isEmpty()) {
	            model.addAttribute("deptNameError", "Department name is required !");
	            hasError = true;
	        }

	        if (hasError) {
	            return "add-dept";
	        }
	    	departmentService.saveDepartment(dept);
	        return "redirect:/department/view";
	    }
	    // 📋 View all
	    @GetMapping("/view")
	    public String view(Model model) {
	       System.out.println("dept view callse");
	       List<Department> list = departmentService.getAllDepartments();
	        model.addAttribute("departments", list);
	        return "view-dept";
	    }
	}




package com.example.emp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {
	@GetMapping("/getForm")
	public String getForm() {
		return "employeeFrom";
	}

	@PostMapping("/saveDetails") // it only support post method
	public String saveDetails(@RequestParam("employeeName") String employeeName,
			@RequestParam("employeeEmail") String employeeEmail, ModelMap modelMap) {
		// write your code to save details
		modelMap.put("employeeName", employeeName);
		modelMap.put("employeeEmail", employeeEmail);
		return "viewDetails"; // welcome is view name. It will call viewDetails.jsp
	}

}

package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.EmployerService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entity.concrete.Employer;

@RestController
@RequestMapping("api/hrms/")
public class EmployersController {
	@Autowired
	private EmployerService employerService;
	
	@GetMapping("/employers")
	public DataResult<List<Employer>> getAll(){
		
		return employerService.getAll();
	}
	@PostMapping("/employers")
	public Result add(@RequestBody Employer employer){
		return employerService.add(employer);
	}


}

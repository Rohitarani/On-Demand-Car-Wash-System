package com.cg.CarWash.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.CarWash.Dto.AccountMessage;
import com.cg.CarWash.Dto.CategoryForm;
import com.cg.CarWash.Dto.UserForm;
import com.cg.CarWash.Entity.User;
import com.cg.CarWash.Entity.WashCategory;
import com.cg.CarWash.Service.CategoryService;
import com.cg.CarWash.Service.UserService;
@RestController
@RequestMapping(value = "/")
public class CategoryController {
	@Autowired
	private CategoryService catservice;

 
@CrossOrigin
	@PostMapping("/addcategory")
	public AccountMessage addCategory(@RequestBody CategoryForm categoryform)  {
		
			String categoryID = catservice.addCategory(categoryform);
			return new AccountMessage("created"+ categoryID);
	   
	}

@GetMapping("/viewAllCategory")
public List<WashCategory> viewAllCategory() {
	return catservice.viewAllCategory();
}
}

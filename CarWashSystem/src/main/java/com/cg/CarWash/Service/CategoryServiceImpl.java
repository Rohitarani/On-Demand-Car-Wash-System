package com.cg.CarWash.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.CarWash.Dao.CarWashDao;
import com.cg.CarWash.Dto.CategoryForm;
import com.cg.CarWash.Entity.Booking;
import com.cg.CarWash.Entity.WashCategory;

@Service("categoryser")
@Transactional
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CarWashDao dao;
	
	@Override
	public String addCategory(CategoryForm categoryform) {
		WashCategory category=new WashCategory();
		category.setCategoryName(categoryform.getCategoryName());
		category.setDescription(categoryform.getDescription());
		category.setCost(categoryform.getCost());
		dao.addCategory(category);
		return "added";
	}

	@Override
	public List<WashCategory> viewAllCategory() {
List<WashCategory>  allcategory= dao.viewAllCategories();
		
		
		return allcategory;
	}



	

}

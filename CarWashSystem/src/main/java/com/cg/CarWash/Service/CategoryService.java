package com.cg.CarWash.Service;

import java.util.List;

import com.cg.CarWash.Dto.BookingForm;
import com.cg.CarWash.Dto.CategoryForm;
import com.cg.CarWash.Entity.Booking;
import com.cg.CarWash.Entity.WashCategory;

public interface CategoryService {
	public String addCategory(CategoryForm categoryform);
	public List<WashCategory> viewAllCategory() ;
}

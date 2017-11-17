package com.example.gifsproject.controller;

import com.example.gifsproject.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/categories")
    public String showCategories(ModelMap modelMap){
        modelMap.addAttribute("categories", categoryRepository.getAll());
        return "categories";
    }
}

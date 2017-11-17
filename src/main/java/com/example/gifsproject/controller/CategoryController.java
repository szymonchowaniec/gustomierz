package com.example.gifsproject.controller;

import com.example.gifsproject.repository.CategoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {

    private static final Logger LOG = LoggerFactory.getLogger(CategoryController.class);


    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/categories")
    public String showCategories(ModelMap modelMap){
        LOG.info("showCategories");
        modelMap.addAttribute("categories", categoryRepository.getAll());
        return "categories";
    }
}

package com.example.gifsproject.repository;

import com.example.gifsproject.model.Category;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepository {

    private List<Category> categories = new ArrayList<>();

    public CategoryRepository() {
        categories.add(new Category(1l, "mems"));
        categories.add(new Category(2l, "android"));
        categories.add(new Category(3l, "sport"));
        categories.add(new Category(4l, "funny"));
    }

    public List<Category> getAll() {
        return categories;
    }
}

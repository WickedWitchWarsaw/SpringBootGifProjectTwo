package pl.akademiakodu.giflib.repository;

import pl.akademiakodu.giflib.model.Category;

import java.util.List;

/**
 * Created by ZuZ on 2016-11-19.
 */
public interface CategoryRepository {

    List<Category> findAll();
    Category findById(Long id);
    void save(Category category);
    void delete(Category category);
}

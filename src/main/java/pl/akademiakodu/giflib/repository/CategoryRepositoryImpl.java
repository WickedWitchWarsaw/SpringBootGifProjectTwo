package pl.akademiakodu.giflib.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import pl.akademiakodu.giflib.model.Category;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * Created by ZuZ on 2016-11-19.
 */
public class CategoryRepositoryImpl implements CategoryRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Category> findAll() {
        try (Session session = sessionFactory.openSession()) {
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Category> criteria = builder.createQuery(Category.class);
            criteria.from(Category.class);

            List<Category> categories = session.createQuery(criteria).getResultList();
            return categories;
        }
    }

    @Override
    public Category findById(Long id) {
        return null;
    }

    @Override
    public void save(Category category) {

    }

    @Override
    public void delete(Category category) {

    }
}

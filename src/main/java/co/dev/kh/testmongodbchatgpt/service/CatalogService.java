package co.dev.kh.testmongodbchatgpt.service;

import co.dev.kh.testmongodbchatgpt.document.Catalog;
import co.dev.kh.testmongodbchatgpt.document.Course;
import co.dev.kh.testmongodbchatgpt.repository.CatalogRepository;
import co.dev.kh.testmongodbchatgpt.repository.CategoryRepository;
import co.dev.kh.testmongodbchatgpt.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {
    private final CatalogRepository catalogRepository;
    private final CategoryRepository categoryRepository;
    private final CourseRepository courseRepository;
    @Autowired
    public CatalogService(CatalogRepository catalogRepository, CategoryRepository categoryRepository, CourseRepository courseRepository) {
        this.catalogRepository = catalogRepository;
        this.categoryRepository = categoryRepository;
        this.courseRepository = courseRepository;
    }

    public List<Catalog> getAllCatalogs() {
        return catalogRepository.findAll();
    }

    public Catalog createCatalog(Catalog catalog) {
        return catalogRepository.save(catalog);
    }

    public Catalog addCourseToCatalog(String catalogId, Course course) {
        Catalog catalog = catalogRepository.findById(catalogId).orElse(null);
        if (catalog != null) {
            catalog.getCourses().add(course);
            return catalogRepository.save(catalog);
        }
        return null;
    }
}

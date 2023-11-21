package co.dev.kh.testmongodbchatgpt.controller;

import co.dev.kh.testmongodbchatgpt.document.Catalog;
import co.dev.kh.testmongodbchatgpt.document.Course;
import co.dev.kh.testmongodbchatgpt.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/catalogs")
public class CatalogController {
    private final CatalogService catalogService;

    @Autowired
    public CatalogController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GetMapping
    public List<Catalog> getAllCatalogs() {
        return catalogService.getAllCatalogs();
    }

    @PostMapping
    public Catalog createCatalog(@RequestBody Catalog catalog) {
        return catalogService.createCatalog(catalog);
    }

    @PutMapping("/{catalogId}/addCourse")
    public Catalog addCourseToCatalog(@PathVariable String catalogId, @RequestBody Course course) {
        return catalogService.addCourseToCatalog(catalogId, course);
    }
}

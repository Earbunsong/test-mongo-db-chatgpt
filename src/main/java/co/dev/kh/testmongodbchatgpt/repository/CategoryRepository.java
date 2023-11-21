package co.dev.kh.testmongodbchatgpt.repository;

import co.dev.kh.testmongodbchatgpt.document.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Category,String> {
}

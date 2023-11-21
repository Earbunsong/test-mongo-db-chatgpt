package co.dev.kh.testmongodbchatgpt.repository;

import co.dev.kh.testmongodbchatgpt.document.Catalog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogRepository extends MongoRepository<Catalog,String> {
}

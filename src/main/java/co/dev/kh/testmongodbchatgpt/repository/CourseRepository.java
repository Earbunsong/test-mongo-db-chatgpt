package co.dev.kh.testmongodbchatgpt.repository;

import co.dev.kh.testmongodbchatgpt.document.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends MongoRepository<Course,String> {
}

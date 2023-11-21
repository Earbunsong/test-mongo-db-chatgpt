package co.dev.kh.testmongodbchatgpt.document;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Document(collection = "catalogs")
public class Catalog {
    @Id
    private String id;
    private String name;
    private Set<Category> categories = new HashSet<>();
    @DBRef
    private Set<Course> courses = new HashSet<>();


}

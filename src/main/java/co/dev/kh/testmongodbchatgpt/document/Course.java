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
@Document(collection = "courses")

public class Course {
    @Id
    private String id;
    private String name;
    @DBRef
    private Set<Catalog> catalogs = new HashSet<>();
}

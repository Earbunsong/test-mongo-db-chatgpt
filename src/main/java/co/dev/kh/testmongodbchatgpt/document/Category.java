package co.dev.kh.testmongodbchatgpt.document;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Document(collection = "categories")
public class Category {
    @Id
    private String id;
    private String name;
}

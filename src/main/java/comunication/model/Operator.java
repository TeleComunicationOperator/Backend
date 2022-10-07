package comunication.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Operator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Size(min = 4, max = 255, message = "Minimum name length: 4 characters")
    @Column(unique = true, nullable = false)
    private String name;
    @Size(min = 4, max = 255, message = "Minimum last name length: 4 characters")
    @Column(unique = true, nullable = false)
    private String lastName;
    @Size(min = 8, max = 8)
    @Column(unique = true, nullable = false)
    private String dni;
    @Size(min = 8, max = 8)
    @Column(unique = true, nullable = false)
    private String phone;
    @OneToMany
    private List<KeyWord> keyWordList = new ArrayList<>();
}
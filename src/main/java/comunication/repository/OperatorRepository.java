package comunication.repository;

import comunication.model.Operator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface OperatorRepository extends JpaRepository<Operator,Integer>{
    Optional<Operator> findByEmail(String email);
}

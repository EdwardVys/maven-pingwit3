package pingwit.lec_26.repository;

import org.springframework.data.repository.CrudRepository;
import pingwit.lec_26.entity.Milk;

import java.util.List;


public interface MilkRepository extends CrudRepository<Milk, Long> {

    List<Milk> findAll();
}

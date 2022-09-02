package lastcoder.Entity.Eprate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EprateRepository extends JpaRepository<Eprate, EprateMK>  {

}

package lastcoder.Entity.EmploymentRate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<EmploymentRate, EmploymentrateMK> {

}
